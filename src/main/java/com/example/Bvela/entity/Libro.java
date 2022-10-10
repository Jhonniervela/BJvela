/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Bvela.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author USER
 */
@Data
@Entity
@Table(name = "libro")
public class Libro {
 

@Id
    @Column(name = "lib_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libdId;

 @Column(name = "lib_nombre")
    private String libNombre;

@Column(name = "lib_capitulo")
    private String libCapitulo;

    @Column(name = "lib_autor")
    private String libAutor;

@Column(name = "lib_titulo")
    private String libTitulo;

    @Column(name = "lib_precio")
    private String libPrecio;

@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="año")
    private Editorial editorial;
}
