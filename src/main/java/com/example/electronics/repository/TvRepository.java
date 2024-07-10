package com.example.electronics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.electronics.entity.Tv;

public interface TvRepository extends JpaRepository<Tv, Integer> {

}
