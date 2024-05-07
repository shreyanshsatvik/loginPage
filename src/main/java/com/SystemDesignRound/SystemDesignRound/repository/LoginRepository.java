package com.SystemDesignRound.SystemDesignRound.repository;

import com.SystemDesignRound.SystemDesignRound.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginRepository extends JpaRepository<LoginEntity,Integer> {

    @Query(value = "select count(*) from login where username = ?1 and password = ?2 ",nativeQuery = true)
    public Integer isCorrect(String Username,String password);
}
