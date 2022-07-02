package Assignment_1;

import java.util.Scanner;

public class Countwords{
    

    public static String[] inputwords() {
        String[] data = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words for count: \n");
        System.out.print("Enter the first word you want: ");
        data[0] = sc.next();
        System.out.print("Enter the second word you want: ");
        data[1] = sc.next();
        System.out.print("Enter the third word you want: ");
        data[2] = sc.next();

        return data;
    }

    public static int[] wordscount(String urlword, String[] data, int[] countword) {
        String[] split = urlword.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (data[0].equals(split[i])) {
                countword[0] ++;
            }
            if (data[1].equals(split[i])) {
                countword[1]++;
            }
            if (data[2].equals(split[i])) {
                countword[2]++;
            }
        }
        return countword;
    }
}