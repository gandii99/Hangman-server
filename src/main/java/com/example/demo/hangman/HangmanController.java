package com.example.demo.hangman;


import com.example.demo.hangman.score.HangmanScore;
import com.example.demo.hangman.score.HangmanScoreService;
import com.example.demo.hangman.word.HangmanService;
import com.example.demo.hangman.word.HangmanWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("words")
    public List<HangmanWord> getWords(){
        return hangmanService.getWords();
    }

    @GetMapping("words/category")
    public List<HangmanWord> getWordsCategory(@RequestParam String category){
        return hangmanService.getWordsCategory(category);
    }

    @GetMapping("scores")
    public List<HangmanScore> getScores(){
        return hangmanScoreService.getScores();
    }

    @PostMapping("score")
    public void addScore(@RequestParam String name, int age, int score, String date){
        hangmanScoreService.addScore(name, age, score, date);
    }





}
