package com.csci927.pandemicaservice2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface FeedbackRepository extends JpaRepository<FeedbackModel, Long> {
    List<FeedbackModel> findByName(String name);
}