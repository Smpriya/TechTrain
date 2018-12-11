package org.gateway.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
@RestController
public class Application 
{
    public static void main( String[] args )
    {
        System.out.println( "API Gateway is Starting....!" );
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
    
    @Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
}
