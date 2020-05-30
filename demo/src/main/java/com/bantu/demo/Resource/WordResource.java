/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bantu.demo.Resource;

import com.bantu.demo.model.Word;
import com.bantu.demo.service.WordService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Faruque Braimo
 */
@RestController
@RequestMapping(value = "/api")
public class WordResource {
      private Word word ;

    @Autowired
    private WordService wordService;
    
    @GetMapping("/test")
    public String getAllWordsTest ()  
    {
    return "API funcionando..." ;
    } 
    
    @GetMapping("/words")
    public List<Word> getAllWords(){
        return wordService.getAllWords();
    }
    
        @PostMapping("/saveword")
	public Word saveWord(@RequestBody Word word){
		return wordService.saveWord(word);
	}
        
        
}
