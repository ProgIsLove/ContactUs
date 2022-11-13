package com.tom.contactus.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class ContactDTO {
    private Integer id;

    @NotNull(message = "Policy number is required")
    private Long policyNumber;

    @Size(max = 60, message = "Name must be smaller than or equal to 60")
    @NotEmpty(message = "Please enter name")
    private String name;

    @Size(max = 60, message = "Surname must be smaller than or equal to 60")
    @NotEmpty(message = "Please enter surname")
    private String surname;

    @Size(max = 500, message = "Request must be smaller than or equal to 500")
    @NotEmpty(message = "Please enter request")
    private String request;

    private KindOfRequestDTO kindOfRequest;
}
