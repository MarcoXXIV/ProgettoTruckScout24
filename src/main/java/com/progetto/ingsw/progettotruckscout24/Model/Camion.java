package com.progetto.ingsw.progettotruckscout24.Model;

public record Camion(String id, String nome, String modello, Integer potenza, String kilometri, String carburante, String cambio, Integer classeEmissioni, String anno, String prezzo, String descrizione, String categoria) {
    @Override
    public String toString() {
        return id + ";" + nome + ";" + modello + ";" + potenza + ";" + kilometri + ";" + carburante + ";" + cambio + ";" + classeEmissioni + ";" + anno + ";" + prezzo + ";" + descrizione + ";" + categoria;
    }
}
