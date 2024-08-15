package com.edu.biblioteca.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.biblioteca.Entidades.Libro;

@Repository
public interface  LibroRepositorio extends JpaRepository <Libro, Long>{

}
