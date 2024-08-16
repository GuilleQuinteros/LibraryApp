package com.edu.biblioteca.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.biblioteca.Entidades.Autor;
import com.edu.biblioteca.Repositorios.AutorRepositorio;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;

    public List<Autor> listarAutores (Autor autor){
        return autorRepositorio.findAll();
    }

    public Autor crearAutor (String nombre){
        Autor autor = new Autor();
        autor.setNombre(nombre);
        return autorRepositorio.save(autor);
    }

    public Autor listarAutorId (String id){
        return autorRepositorio.findById(id).orElse(null);
    }

    public void elimiarAutor(String id){
        Autor autor = autorRepositorio.findById(id).orElse(null);
        if(autor != null){
            autorRepositorio.deleteById(id);
        }
        
    }

    @SuppressWarnings("null")
    public Autor actualizarAutor (String id, Autor autorActualizado){
        Autor autor = autorRepositorio.findById(id).orElseThrow(()-> new RuntimeException("Autor no Encontrado"));
        if(autor != null){
           autor.setNombre(autorActualizado.getNombre());
    }
    return autorRepositorio.save(autor);
}
}
