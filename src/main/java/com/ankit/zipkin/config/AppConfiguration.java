package com.ankit.zipkin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class AppConfiguration {
	/**
	 * Collect the data from sleuth and provide it to zipkin client
	 * 
	 */
	@Bean
	public Sampler samplerObj() {
		//return Sampler.NEVER_SAMPLE;
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
