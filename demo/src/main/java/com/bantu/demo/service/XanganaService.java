/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bantu.demo.service;

import com.bantu.demo.model.Emakua;
import com.bantu.demo.model.Word;
import com.bantu.demo.model.Xangana;
import com.bantu.demo.repository.EmakuaRepository;
import com.bantu.demo.repository.WordRepository;
import com.bantu.demo.repository.XanganaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faruque Braimo
 */
@Service
public class XanganaService {
      @Autowired
    private XanganaRepository xangnaRepository; 
      
       @Autowired
    private WordRepository wordRepository; 
    
    public List<Xangana> getAllWords() {
        return (List<Xangana>) xangnaRepository.findAll();
    }
    
    public Xangana saveWord(Long codigo, Xangana xangana) {
        Optional<Word> wordList = wordRepository.findById(codigo);
         Word word  = wordList.get();
         xangana.setWord(word);
	  return xangnaRepository.save(xangana);
	}
    
     public void getDeleteById(long wordId) {
		 xangnaRepository.deleteById(wordId);  
     }
    
    public Xangana getWordById(long wordId) {
	Optional<Xangana> word = xangnaRepository.findById(wordId);
		return word.get();    }
    
      public Xangana UpdateWordB(long wordId) {
	Optional<Xangana> word = xangnaRepository.findById(wordId);
        Xangana wordToUpdate = word.get();
       return xangnaRepository.save(wordToUpdate);
           }
}
