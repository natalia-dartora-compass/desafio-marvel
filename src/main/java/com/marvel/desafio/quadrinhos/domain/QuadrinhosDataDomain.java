package com.marvel.desafio.quadrinhos.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuadrinhosDataDomain {

    @JsonProperty("data")
    private QuadrinhosListaDomain quadrinhosListaDomains;

}
