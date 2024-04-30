package com.leater.manager.config;

import com.leater.manager.client.RestClientProductRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientBeans {

    @Bean
    public RestClientProductRestClient productRestClient(
            @Value("${leater.services.catalogue.uri:http://localhost:8081}")
            String catalogueBaseUri) {
        return new RestClientProductRestClient(RestClient.builder()
                .baseUrl(catalogueBaseUri)
                .build());
    }
}
