/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Bvela.service.impl;

import com.example.Bvela.Repository.LibroRepository;
import com.example.Bvela.entity.Libro;
import com.example.Bvela.service.LibroService;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class LibroServiceImpl  implements LibroService {
  
   @Autowired
   private LibroRepository libroRepository;

@Transactional
    @Override
public List<Libro>findAll() {
return (List<Libro>) libroRepository .findAll();
} 
 @Override
    public Libro findById(Long id) {
        return libroRepository.findById(id).orElse(null);
    }
 @Override
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }
 @Override
    public void delete(Libro libro) {
        libroRepository.delete(libro);
    }
@Override
    public void deleteById(Long id) {
        libroRepository.deleteById(id);
    }
} 
