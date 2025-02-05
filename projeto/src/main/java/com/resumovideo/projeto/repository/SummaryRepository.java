package com.resumovideo.projeto.repository;

import com.resumovideo.projeto.model.User;
import com.resumovideo.projeto.model.DailySummary;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.Optional;

public interface SummaryRepository extends JpaRepository<DailySummary, Long>{
	Optional <DailySummary> findByUserAndDate (User user, LocalDate date);
}
