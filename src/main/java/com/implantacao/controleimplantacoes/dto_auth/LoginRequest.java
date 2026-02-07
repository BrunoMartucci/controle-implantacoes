package com.implantacao.controleimplantacoes.dto_auth;

public record LoginRequest(
        String email,
        String senha
) {}
