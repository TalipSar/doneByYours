package com.talip.security.repository;

import com.talip.security.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;




public interface AuthorityRepository extends JpaRepository<Authority, Long> {
  
}
