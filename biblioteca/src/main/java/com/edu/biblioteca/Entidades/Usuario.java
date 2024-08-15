package com.edu.biblioteca.Entidades;



import java.util.List;

import com.edu.biblioteca.Enums.Rol;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

@Entity
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private String id;

private String nombre;
private String apellido;
private String email;
private String password;

@Enumerated(EnumType.STRING)
private Rol rol;

@OneToMany(mappedBy = "usuario")
private List<Prestamos> prestamos;

}
