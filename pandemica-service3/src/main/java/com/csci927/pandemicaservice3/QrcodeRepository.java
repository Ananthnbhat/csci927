package com.csci927.pandemicaservice3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QrcodeRepository extends JpaRepository<QrcodeModel, Long> {
}
