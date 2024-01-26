package org.example;

/*
* Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.
* */

public class MissingLetter {
    public static char findMissingLetter(char[] array)
    {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                return (char) (array[i] + 1);
            }
        }
        return ' ';
    }
}


/*
* For each character, it checks whether the character that should come next (in ASCII terms, the current character's ASCII value plus one) is equal to the actual next character.
If they are not equal, it means a character is missing in between, returns it as a character.
* */