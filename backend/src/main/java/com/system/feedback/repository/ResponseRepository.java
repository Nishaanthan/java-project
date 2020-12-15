package com.system.feedback.repository;

import com.system.feedback.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ResponseRepository extends JpaRepository<Response, BigInteger> {
}
