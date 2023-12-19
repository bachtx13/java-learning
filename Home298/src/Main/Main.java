/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bacht
 */
public class Main {
    public static void main(String[] args) {
        String str = ("Hello Welcome to Java Hello");
        String[] words = str.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();
        char[] letters = str.toCharArray();
        Map<Character, Integer> letterMap = new HashMap<>();
        for(String word : words){
            if(wordMap.keySet().contains(word)){
                wordMap.put(word, wordMap.get(word) + 1);
            }
            else{
                wordMap.put(word, 1);
            }
        }
        for(char letter : letters){
            if(letterMap.keySet().contains(letter)){
                letterMap.put(letter, letterMap.get(letter) + 1);
            }
            else{               
                letterMap.put(letter, 1);
            }
        }
        for(String word : wordMap.keySet()){
            System.out.println(word + ": " + wordMap.get(word));
        }
        for(char letter : letterMap.keySet()){
            System.out.println(letter + ": " + letterMap.get(letter));
        }
        
    }
}