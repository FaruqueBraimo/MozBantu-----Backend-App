/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bantu.demo.repository;

import com.bantu.demo.model.Word;
import com.bantu.demo.model.Xangana;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 *
 * @author Faruque Braimo
 */
public interface XanganaRepository  extends Neo4jRepository<Xangana ,Long>{
    
}
