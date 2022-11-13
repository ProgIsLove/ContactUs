package com.tom.contactus.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "contact_tab")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id", nullable = false)
    private Integer id;

    @Column(name = "policy_number", nullable = false)
    private Long policyNumber;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "surname", nullable = false, length = 60)
    private String surname;

    @Column(name = "request", nullable = false, length = 500)
    private String request;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kind_of_request_id")
    private KindOfRequest kindOfRequestName;
}
