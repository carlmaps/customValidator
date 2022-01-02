package com.example.CustomValidator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;


@Data
@AllArgsConstructor
public class FieldTripForm {

   private String name;
   private int age;
   private String guardian;

}
