package com.modelsolv.reprezen.demo.swaggerui;

import java.io.File;
import java.io.IOException;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.NanoHTTPD.Response.Status;
import fi.iki.elonen.ServerRunner;

public class SwaggerUiServer extends NanoHTTPD {
	public SwaggerUiServer() {
		super(8088);
		System.out.println("Started server on 8080");
	}

	public Response serve(IHTTPSession session) {
		String msg = "";
		ClassLoader classLoader = getClass().getClassLoader();
		String fileName = session.getUri();
		if ("/".equals(fileName)) {
			fileName = "/index.html";
		}
		File file = new File(classLoader.getResource("swagger-ui" + fileName)
				.getFile());
		try {
			msg = Files.toString(file, Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String mimetype = NanoHTTPD.MIME_HTML;
		if (fileName.endsWith(".css")) {
			mimetype = "text/css";
		} else if (fileName.endsWith(".js")) {
			mimetype = "application/x-javascript";
		} else if (fileName.endsWith(".png")) {
			mimetype = "image/png";
		} else if (fileName.endsWith(".woff") || fileName.endsWith(".woff2")
				|| fileName.endsWith(".ttf")) {
			mimetype = "font/opentype";
		}
		return new NanoHTTPD.Response(Status.ACCEPTED, mimetype, msg);
	}

	public static void main(String[] args) {
		ServerRunner.run(SwaggerUiServer.class);
	}
}