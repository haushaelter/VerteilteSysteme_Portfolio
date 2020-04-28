package repositories;

import org.springframework.data.repository.CrudRepository;

import model.Buch;

public interface BuchRepository extends CrudRepository <Buch, Long> {

}