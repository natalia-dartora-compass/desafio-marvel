package com.marvel.desafio.quadrinhos.entrypoint;

import com.marvel.desafio.quadrinhos.service.QuadrinhosService;
import com.marvel.desafio.quadrinhos.service.response.QuadrinhosDadosResponse;
import com.marvel.desafio.quadrinhos.service.response.QuadrinhosResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("quadrinhos")
public class QuadrinhosController {

    @Autowired
    private QuadrinhosService quadrinhosService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/lista")
    public ResponseEntity<List<QuadrinhosResponse>> listarQuadrinhos(){
        List<QuadrinhosResponse> result = new ArrayList<>();
        for (QuadrinhosDadosResponse quadrinhosDadosResponse : quadrinhosService.retornarQuadrinhos()) {
            result.add(QuadrinhosResponse.builder()
                    .quadrinhosDadosResponse(quadrinhosDadosResponse)
                    .build());
        }
        return ResponseEntity.ok(result);
    }

}
