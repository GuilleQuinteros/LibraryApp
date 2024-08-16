package com.edu.biblioteca.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.biblioteca.Entidades.Autor;
import com.edu.biblioteca.Entidades.Editorial;
import com.edu.biblioteca.Entidades.Libro;
import com.edu.biblioteca.Enums.Estado;
import com.edu.biblioteca.Repositorios.LibroRepositorio;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;


    public List<Libro> listarLibros (Libro libro){
        return libroRepositorio.findAll();
    }

    public  Libro listarPorId(Long isbn){
        return libroRepositorio.findById(isbn).orElseThrow(()-> new RuntimeException("Libro no encontrado"));
    }

    public Libro crearLibro (Long isbn, String titulo, Editorial editorial, Autor autor, Integer ejemplares, Estado estado){

        Libro libro = new Libro();

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setEjemplares(ejemplares);
        libro.setEstado(Estado.DISPONIBLE);

        libroRepositorio.save(libro);
        return libro;
    }
}
