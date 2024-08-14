package com.edu.biblioteca.Entidades;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

private Long id;
private String nombre;
private String Apellido;
private String email;
private String password;


}
