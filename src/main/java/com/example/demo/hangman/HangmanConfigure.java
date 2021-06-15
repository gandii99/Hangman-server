package com.example.demo.hangman;


import com.example.demo.hangman.score.HangmanScoreRepository;
import com.example.demo.hangman.word.HangmanRepository;
import com.example.demo.hangman.word.HangmanWord;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Configuration class used to insert data to database
 *
 */

@Configuration
public class HangmanConfigure {
    @Bean
    CommandLineRunner commandLineRunner(HangmanRepository hangmanRepository, HangmanScoreRepository hangmanScoreRepository) {
        return args -> {
            //HangmanWord hangmanWord = new HangmanWord("słonecznik","roślina");
            //hangmanRepository.save(hangmanWord);
            //HangmanScore hangmanScore = new HangmanScore("Ania", 32, 132, "23123123");
            //hangmanScoreRepository.save(hangmanScore);
//            HangmanWord hangmanWord = new HangmanWord("róża","roślina");
//            hangmanRepository.save(hangmanWord);
//            HangmanWord hangmanWord2 = new HangmanWord("byk","zwierzę");
//            hangmanRepository.save(hangmanWord2);

//            String linia;
//            List<String> slowa = new ArrayList<>();
//            FileReader fr = new FileReader("../slowa.txt");
//            BufferedReader bfr = new BufferedReader(fr);
//            while((linia = bfr.readLine())!=null){
//                String[] fields = linia.split(",");
//                for(int i=0; i<fields.length; i++){
//                    if(fields[i].trim().length()>0){
//                        hangmanRepository.save(new HangmanWord(fields[i].trim(),"wszystkie"));
//                    }
//
//                }
//            }

        };
    }
}
