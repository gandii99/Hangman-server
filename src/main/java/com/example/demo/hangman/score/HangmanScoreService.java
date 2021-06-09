package com.example.demo.hangman.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangmanScoreService {

    private final HangmanScoreRepository hangmanScoreRepository;

    @Autowired
    public HangmanScoreService(HangmanScoreRepository hangmanScoreRepository){
        this.hangmanScoreRepository = hangmanScoreRepository;
    }

    public List<HangmanScore> getScores(){
        return hangmanScoreRepository.findAll();
    }

    public void addScore(String name, int age, int score, String date){
        HangmanScore hangmanScore = new HangmanScore(name, age, score, date);
        hangmanScoreRepository.save(hangmanScore);
    }
}
