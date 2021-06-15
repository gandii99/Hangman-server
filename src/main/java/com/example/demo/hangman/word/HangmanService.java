package com.example.demo.hangman.word;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Its service class that provide logic to analise data from database and prepare necessary data to controller.
 *
 */
@Service
public class HangmanService {

    private final HangmanRepository hangmanRepository;

    @Autowired
    public HangmanService(HangmanRepository hangmanRepository){
        this.hangmanRepository = hangmanRepository;
    }

    /**
     * Method returns List of all HangmanWord.
     *
     * @return list of HangmanWord
     */
    public List<HangmanWord> getWords(){
        return hangmanRepository.findAll();
    }

    /**
     * Method returns List of HangmanWord which was selected by category.
     *
     * @param category category from which word will be returned
     * @return list of HangmanWord from specified category
     */
    public List<HangmanWord> getWordsCategory(String category){
        return hangmanRepository.findAllByCategory(category);
    }


}
