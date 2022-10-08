package com.csci927.pandemicaservice1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Table(name = "financial_assist")
public class FinancialModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "Address is mandatory")
    @Column(name = "address")
    private long address;

    @NotBlank(message = "Date of birth is mandatory")
    @Column(name = "dob")
    private LocalDate dob;

    @NotBlank(message = "Reason is mandatory")
    @Column(name = "reason")
    private String reason;
}
