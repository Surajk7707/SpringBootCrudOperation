package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Students;

public interface StudentRepo extends JpaRepository<Students, Integer> {

}
