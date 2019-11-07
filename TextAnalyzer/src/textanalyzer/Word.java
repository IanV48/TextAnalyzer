/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textanalyzer;

/**
 *
 * @author Ian
 */
public class Word {
    private String word;
    private int instances;
    
    //Creates a word that has been used in one instance
    Word(String word){
        this.word = word;
        instances = 1;
    }
    
    public String word(){
        return word;
    }
    
    public int instances(){
        return instances;
    }
    
    //Increases the number of instances the word has been used by one
    public void increment(){
        instances++;
    }
    
    //Tests to see if the word is equal to a String representation of the word
    public boolean equals(String s){
        return s.equals(word);
    }
    
    //Tests to see if the word is equal to another Word object in terms of
    //the actual word (instance doesn't matter)
    public boolean equals(Word w){
        return word.equals(w.word());
    }
}
