package org.dhbw.service.Bibliothek.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Adresse;
import model.Besitzer;
import model.Buch;
import repositories.BuchRepository;

@RestController
public class BuchController implements BuchRepository {

    @Autowired
    BuchRepository BuchRepo;

    @GetMapping("/buch")
    public Buch getBook(){
        //Standard-Adresse und Besitzer: die Bibliothek selbst
        Adresse adresseBibliothek = new Adresse("Musterstraße", "121", "Karlsruhe", 76185);
        Besitzer bibliothek = new Besitzer(123456, adresseBibliothek, "+4916099589090");

        // erstes Buch
        Buch buch = new Buch(11122233344L, "Nicht ausgeliehen", bibliothek, false);

        // "Ausgabe" des Buches
        return buch;
    }

    @GetMapping("/buecher")
    public List <Buch> getBooks() {

        List <Buch> allBuecher = (List <Buch>) BuchRepo.findAll();
        return allBuecher;

    }

    @GetMapping("/buch/{id}")
    public Buch getBuchById (@PathVariable Long id){
        Buch buch = BuchRepo.findById(id).get();
        return buch;
    }

    @Override
    public <S extends Buch> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Buch> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Buch> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<Buch> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Buch> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Buch entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll(Iterable<? extends Buch> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }
}