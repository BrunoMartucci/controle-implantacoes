package com.implantacao.controleimplantacoes.controller;


import com.implantacao.controleimplantacoes.domain.PerfilUsuario;
import com.implantacao.controleimplantacoes.entity.Usuario;
import com.implantacao.controleimplantacoes.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario criar() {
        Usuario usuario = new Usuario();
        usuario.setNome("Admin");
        usuario.setEmail("admin@admin.com");
        usuario.setSenha("123456");
        usuario.setPerfil(PerfilUsuario.ADMIN);

        return usuarioService.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarTodos();
    }
}