package com.example.demo.hangman.score;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangmanScoreRepository extends JpaRepository<HangmanScore, Long> {

}
