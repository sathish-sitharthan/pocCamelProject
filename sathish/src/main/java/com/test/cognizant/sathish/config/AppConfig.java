package com.test.cognizant.sathish.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration().component("jetty").bindingMode(RestBindingMode.json)
				.dataFormatProperty("prettyPrint", "true").contextPath("/beetle").host("localhost")
				.port("8000");

	}

}
