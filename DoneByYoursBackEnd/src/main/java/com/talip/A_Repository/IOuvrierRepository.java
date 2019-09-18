package com.talip.A_Repository;

import com.talip.Domain.Ouvrier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface IOuvrierRepository extends JpaRepository<Ouvrier,String> {
}
