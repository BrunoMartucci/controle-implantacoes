package com.implantacao.controleimplantacoes.entity;

import com.implantacao.controleimplantacoes.domain.TipoAgenda;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "agenda_tecnico")
public class AgendaTecnico {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Usuario tecnico;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "hr_inicio")
    private LocalTime horaInicio;

    @Column(name = "hr_fim")
    private LocalTime horaFim;

    @Enumerated(EnumType.STRING)
    private TipoAgenda tipo;

    public AgendaTecnico() {
    }

    public AgendaTecnico(Long id, Usuario tecnico, LocalDate data, LocalTime horaInicio, LocalTime horaFim, TipoAgenda tipo) {
        this.id = id;
        this.tecnico = tecnico;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getTecnico() {
        return tecnico;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public TipoAgenda getTipo() {
        return tipo;
    }

    public void setTipo(TipoAgenda tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AgendaTecnico that = (AgendaTecnico) o;
        return Objects.equals(id, that.id) && Objects.equals(tecnico, that.tecnico) && Objects.equals(data, that.data) && Objects.equals(horaInicio, that.horaInicio) && Objects.equals(horaFim, that.horaFim) && tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tecnico, data, horaInicio, horaFim, tipo);
    }

    @Override
    public String toString() {
        return "AgendaTecnico{" +
                "id=" + id +
                ", tecnico=" + tecnico +
                ", data=" + data +
                ", horaInicio=" + horaInicio +
                ", horaFim=" + horaFim +
                ", tipo=" + tipo +
                '}';
    }
}
