package br.senai.sp.jandira.model;

public class CompanhiaGol extends Voo{


    Voo vooGol = new Voo(3, 235, "Gol", "China", "Brasil", "01:20", "02/05");
    public CompanhiaGol(int numeroVoo, int capacidadePassageiros, String companhia, String origem, String destino, String horaPatida, String dataPartida) {
        super(numeroVoo, capacidadePassageiros, companhia, origem, destino, horaPatida, dataPartida);
    }
}
git