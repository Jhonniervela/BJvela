/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Bvela.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author USER
 */
@Data
@Entity
@Table(name = "editorial")
public class Editorial {
    @Id
    @Column(name = "edi_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ediId;

  @Column(name = "edi_nombre")
    private Long ediNombre;
    
    @Column(name = "año")
    private Long año;
}
