package com.csci927.pandemicaservice2;
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
@Entity
@Getter
@Setter
@ToString
@Table(name = "vaccine_feedback")
public class FeedbackModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "Date of birth is mandatory")
    @Column(name = "dob")
    private String dob;

    @NotBlank(message = "gender is mandatory")
    @Column(name = "gender")
    private String gender;

    @NotBlank(message = "status is mandatory")
    @Column(name = "status")
    private String status;

    @NotBlank(message = "brand is mandatory")
    @Column(name = "brand")
    private String brand;

    @NotBlank(message = "Feedback is mandatory")
    @Column(name = "feedback")
    private String feedback;
}
