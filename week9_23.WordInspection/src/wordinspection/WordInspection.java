/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author junen
 */
import java.io.*;
import java.util.*;

public class WordInspection {

    private Scanner reader;
    private List<String> words;

    public WordInspection(File file) throws Exception {
        this.words = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");
        
        
        while (this.reader.hasNextLine()) {
            this.words.add(this.reader.nextLine());
        }
    }

    public int wordCount() {
        return words.size();
    }

    public List<String> wordsContainingZ() {
        List<String> zWords = new ArrayList<String>();

            for (String word : words) {
                if (word.contains("z")) {
                    zWords.add(word);
                }
            }
        
        return zWords;
    }

    public List<String> wordsEndingInL() {
        List<String> lSuffix = new ArrayList<String>();

        for (String word : words) {
            if (word.endsWith("l")) {
                lSuffix.add(word);
            }
        }
        return lSuffix;
    }

    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();

        for (String word : words) {
            if (this.isPalindrome(word)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    private boolean isPalindrome(String word) {
        String reversed = "";

        for (int i = word.length(); i > 0; i--) {
            reversed += word.charAt(i - 1);
        }
        return word.equals(reversed);

    }

    public List<String> wordsWhichContainAllVowels() {
        
        List<String> wordsWithAllTheVowels = new ArrayList<String>();

        for (String word: words) {
            if (this.hasAllVowels(word)) {
                wordsWithAllTheVowels.add(word);
            }
        }

        return wordsWithAllTheVowels;
    }

    private List<String> listofAllVowels() {
        String vowels = "aeiouyäö";
        List<String> allVowels = new ArrayList<String>();

        for (int i = 0; i < vowels.length(); i++) {
            String vowel = "";
            vowel += vowels.charAt(i);
            allVowels.add(vowel);
        }
        return allVowels;
    }

    private boolean hasAllVowels(String word) {

        List<String> vowelsFromWord = new ArrayList<String>();
        List<String> vowels = this.listofAllVowels();

        String parsedLetter = "";
        for (int i = 0; i < word.length(); i++) {
            parsedLetter = "";
            parsedLetter += word.charAt(i);

            if (vowels.contains(parsedLetter) & !vowelsFromWord.contains(parsedLetter)) {
                vowelsFromWord.add(parsedLetter);
            }
        }
        Collections.sort(vowelsFromWord);

        return vowels.equals(vowelsFromWord);
    }
}
