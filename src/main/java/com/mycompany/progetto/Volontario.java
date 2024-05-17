/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto;

/**
 * Classe Volontario che estende la classe astratta Personale.
 * Rappresenta un membro del personale che lavora come volontario, quindi senza paga.
 * 
 * @author fabri
 */
public class Volontario extends Personale {
    
    /**
     * Costruttore della classe Volontario.
     * Inizializza i campi nome, cognome, indirizzo e numero.
     *
     * @param nome Nome del volontario
     * @param cognome Cognome del volontario
     * @param indirizzo Indirizzo del volontario
     * @param numero Numero di telefono del volontario
     */
    public Volontario(String nome, String cognome, String indirizzo, int numero) {
        // Inizializza i campi della superclasse Personale
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numero = numero;
    }
    
    /**
     * Metodo per calcolare la paga del volontario.
     * Poiché i volontari non ricevono una paga, questo metodo restituisce sempre 0.
     *
     * @return sempre 0, poiché i volontari non sono pagati
     */
    @Override
    public double paga() {
        return 0;
    }
}
