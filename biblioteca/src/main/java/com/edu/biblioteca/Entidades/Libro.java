package com.edu.biblioteca.Entidades;

import java.util.List;

import com.edu.biblioteca.Enums.Estado;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

@Entity
public class Libro {

@Id
private Long isbn;
private String titulo;
private Autor autor;
private Editorial editorial;
private Integer ejemplares;

@Enumerated(EnumType.STRING)
private Estado estado;

@OneToMany(mappedBy = "libro")
private List<Prestamos> prestamos;


}
