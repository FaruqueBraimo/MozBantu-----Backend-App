/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bantu.demo.service;

import com.bantu.demo.model.Emakua;
import com.bantu.demo.model.Word;
import com.bantu.demo.repository.EmakuaRepository;
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
public class  EmakuaService {
      @Autowired
    private EmakuaRepository emakuaRepository; 
      
       @Autowired
    private WordRepository wordRepository; 
    
    public List<Emakua> getAllWords() {
        return (List<Emakua>) emakuaRepository.findAll();
    }
    
    public Emakua saveWord(Long codigo, Emakua emakua) {
        Optional<Word> wordList = wordRepository.findById(codigo);
         Word word  = wordList.get();
         emakua.setWord(word);
	  return emakuaRepository.save(emakua);
	}
    
     public void getDeleteById(long wordId) {
		 emakuaRepository.deleteById(wordId);  
     }
    
    public Emakua getWordById(long wordId) {
	Optional<Emakua> word = emakuaRepository.findById(wordId);
		return word.get();    }
    
      public Emakua UpdateWordB(long wordId) {
	Optional<Emakua> word = emakuaRepository.findById(wordId);
        Emakua wordToUpdate = word.get();
       return emakuaRepository.save(wordToUpdate);
           }
}
