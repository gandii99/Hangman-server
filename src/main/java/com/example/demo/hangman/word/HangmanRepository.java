package com.example.demo.hangman.word;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HangmanRepository extends JpaRepository<HangmanWord, Long> {
    //@Query("Wpisać zapytanko i będzie git pod nazwą niżej")
    List<HangmanWord> findAllByCategory(String category);
}
