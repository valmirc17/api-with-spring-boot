package br.com.valmir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.valmir.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
