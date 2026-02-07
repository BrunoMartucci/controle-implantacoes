package com.implantacao.controleimplantacoes.entity;

import com.implantacao.controleimplantacoes.domain.AmbienteCloud;
import com.implantacao.controleimplantacoes.domain.ModalidadeImplantacao;
import com.implantacao.controleimplantacoes.domain.ProdutoImplantacao;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "implantacao")
public class Implantacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_os", nullable = false)
    private Long numeroOS;

    @Column(name = "cod_cli", nullable = false)
    private Long codigoCliente;

    @Column(name = "nome_cli", nullable = false)
    private String nomeCliente;

    @Column(name = "tecnico", nullable = false)
    private String tecnico;

    @Column(name = "data_implantacao")
    private Date dataImplantacao;

    @Column(name = "data_lan", nullable = false)
    private LocalDate dataLancamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "produto_implantacao", nullable = false)
    private ProdutoImplantacao produtoImplantacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "modalidade_implantacao", nullable = false)
    private ModalidadeImplantacao modalidadeImplantacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "ambiente_cloud")
    private AmbienteCloud ambienteCloud;

    public Implantacao() {
    }

    public Implantacao(Long id, Long numeroOS, Long codigoCliente, String nomeCliente, String tecnico, Date dataImplantacao, LocalDate dataLancamento, ProdutoImplantacao produtoImplantacao, ModalidadeImplantacao modalidadeImplantacao, AmbienteCloud ambienteCloud) {
        this.id = id;
        this.numeroOS = numeroOS;
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.tecnico = tecnico;
        this.dataImplantacao = dataImplantacao;
        this.dataLancamento = dataLancamento;
        this.produtoImplantacao = produtoImplantacao;
        this.modalidadeImplantacao = modalidadeImplantacao;
        this.ambienteCloud = ambienteCloud;
    }

    @PrePersist
    protected void prePersist() {
        if (this.dataLancamento == null) {
            this.dataLancamento = LocalDate.now();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(Long numeroOS) {
        this.numeroOS = numeroOS;
    }

    public Long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Date getDataImplantacao() {
        return dataImplantacao;
    }

    public void setDataImplantacao(Date dataImplantacao) {
        this.dataImplantacao = dataImplantacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public AmbienteCloud getAmbienteCloud() {
        return ambienteCloud;
    }

    public void setAmbienteCloud(AmbienteCloud ambienteCloud) {
        this.ambienteCloud = ambienteCloud;
    }

    public ProdutoImplantacao getProdutoImplantacao() {
        return produtoImplantacao;
    }

    public void setProdutoImplantacao(ProdutoImplantacao produtoImplantacao) {
        this.produtoImplantacao = produtoImplantacao;
    }

    public ModalidadeImplantacao getModalidadeImplantacao() {
        return modalidadeImplantacao;
    }

    public void setModalidadeImplantacao(ModalidadeImplantacao modalidadeImplantacao) {
        this.modalidadeImplantacao = modalidadeImplantacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Implantacao that = (Implantacao) o;
        return Objects.equals(id, that.id) && Objects.equals(numeroOS, that.numeroOS) && Objects.equals(codigoCliente, that.codigoCliente) && Objects.equals(nomeCliente, that.nomeCliente) && Objects.equals(tecnico, that.tecnico) && Objects.equals(dataImplantacao, that.dataImplantacao) && Objects.equals(dataLancamento, that.dataLancamento) && produtoImplantacao == that.produtoImplantacao && modalidadeImplantacao == that.modalidadeImplantacao && ambienteCloud == that.ambienteCloud;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroOS, codigoCliente, nomeCliente, tecnico, dataImplantacao, dataLancamento, produtoImplantacao, modalidadeImplantacao, ambienteCloud);
    }

    @Override
    public String toString() {
        return "Implantacao{" +
                "id=" + id +
                ", numeroOS=" + numeroOS +
                ", codigoCliente=" + codigoCliente +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", dataImplantacao=" + dataImplantacao +
                ", dataLancamento=" + dataLancamento +
                ", produtoImplantacao=" + produtoImplantacao +
                ", modalidadeImplantacao=" + modalidadeImplantacao +
                ", ambienteCloud=" + ambienteCloud +
                '}';
    }
}
