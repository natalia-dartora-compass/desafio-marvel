package com.marvel.desafio.quadrinhos.service.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuadrinhosDadosResponse {
    private Long codigo;
    private String titulo;
    private String dataModificacao;
    private String numeroDaPagina;
}
