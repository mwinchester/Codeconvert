package com.example;

public class CodeConvert {


    public static void main(String[] args){

        char[] normalLetters = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '\u0020', '\u002e'};

        char[] codeLetters = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd',
                'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Q', 'W', 'E', 'R', 'T',
                'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X',
                'C', 'V', 'B', 'N', 'M', '\u0020', '\u002e'};

        String entry = ("Live long and prosper.");
        int entryLength = entry.length();

        char[] entryArray = entry.toCharArray();


        for(int i = 0; i < entryLength; i++){
            for(int c = 0; c < normalLetters.length; c++){
                if (entryArray[i] == normalLetters[c]){
                    //System.out.print(normalLetters[c]);
                    System.out.print(codeLetters[c]);
                    break;
                }

            }

        }





    }


}

