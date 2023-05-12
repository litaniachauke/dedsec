/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lee.dedSec.demo.classes.applicants;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 *
 * @author Litania Chauke
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employee")
public class Employee {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
    private String pos;
    private String name;
    private String surname;

}
