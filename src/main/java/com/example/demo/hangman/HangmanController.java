package com.example.demo.hangman;


import com.example.demo.hangman.score.HangmanScore;
import com.example.demo.hangman.score.HangmanScoreService;
import com.example.demo.hangman.word.HangmanService;
import com.example.demo.hangman.word.HangmanWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * A controller class that provide end points to communicate with api.
 *
 */
@RestController
@RequestMapping("api/hangman")
public class HangmanController {

    private final HangmanScoreService hangmanScoreService;
    private final HangmanService hangmanService;

    @Autowired
    public HangmanController(HangmanScoreService hangmanScoreService, HangmanService hangmanService){
        this.hangmanScoreService = hangmanScoreService;
        this.hangmanService = hangmanService;
    }

    /**
     * Method returns List of HangmanWord assigned to GET end point
     *
     * @return list of HangmanWord
     */
    @GetMapping("words")
    public List<HangmanWord> getWords(){
        return hangmanService.getWords();
    }

    /**
     * Method returns List of HangmanWord based on category assigned to GET end point
     *
     * @param category describe from where will be word
     * @return list of HangmanWord
     */
    @GetMapping("words/category")
    public List<HangmanWord> getWordsCategory(@RequestParam String category){
        return hangmanService.getWordsCategory(category);
    }

    /**
     * Method returns whole List of HangmanScores assigned to GET end point
     *
     * @return list of HangmanScores
     */
    @GetMapping("scores")
    public List<HangmanScore> getScores(){
        return hangmanScoreService.getScores();
    }


    /**
     * Method handle the HTTP POST requests
     *
     * @param name of player
     * @param age of player
     * @param score of game
     * @param date of game
     */
    @PostMapping("score")
    public void addScore(@RequestParam String name, int age, int score, String date){
        hangmanScoreService.addScore(name, age, score, date);
    }





}
