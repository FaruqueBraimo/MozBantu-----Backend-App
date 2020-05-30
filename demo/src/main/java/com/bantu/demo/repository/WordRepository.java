/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bantu.demo.repository;

import com.bantu.demo.model.Word;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Faruque Braimo
 */
public interface WordRepository  extends Neo4jRepository<Word ,Long>{
    
}
