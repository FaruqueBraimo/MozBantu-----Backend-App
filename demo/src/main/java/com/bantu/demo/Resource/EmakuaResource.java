/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bantu.demo.Resource;

import com.bantu.demo.model.Emakua;
import com.bantu.demo.model.Word;
import com.bantu.demo.service.EmakuaService;
import com.bantu.demo.service.WordService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class EmakuaResource {
    
     @Autowired
    private EmakuaService wordService;
     
     
    @GetMapping("/emakua")
    public List<Emakua> getAllWords(){
        return wordService.getAllWords();
    }
    
        @PostMapping("/saveemakua/{id}")
	public Emakua saveWord(@PathVariable(value = "id") Long wordId , @RequestBody Emakua emakua){
		return wordService.saveWord(wordId,emakua);
	}
        
}
