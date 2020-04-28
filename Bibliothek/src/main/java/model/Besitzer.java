package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

//Automatisches erstellen von Konstruktor
@Entity
@Data
@AllArgsConstructor

//Besitzer
public class Besitzer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;                //Kundennummer, identifizierend
    Adresse adresse;        //in Klasse Adresse deklariert
    String telefonnummer;
}