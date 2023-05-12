/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lee.dedSec.demo.classes.applicants;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Objects;

/**
 *
 * @author Litania Chauke
 */
@Data
@Entity
@Table(name="employee")
public class Employee {
      @Id
    private long empId;
    private String pos;
    private String name;
    private String surname;

}
