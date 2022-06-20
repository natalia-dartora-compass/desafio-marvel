package com.marvel.desafio.quadrinhos.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@NoArgsConstructor
@Configuration
public class RepositoryProperties {

    @Value("${client.endpoint.lista.quadrinhos}")
    private String listaQuadrinhosEndpoint;

    @Value("${client.endpoint.lista.quadrinhos.timeout}")
    private String listaquadrinhosEndpointTimeout;
}
