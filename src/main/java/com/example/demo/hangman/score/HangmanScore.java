package com.example.demo.hangman.score;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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
