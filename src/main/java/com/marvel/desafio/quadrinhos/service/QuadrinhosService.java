package com.marvel.desafio.quadrinhos.service;

import com.marvel.desafio.quadrinhos.domain.QuadrinhosDataDomain;
import com.marvel.desafio.quadrinhos.domain.QuadrinhosDomain;
import com.marvel.desafio.quadrinhos.domain.QuadrinhosListaDomain;
import com.marvel.desafio.quadrinhos.repository.QuadrinhosRepository;
import com.marvel.desafio.quadrinhos.service.response.QuadrinhosDadosResponse;
import com.marvel.desafio.quadrinhos.service.response.QuadrinhosResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuadrinhosService {

    @Autowired
    private QuadrinhosRepository quadrinhosRepository;

    public List<QuadrinhosDadosResponse> retornarQuadrinhos(){
        List<QuadrinhosDadosResponse> result = new ArrayList<>();
        for (QuadrinhosDomain quadrinhosDomain : quadrinhosRepository.retornarDadosQuadrinhos().getQuadrinhosListaDomains().getQuadrinhosDomain()) {
            result.add(
                    QuadrinhosDadosResponse.builder()
                            .codigo(quadrinhosDomain.getCodigo())
                            .titulo(quadrinhosDomain.getTitulo())
                            .dataModificacao(quadrinhosDomain.getDataModificacao())
                            .numeroDaPagina(quadrinhosDomain.getNumeroDaPagina())
                            .build()
            );
        }
        return result;
    }
}
