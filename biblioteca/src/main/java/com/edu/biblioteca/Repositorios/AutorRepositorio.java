package com.edu.biblioteca.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.biblioteca.Entidades.Autor;

@Repository
public interface AutorRepositorio extends JpaRepository <Autor, String>{

}
