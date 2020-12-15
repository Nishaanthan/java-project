package com.system.feedback.repository;

import com.system.feedback.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface QuestionRepository extends JpaRepository<Question, BigInteger> {
}
