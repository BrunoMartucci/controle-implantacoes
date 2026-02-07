package com.implantacao.controleimplantacoes.service;

import com.implantacao.controleimplantacoes.entity.Implantacao;
import com.implantacao.controleimplantacoes.entity.Usuario;
import com.implantacao.controleimplantacoes.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import com.implantacao.controleimplantacoes.repository.ImplantacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ImplantacaoService {

    private final ImplantacaoRepository implantacaoRepository;

    public ImplantacaoService(ImplantacaoRepository implantacaoRepository) {
        this.implantacaoRepository = implantacaoRepository;
    }

    public Implantacao salvar(Implantacao implantacao) {
        return implantacaoRepository.save(implantacao);
    }

    public List<Implantacao> listarTodas() {
        return implantacaoRepository.findAll();
    }
}
