package com.example;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador) {

        if (jogador.parou()) {
            return null;
        }

        Carta carta = monte.virar();

        if (carta != null) {
            jogador.receberCarta(carta);
        }

        return carta;
    }

    public boolean acabou() {

        boolean jogadorFinalizou = jogador.parou() || jogador.getPontos() > 21;

        boolean computadorFinalizou = computador.parou() || computador.getPontos() > 21;

        return jogadorFinalizou && computadorFinalizou;
    }

    public String resultado() {

        int pontosJogador = jogador.getPontos();
        int pontosComputador = computador.getPontos();

        if (pontosJogador > 21 && pontosComputador > 21) {
            return "Empate";
        }

        if (pontosJogador > 21) {
            return "Você perdeu";
        }

        if (pontosComputador > 21) {
            return "Você ganhou";
        }

        if (pontosJogador > pontosComputador) {
            return "Você ganhou";
        }

        if (pontosJogador < pontosComputador) {
            return "Você perdeu";
        }

        return "Empate";
    }

    public Computador getComputador() {
        return computador;
    }

    public Jogador getJogador() {
        return jogador;
    }
}
