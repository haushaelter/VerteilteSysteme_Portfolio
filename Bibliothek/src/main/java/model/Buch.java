package model;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

//Automatisches erstellen von Konstruktor
@Entity
@Data
@AllArgsConstructor

//Buch
public class Buch {
    long isbn;              //ISBN, gleichzeitig id
    String status;          //kann "Verloren", "Ausgeliehen" und "Nicht ausgeliehen" sein
    Besitzer besitzer;      //Daten von Besitzer sind in Klasse "Besitzer" deklariert
    boolean vermahnt;       //true oder false
}