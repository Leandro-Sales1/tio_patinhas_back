package Ativos;

import java.sql.Timestamp;

public class Ativo extends HistoricoPrecos {
    public String idAtivo;
    public String nome;
    private double precoAtual;
    private String simbolo;

    public Ativo() {
        super();
    }

    public Ativo(String idRegistro, String dataHora, double precoAbertura, double precoFechamento, double precoMax, double precoMin, double volumeNegociacao) {
        super(idRegistro, dataHora, precoAbertura, precoFechamento, precoMax, precoMin, volumeNegociacao);
    }

    public String getIdAtivo() {
        return idAtivo;
    }

    public void setIdAtivo(String idAtivo) {
        this.idAtivo = idAtivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String getResumoAtivo() {
        return  "ID Registro: " + this.getIdRegistro() +
                "Data e Hora: " + this.getDataHora() +
                "Preço Abertura: R$" + this.getPrecoAbertura() +
                "Preço Fechamento : " + this.getPrecoFechamento() +
                "Preço Máximo: " + this.getPrecoMax() +
                "Preço Mínimo: " + this.getPrecoMin() +
                "Volume de negociação: " + this.getVolumeNegociacao() +
                "ID Ativo: " + this.getIdAtivo() +
                "Nome do Ativo: " + this.getNome() +
                "Preço Atual: " + this.getPrecoAtual() +
                "Símbolo: " + this.getSimbolo() + ".";
    }
}