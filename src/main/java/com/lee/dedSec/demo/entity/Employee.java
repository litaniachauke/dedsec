/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lee.dedSec.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

/**
 *
 * @author Litania Chauke
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "employee")
public class Employee {
      @Id
      @GeneratedValue(strategy = GenerationType.UUID)
    private UUID employeeId;
    private String position;
    private String name;
    private String surname;

}
