/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Bvela.service.impl;

import com.example.Bvela.Repository.EditorialRepository;
import com.example.Bvela.entity.Editorial;
import com.example.Bvela.service.EditorialService;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class EditorialServiceImpl implements EditorialService {
 @Autowired
    private EditorialRepository editorialRepository;   
@Transactional
    @Override
 public List<Editorial> findAll() {
        return (List<Editorial>) editorialRepository.findAll();
    }
@Override
    public Editorial findById(Long id) {
        return editorialRepository.findById(id).orElse(null);
    }
 @Override
    public Editorial save(Editorial editorial) {
        return editorialRepository.save(editorial);
    }
@Override
    public void delete(Editorial editorial) {
        editorialRepository.delete(editorial);
    }
@Override
    public void deleteById(Long id) {
        editorialRepository.deleteById(id);
    }

}
