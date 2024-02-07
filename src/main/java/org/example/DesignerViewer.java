package org.example;

import java.util.List;

public class DesignerViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {

        int maxCharHeight = 0; // Stores the height of the tallest letter in the word

        // Iterate over the word to find the tallest letter
        for (char character : word.toCharArray()) {
            int currentCharHeight = h.get(character - 'a'); // Get the height of the current character
            if (currentCharHeight > maxCharHeight) {
                maxCharHeight = currentCharHeight; // Update maxCharHeight if current character is taller
            }
        }

        return maxCharHeight * word.length(); // Area = height x width (width is the length of the word)


    }
}

/*
 This code assumes that the h list contains 26 elements corresponding to the heights of the letters a-z, and it also assumes the word contains only lowercase letters. The function works by going over each character in the word, obtaining its height from the h list (index is calculated by subtracting the ASCII value of 'a' from the character), and updating maxCharHeight as needed.

 Finally, it returns the product of maxCharHeight and the length of the word, which represents the area of the highlighted region in the PDF viewer.

 The time complexity of this function is O(n), where n is the length of the given word.
* */