/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bantu.demo.service;

import com.bantu.demo.model.Word;
import com.bantu.demo.repository.WordRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faruque Braimo
 */
@Service
public class WordService {
   
    @Autowired
    private WordRepository wordRepository; 
    
    public List<Word> getAllWords() {
        return (List<Word>) wordRepository.findAll();
    }
    
    public Word saveWord(Word word) {
		return wordRepository.save(word);
	}
    
     public void getDeleteById(long wordId) {
	Optional<Word> word = wordRepository.findById(wordId);
		 wordRepository.deleteById(wordId);  
     }
    
    public Word getWordById(long wordId) {
	Optional<Word> word = wordRepository.findById(wordId);
		return word.get();    }
    
      public Word UpdateWordB(long wordId) {
	Optional<Word> word = wordRepository.findById(wordId);
        Word wordToUpdate = word.get();
       return wordRepository.save(wordToUpdate);
           }
     
   }

     
