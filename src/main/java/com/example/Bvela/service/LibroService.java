/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Bvela.service;

import com.example.Bvela.entity.Libro;

import java.util.List;

/**
 *
 * @author USER
 */
public interface LibroService {
  
 public List<Libro> findAll();  

public Libro findById(Long id);

 public Libro save(Libro libro);

public void delete(Libro libro);

    public void deleteById(Long id);   
}

