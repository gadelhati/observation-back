package br.eti.gadelha.persistence.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class DTORequestTokenRefresh {
    @NotBlank
    private String refreshToken;
}