/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Bvela.Repository;

import com.example.Bvela.entity.Libro;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USER
 */
public interface LibroRepository extends CrudRepository<Libro, Long>{
    
}
