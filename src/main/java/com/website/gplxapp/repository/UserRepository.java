package com.website.gplxapp.repository;

import com.website.gplxapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE username = :param", nativeQuery = true)
    User getByUsername(@Param("param") String param);
}
