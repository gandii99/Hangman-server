package com.example.demo.hangman.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Its service class that provide logic to analise data from database and prepare necessary data to controller.
 *
 */
@Service
public class HangmanScoreService {

    private final HangmanScoreRepository hangmanScoreRepository;

    @Autowired
    public HangmanScoreService(HangmanScoreRepository hangmanScoreRepository){
        this.hangmanScoreRepository = hangmanScoreRepository;
    }

    /**
     * Method returns List of all HangmanScore.
     *
     * @return list of HangmanScore
     */
    public List<HangmanScore> getScores(){
        return hangmanScoreRepository.findAll();
    }

    /**
     * Method add new score into HangmanScore.
     *
     * @param name which represent player name
     * @param age which represent player age
     * @param score which represent player score
     * @param date which represent date of game
     */
    public void addScore(String name, int age, int score, String date){
        HangmanScore hangmanScore = new HangmanScore(name, age, score, date);
        hangmanScoreRepository.save(hangmanScore);
    }
}
