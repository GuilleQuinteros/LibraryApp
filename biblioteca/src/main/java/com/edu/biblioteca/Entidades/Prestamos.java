package com.edu.biblioteca.Entidades;

import java.time.LocalDate;

import com.edu.biblioteca.Enums.Estado;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
@Entity
public class Prestamos {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "libro_isbn")
    private Libro libro;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDate fechaPrestamo;

    private LocalDate fechaDevolucion;

    
    private String observaciones;

}
