package com.tom.contactus.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class KindOfRequestDTO {

    private Integer id;
    private String requestName;
    private List<ContactDTO> contacts;
}
