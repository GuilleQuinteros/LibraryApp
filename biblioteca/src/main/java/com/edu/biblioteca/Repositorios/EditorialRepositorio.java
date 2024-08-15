package com.edu.biblioteca.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.biblioteca.Entidades.Editorial;

@Repository
public interface EditorialRepositorio extends JpaRepository <Editorial, String> {

}
