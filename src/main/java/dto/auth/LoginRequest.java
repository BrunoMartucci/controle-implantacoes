package dto.auth;

public record LoginRequest(
        String email,
        String senha
) {}
