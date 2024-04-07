package DailyPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("Hello");
        arrayList.add("Welcome");

        System.out.println(arrayList);

        String[] string = arrayList.toArray(new String[arrayList.size()]);
        System.out.println(Arrays.toString(string));



        String[] str = {"Vanakkam", "Da", "Mapla"};
        ArrayList<String> newList =new  ArrayList<>(Arrays.asList(str));
        System.out.println(newList);


    }
}
