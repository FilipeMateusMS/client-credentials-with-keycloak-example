package com.filipe.client.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.security.oauth2.client.*;
import org.springframework.security.oauth2.client.web.client.OAuth2ClientHttpRequestInterceptor;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }

    @Bean
    RestClient keycloackRestClient(RestClient.Builder builder, OAuth2AuthorizedClientManager authorizedClientManager )
    {
        OAuth2ClientHttpRequestInterceptor requestInterceptor = new OAuth2ClientHttpRequestInterceptor( authorizedClientManager );
        requestInterceptor.setClientRegistrationIdResolver( (HttpRequest request ) -> "client-service" );

        return builder
                .requestInterceptor( requestInterceptor )
                .build();
    }
}
