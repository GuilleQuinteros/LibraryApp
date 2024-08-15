package com.edu.biblioteca.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.biblioteca.Entidades.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository <Usuario, String> {

}
