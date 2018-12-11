package org.account.service;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.account.service")
public class AccountConfiguration {
	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
}
