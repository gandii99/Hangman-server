package com.example.demo.hangman.word;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


/**
 * Pogo class use to store information about Words.
 *
 * It contains id which is automatically assigned by sequence. Field Word contain a string value with word.
 * Field category contain a string value with category.
 *
 * Class using a library Lombok to auto-generate all needed setters, getters and Constructor without arguments.
 * Class using a JPA implemented by Hibernate as ORM to generate sql code and change java objects to inserts to database
 *
 */
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

}
