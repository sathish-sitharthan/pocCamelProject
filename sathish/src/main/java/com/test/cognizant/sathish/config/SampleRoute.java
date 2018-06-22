package com.test.cognizant.sathish.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class SampleRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		rest("/printText").description("Print Text").consumes("application/json").produces("application/json").get()
				.to("direct:printText");

		from("direct:printText").routeId("printText").description("Print Text Desc")
				.to("bean:sampleService?method=printText");

	}

}
