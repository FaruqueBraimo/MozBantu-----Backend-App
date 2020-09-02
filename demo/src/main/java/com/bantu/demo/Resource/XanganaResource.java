package com.bantu.demo.Resource;

import com.bantu.demo.model.Emakua;
import com.bantu.demo.model.Xangana;
import com.bantu.demo.service.EmakuaService;
import com.bantu.demo.service.XanganaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")

public class XanganaResource {
    
     @Autowired
    private XanganaService xanganaService;
     
     
    @GetMapping("/xangana")
    public List<Xangana> getAllWords(){
        return xanganaService.getAllWords();
    }
    
        @PostMapping("/savexangana/{id}")
	public Xangana saveWord(@PathVariable(value = "id") Long wordId , @RequestBody Xangana xangana){
		return xanganaService.saveWord(wordId,xangana);
	}
}
