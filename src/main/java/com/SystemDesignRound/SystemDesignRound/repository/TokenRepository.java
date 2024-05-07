package com.SystemDesignRound.SystemDesignRound.repository;

import com.SystemDesignRound.SystemDesignRound.entity.TokenEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface TokenRepository extends JpaRepository<TokenEntity,Integer> {

    @Query(value="select token from tokeninfo where username = ?1",nativeQuery = true)
    public Integer getToken(String username);

    @Query(value="select count(*) from tokeninfo where username = ?1 and token = ?2",nativeQuery = true)
    public Integer validateToken(String username,Integer token);


}
