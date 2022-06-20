package com.marvel.desafio.quadrinhos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuadrinhosDomain {
    @JsonProperty("id")
    private Long codigo;

    @JsonProperty("title")
    private String titulo;

    @JsonProperty("modified")
    private String dataModificacao;

    @JsonProperty("pageCount")
    private String numeroDaPagina;
}
