package com.example.demo.entity;
import.jakarta.persistence.*;
import.jakarta.validation.constraints.*;
import.lombok.*;
import

import javax.annotation.processing.Generated;.java.time.LocalDateTime;



@Table ( name = " estudiantes ", indexes = @Index ( name = " idx_cedula ", columnList = "cedula"))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class producto
{
    @id
    @GeneratedValue ( strategy = GenerationType . IDENTITY )
    private Long id ;
}

