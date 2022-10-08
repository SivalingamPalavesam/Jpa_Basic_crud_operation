package com.jpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpacrud.model.CricketPlayer;

@Repository
public interface CricketPlayerRepo extends JpaRepository<CricketPlayer, Integer> {

}
