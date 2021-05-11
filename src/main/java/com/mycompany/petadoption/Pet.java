/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petadoption;

/**
 *
 * @author Hyper10n
 */
public class Pet {
    public Pet(String name, String species, String breed, int age, boolean isFixed, boolean isMicrochipped, String description) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.fixed = isFixed;
        this.microchipped = isMicrochipped;
        this.description = description;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSpecies() {
        return this.species;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }
    
    public String getBreed() {
        return this.breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean getFixed() {
        return this.fixed;
    }
    
    public void setFixed(boolean isFixed) {
        this.fixed = isFixed;
    }
    
    public boolean getMicrochipped() {
        return this.microchipped;
    }
    
    public void setMicrochipped(boolean isMicrochipped) {
        this.microchipped = isMicrochipped;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    private String name = null;
    private String species = null;
    private String breed = null;
    private int age = 0;
    private boolean fixed = false;
    private boolean microchipped = false;
    private String description = null;
}
