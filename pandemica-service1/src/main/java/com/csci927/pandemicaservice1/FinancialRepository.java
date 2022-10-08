package com.csci927.pandemicaservice1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialRepository extends JpaRepository<FinancialModel, Long> {
    List<FinancialModel> findByName(String name);
}
