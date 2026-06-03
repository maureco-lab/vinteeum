package com.example;

public class Computador extends Jogador {

    @Override
    public boolean parou() {
        if (getPontos() > 16) {
            if (!super.parou()) {
                super.parar();
            }
            return true;
        }
        return super.parou();
    }
}
