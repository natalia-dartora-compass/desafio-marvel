package com.marvel.desafio.quadrinhos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuadrinhosDataDomain {

    @JsonProperty("data")
    private QuadrinhosListaDomain quadrinhosListaDomains;

}
