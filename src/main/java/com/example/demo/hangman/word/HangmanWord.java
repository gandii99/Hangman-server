package com.example.demo.hangman.word;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class HangmanWord {

    @SequenceGenerator(
            name = "hangman_word_sequence",
            sequenceName = "hangman_word_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hangman_word_sequence")
    @Id
    private Long id;
    private String word;
    private String category;

    public HangmanWord(String word, String category){
        this.word = word;
        this.category = category;
    }


//    public String getWord(){
//        return "xd";
//    }
}
