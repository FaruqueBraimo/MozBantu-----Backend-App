/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bantu.demo.model;

import java.util.List;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 *
 * @author Faruque Braimo
 */
@NodeEntity
public class Emakua {
     @GeneratedValue
     @Id
     private Long id;
     private String name;
     private String example;
     private String pronuncia;
     @Relationship(type = "EM_MACUA", direction = Relationship.INCOMING)
     private Word word;
     
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the example
     */
    public String getExample() {
        return example;
    }

    /**
     * @param example the example to set
     */
    public void setExample(String example) {
        this.example = example;
    }

    /**
     * @return the pronuncia
     */
    public String getPronuncia() {
        return pronuncia;
    }

    /**
     * @param pronuncia the pronuncia to set
     */
    public void setPronuncia(String pronuncia) {
        this.pronuncia = pronuncia;
    }

    /**
     * @return the word
     */
    public Word getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(Word word) {
        this.word = word;
    }
    
}
