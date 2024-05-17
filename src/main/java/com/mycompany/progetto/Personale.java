/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto;

import java.util.Scanner;

/**
 * Classe astratta che rappresenta il personale generico.
 * Contiene attributi comuni come nome, cognome, indirizzo, numero di telefono,
 * giorni lavorativi al mese e paga giornaliera.
 * Fornisce un metodo per stampare i dati del personale e calcolare la paga.
 * 
 * @autor fabri
 */
public abstract class Personale {
    // Attributi del personale
    String nome = "";         // Nome del personale
    String cognome = "";      // Cognome del personale
    String indirizzo = "";    // Indirizzo del personale
    int numero;               // Numero di telefono del personale
    int Giorniomesi;          // Giorni lavorativi nel mese
    int paga;                 // Paga giornaliera del personale
    
    // Costruttore di default
    public Personale() {
        // Vuoto per ora
    }
    
    // Metodo per stampare i dati del personale
    public void stampadati() {
        System.out.println("Il nome è: " + this.nome);
        System.out.println("Il cognome è: " + this.cognome);
        System.out.println("Il suo indirizzo è: " + this.indirizzo);
        System.out.println("Il numero è: " + this.numero);
    }
    
    // Metodo per calcolare la paga mensile del personale
    public double paga() {
        double Paga = this.Giorniomesi * paga; // Calcolo della paga
        this.Giorniomesi = 0; // Resetta i giorni lavorativi dopo il calcolo della paga
        return Paga;
    }
}
