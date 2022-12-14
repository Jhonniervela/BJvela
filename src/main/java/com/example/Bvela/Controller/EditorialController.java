/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Bvela.Controller;

import com.example.Bvela.entity.Editorial;
import com.example.Bvela.service.EditorialService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER
 */
@RestController
@RequestMapping("/editorial")
@Api(value = "Microservicios de gestion de editorial", description ="Microservicio de Editorial")
public class EditorialController {
   
@Autowired
    private EditorialService editorialService; 

 @GetMapping("/all")
    @ApiOperation(value="Lista de editoriales")
    public List<Editorial> findAll() {
        return editorialService.findAll();
    }
@GetMapping("/{id}")
    public ResponseEntity<Editorial> findById(@PathVariable Long id) {
        Editorial editorial = editorialService.findById(id);
        return ResponseEntity.ok(editorial);
    }
 @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        editorialService.deleteById(id);
    }
@PostMapping("/save")
    public Editorial save(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }
 @PutMapping("/update")
    public Editorial update(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }

}
