package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero,Naipe naipe){
        this.numero=numero;
        this.naipe=naipe;
    }

    public String ImagePath(){
        String face = numero + "";
        if (numero == 1) face = "Ace";
        if (numero == 11) face ="Jack";
        if (numero == 12) face = "Queen";
        if (numero == 13) face = "King";

        return "classic-cards/" + face + this.naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}
