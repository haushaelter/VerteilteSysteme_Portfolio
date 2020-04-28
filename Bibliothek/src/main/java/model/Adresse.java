package model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

//Automatisches erstellen von Konstruktor
@Entity
@Data
@AllArgsConstructor

//Adresse
public class Adresse {
    String straße;          
    String hausnummer;      //String, damit auch 2a geht
    String ort;
    long plz;               //Postleitzahl
}