package com.SystemDesignRound.SystemDesignRound.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tokeninfo")
@Data
public class TokenEntity {
    @Id
    private String username;
    private Integer token;
}
