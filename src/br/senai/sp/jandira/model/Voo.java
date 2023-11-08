package br.senai.sp.jandira.model;

public class Voo {

    private int numeroVoo, capacidadePassageiros;
    String companhia, origem, destino, horaPatida, dataPartida;

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraPatida() {
        return horaPatida;
    }

    public void setHoraPatida(String horaPatida) {
        this.horaPatida = horaPatida;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Voo(int numeroVoo, int capacidadePassageiros, String companhia, String origem, String destino, String horaPatida, String dataPartida) {
        this.numeroVoo = numeroVoo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.companhia = companhia;
        this.origem = origem;
        this.destino = destino;
        this.horaPatida = horaPatida;
        this.dataPartida = dataPartida;
    }
}
