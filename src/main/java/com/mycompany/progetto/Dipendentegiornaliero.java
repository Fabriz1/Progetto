/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto;

import java.util.Scanner;

/**
 * Classe Dipendentegiornaliero che estende la classe astratta Personale.
 * Rappresenta un dipendente giornaliero con attributi aggiuntivi come codice fiscale,
 * retribuzione e giorni lavorati.
 * Fornisce metodi per inserire i giorni lavorati e stampare i dati del dipendente.
 * 
 * @autor fabri
 */
public class Dipendentegiornaliero extends Personale {
    // Attributi del dipendente giornaliero
    String codicefiscale = "";   // Codice fiscale del dipendente
    double retribuzione;         // Retribuzione giornaliera del dipendente
    int Giorni;                  // Giorni lavorati dal dipendente
    
    /**
     * Costruttore della classe Dipendentegiornaliero.
     * Inizializza i campi nome, cognome, indirizzo, numero e codice fiscale.
     *
     * @param nome Nome del dipendente
     * @param cognome Cognome del dipendente
     * @param indirizzo Indirizzo del dipendente
     * @param numero Numero di telefono del dipendente
     * @param codicefiscale Codice fiscale del dipendente
     */
    public Dipendentegiornaliero(String nome, String cognome, String indirizzo, int numero, String codicefiscale) {
        // Inizializza i campi della superclasse Personale
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numero = numero;
        this.codicefiscale = codicefiscale;
    }
    
    /**
     * Metodo per inserire i giorni lavorati dal dipendente.
     * Utilizza uno scanner per leggere l'input dell'utente.
     */
    public void giorni() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci quanti giorni hai lavorato:");
        this.Giorni += scan.nextInt();
    }
    
    /**
     * Metodo per stampare i dati del dipendente giornaliero.
     * Sovrascrive il metodo stampadati della superclasse Personale.
     */
    @Override
    public void stampadati() {
        System.out.println("Il nome è: " + this.nome);
        System.out.println("Il cognome è: " + this.cognome);
        System.out.println("Il suo indirizzo è: " + this.indirizzo);
        System.out.println("Il numero è: " + this.numero);
        System.out.println("Il codice fiscale è: " + this.codicefiscale);
    }
}
