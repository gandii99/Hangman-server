package com.example.demo.hangman.score;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface that extends JpaRepository. It contains method to collect data from database
 *
 */
@Repository
public interface HangmanScoreRepository extends JpaRepository<HangmanScore, Long> {

}
