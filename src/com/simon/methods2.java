package com.simon;

public class methods2 {
    public static int countOccurrence(char searchLetter, char[] letters){
        int occurrences = 0;
        for (char c : letters) {
            if (c == searchLetter)
                occurrences++;
        }
        return occurrences;
    }
    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        System.out.println(countOccurrence('A', letters));
        System.out.println(countOccurrence('B', letters));
        System.out.println(countOccurrence('D', letters));
    }
}
