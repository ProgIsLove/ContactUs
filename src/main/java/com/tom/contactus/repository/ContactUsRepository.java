package com.tom.contactus.repository;

import com.tom.contactus.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsRepository extends JpaRepository<Contact, Integer> {
}
