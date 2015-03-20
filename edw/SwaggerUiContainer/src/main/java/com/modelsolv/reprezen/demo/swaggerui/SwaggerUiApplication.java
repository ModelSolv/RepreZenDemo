package com.modelsolv.reprezen.demo.swaggerui;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SwaggerUiApplication extends Application<SwaggerUiConfiguration> {
	public static void main(String[] args) throws Exception {
		new SwaggerUiApplication().run(args);
	}

	@Override
	public String getName() {
		return "SwaggerUI";
	}

	@Override
	public void initialize(Bootstrap<SwaggerUiConfiguration> bootstrap) {
		bootstrap.addBundle(new AssetsBundle("/swagger-ui", "/swagger",
				"index.html"));
	}

	@Override
	public void run(SwaggerUiConfiguration configuration,
			Environment environment) throws Exception {
		// prevent com.sun.jersey.api.container.ContainerException: The
		// ResourceConfig instance does not contain any root resource classes.
		// environment.jersey().disable();
		// environment.getApplicationContext().setSessionHandler(new
		// SessionHandler());
		environment.jersey().register(new DummyResource());
	}

}