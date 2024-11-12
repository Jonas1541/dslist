package com.jonasdurau.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasdurau.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
