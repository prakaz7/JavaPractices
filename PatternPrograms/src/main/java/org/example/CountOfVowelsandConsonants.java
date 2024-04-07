package org.example;

public class CountOfVowelsandConsonants {
    public static void main(String[] args) {
        String sentance = "This is the 3 line courses";
        sentance.toLowerCase();
        int vowels = 0, consonants=0, whitespaces=0, digits = 0;
        for(int i =0; i<sentance.length();i++){
            char ch = sentance.charAt(i);
            if ((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u')){
                ++vowels;
            } else if ((ch>='a' && ch<='z')) {
                ++consonants;
            } else if (ch>='0' && ch<='9') {
                ++digits;
            } else if (ch==' ') {
                ++whitespaces;
            }
        }
        System.out.println("The vowels count is : " +vowels);
        System.out.println("The Consonants count is : " +consonants);
        System.out.println("The whitespaces count is : " +whitespaces);
        System.out.println("The digits count is : " +digits);

    }
}
