package com.example.demo.hangman.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangmanService {

    private final HangmanRepository hangmanRepository;

    @Autowired
    public HangmanService(HangmanRepository hangmanRepository){
        this.hangmanRepository = hangmanRepository;
    }

    public List<HangmanWord> getWords(){
        return hangmanRepository.findAll();
    }

    public List<HangmanWord> getWordsCategory(String category){
        return hangmanRepository.findAllByCategory(category);
    }


}
