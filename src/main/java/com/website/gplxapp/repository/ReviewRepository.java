package com.website.gplxapp.repository;

import com.website.gplxapp.model.Review;
import com.website.gplxapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    @Query(value = "SELECT * FROM review WHERE user_id = :param", nativeQuery = true)
    Review getByUserId(@Param("param") String param);
}
