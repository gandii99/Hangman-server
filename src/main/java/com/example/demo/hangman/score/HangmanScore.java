package com.example.demo.hangman.score;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


/**
 * Pogo class use to store information about Score.
 *
 * It contains id which is automatically assigned by sequence. Field Score contain a string value with score.
 * Field Name contain a string value with name. Field Age contain a int value with age. Field Score contain a int
 * value with score. Field Date contain a string value with date.
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
public class HangmanScore {

    @SequenceGenerator(
            name = "hangman_score_sequence",
            sequenceName = "hangman_score_sequence",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hangman_score_sequence")
    @Id
    private Long id;
    private String name;
    private int age;
    private int score;
    private String date;

    public HangmanScore(String name, int age, int score, String date) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.date = date;
    }
}
