package com.marvel.desafio.quadrinhos.service.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuadrinhosResponse {

    private QuadrinhosDadosResponse quadrinhosDadosResponse;

}
