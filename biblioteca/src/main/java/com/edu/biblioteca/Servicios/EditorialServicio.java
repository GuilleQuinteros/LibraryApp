package com.edu.biblioteca.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.biblioteca.Entidades.Editorial;
import com.edu.biblioteca.Repositorios.EditorialRepositorio;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    public List<Editorial> listarEditoriales (){
        return editorialRepositorio.findAll();
    }

    public Editorial listarEditorialId (String id){
        return editorialRepositorio.findById(id).orElseThrow(()-> new RuntimeException("Editorial no Encontrada"));
    }

    public Editorial crearEditorial (String nombre){
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        return editorialRepositorio.save(editorial);
    }
}
