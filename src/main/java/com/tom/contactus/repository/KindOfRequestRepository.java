package com.tom.contactus.repository;

import com.tom.contactus.domain.KindOfRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KindOfRequestRepository extends JpaRepository<KindOfRequest, Integer> {
}
