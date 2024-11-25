package com.example.tisa_servidor.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoRecorde(@NotBlank String nome, @NotNull float valor) {
}
