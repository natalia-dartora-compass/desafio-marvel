package com.marvel.desafio.quadrinhos.repository;

import com.marvel.desafio.quadrinhos.config.RepositoryProperties;
import com.marvel.desafio.quadrinhos.domain.QuadrinhosDataDomain;
import com.marvel.desafio.quadrinhos.utils.MarvelUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class QuadrinhosRepository {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RepositoryProperties repositoryProperties;
    @Autowired
    public HttpHeaders headers;

    public QuadrinhosDataDomain retornarDadosQuadrinhos() {
        String ts = MarvelUtils.miliSegundos();
        String apikey = MarvelUtils.PUBLIC_KEY;
        String hash = MarvelUtils.retornaHash(ts);

        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(repositoryProperties.getListaQuadrinhosEndpoint())
                .queryParam("ts", "{ts}")
                .queryParam("apikey", "{apikey}")
                .queryParam("hash", "{hash}")
                .encode()
                .toUriString();

        Map<String, String> params = new HashMap<>();
        params.put("ts", ts);
        params.put("apikey", apikey);
        params.put("hash", hash);

        ResponseEntity<QuadrinhosDataDomain> response = restTemplate.exchange(
                urlTemplate,
                HttpMethod.GET,
                entity,
                QuadrinhosDataDomain.class,
                params
        );

        return response.getBody();

    }

}
