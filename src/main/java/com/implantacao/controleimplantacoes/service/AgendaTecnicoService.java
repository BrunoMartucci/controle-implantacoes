package com.implantacao.controleimplantacoes.service;

import com.implantacao.controleimplantacoes.entity.AgendaTecnico;
import com.implantacao.controleimplantacoes.repository.AgendaTecnicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaTecnicoService {

    private final AgendaTecnicoRepository agendaTecnicoRepository;

    public AgendaTecnicoService(AgendaTecnicoRepository agendaTecnicoRepository) {
        this.agendaTecnicoRepository = agendaTecnicoRepository;
    }

    public AgendaTecnico salvar(AgendaTecnico agendaTecnico) {
        return agendaTecnicoRepository.save(agendaTecnico);
    }

    public List<AgendaTecnico> listarTodas() {
        return agendaTecnicoRepository.findAll();
    }
}
