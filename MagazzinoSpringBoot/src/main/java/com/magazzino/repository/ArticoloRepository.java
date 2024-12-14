package com.magazzino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magazzino.model.Articolo;

public interface ArticoloRepository extends JpaRepository<Articolo, Integer> {

}
