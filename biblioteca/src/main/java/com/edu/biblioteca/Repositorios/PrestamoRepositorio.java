package com.edu.biblioteca.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.biblioteca.Entidades.Prestamos;

@Repository
public interface PrestamoRepositorio extends JpaRepository <Prestamos, String> {

}
