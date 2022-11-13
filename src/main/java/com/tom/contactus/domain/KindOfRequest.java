package com.tom.contactus.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "kind_of_request_tab")
public class KindOfRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id", nullable = false)
    private Integer id;

    @Column(name = "request_name", length = 40)
    private String requestName;

    @OneToMany(mappedBy = "kindOfRequestName", cascade = CascadeType.PERSIST)
    private List<Contact> contacts = new ArrayList<>();
}
