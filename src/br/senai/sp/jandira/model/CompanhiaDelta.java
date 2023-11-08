package br.senai.sp.jandira.model;

public class CompanhiaDelta extends Voo{

    Voo vooDelta = new Voo(8, 435, "Delta", "Brasil", "Paris", "12:20", "12/11");
    public CompanhiaDelta(int numeroVoo, int capacidadePassageiros, String companhia, String origem, String destino, String horaPatida, String dataPartida, Voo voo) {
        super(numeroVoo, capacidadePassageiros, companhia, origem, destino, horaPatida, dataPartida);
        this.vooDelta = voo;
    }

}
