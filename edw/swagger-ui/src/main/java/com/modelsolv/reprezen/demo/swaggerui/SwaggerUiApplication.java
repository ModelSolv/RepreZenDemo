package com.modelsolv.reprezen.demo.swaggerui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.NanoHTTPD.Response.Status;

/**
 * @author Konstantin Zaitsev
 * @date Mar 27, 2015
 */
@SuppressWarnings("nls")
public class SwaggerUiApplication {
    private static Map<String, String> MIME_TYPES = new HashMap<String, String>();
    private static Map<String, byte[]> CACHE = new HashMap<>();

    static {
        MIME_TYPES.put("html", "text/html");
        MIME_TYPES.put("css", "text/css");
        MIME_TYPES.put("json", "application/json");
        MIME_TYPES.put("js", "application/javascript");
        MIME_TYPES.put("txt", "plain/text");
        MIME_TYPES.put("png", "image/png");
        MIME_TYPES.put("woff2", "font/opentype");
    }

    public static void main(String[] args) throws Exception {
        final int port = args.length > 0 ? Integer.parseInt(args[0]) : 8082;
        final String swaggerFile = args.length == 2 ? args[1] : "TaxBlaster.json";

        System.out.println("Swagger UI Server CommandLine parameters: ");
        System.out.println("\tjava -jar swaggerui.jar <port> <swagger_api.json>");
        System.out.println("\tby default java -jar swaggerui.jar 8082 TaxBlaster.json");
        if (!new File(swaggerFile).exists()) {
            System.err.println("Swagger File not found: " + swaggerFile);
            return;
        }

        final NanoHTTPD httpd = new NanoHTTPD(port) {
            @Override
            public Response serve(IHTTPSession session) {
                Method method = session.getMethod();
                String uri = session.getUri();
                System.out.println(method + " '" + uri + "' ");
                if (uri.equals("/")) {
                    uri = "/index.html";
                }
                try {
                    if (uri.equals("/swagger/api.json")) {
                        try (InputStream stream = new FileInputStream(new File(swaggerFile))) {
                            CACHE.put(uri, getBytesFromStream(stream));
                        }
                    }

                    try (InputStream stream = this.getClass().getResourceAsStream(uri)) {
                        if (stream != null) {
                            CACHE.put(uri, getBytesFromStream(stream));
                        }
                    }
                    if (CACHE.containsKey(uri)) {
                        return new NanoHTTPD.Response(Status.OK, getMimeType(uri), new ByteArrayInputStream(
                                CACHE.get(uri)));
                    } else {
                        return new NanoHTTPD.Response(Status.NOT_FOUND, MIME_PLAINTEXT, uri);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return new NanoHTTPD.Response(Status.INTERNAL_ERROR, MIME_PLAINTEXT, "Internal error");
                }
            }
        };
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                httpd.stop();
                System.out.println("Swagger UI server stopped");
            }
        });

        httpd.start();
        System.out.println("SwaggerUI server started: port - " + port + ", swagger file - " + swaggerFile);

        while (httpd.isAlive()) {
            Thread.sleep(1000);
        }
    }

    private static String getMimeType(String uri) {
        if (uri.lastIndexOf('.') > 0) {
            String ext = uri.substring(uri.lastIndexOf('.') + 1).toLowerCase();
            if (MIME_TYPES.containsKey(ext)) {
                return MIME_TYPES.get(ext);
            }
        }
        return "text/html";
    }

    private static byte[] getBytesFromStream(InputStream inputStream) throws Exception {
        byte[] buff = new byte[1024];
        int len = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while ((len = inputStream.read(buff)) > 0) {
            out.write(buff, 0, len);
        }
        return out.toByteArray();
    }
}
