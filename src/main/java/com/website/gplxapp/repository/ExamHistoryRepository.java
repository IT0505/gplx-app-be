package com.website.gplxapp.repository;

import com.website.gplxapp.model.ExamHistory;
import com.website.gplxapp.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ExamHistoryRepository extends JpaRepository<ExamHistory, Integer> {
    @Query(value = "SELECT * FROM exam_history WHERE user_id = :param1 AND exam_template_id = :param2", nativeQuery = true)
    ExamHistory getByUserId(@Param("param1") String param1, @Param("param2") String param2);
}
