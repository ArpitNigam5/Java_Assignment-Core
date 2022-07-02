package Assignment_1;

import java.net.URL;
import java.util.Scanner;
import java.util.TreeMap;

public class Assignment_1{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
                System.out.println("\nURL List : ");
                Readwords.readOutput();
                System.out.println("\nWhich url you want to read : ");
                int urlnum = sc.nextInt();
                URL traversurl = Readwords.Reader(urlnum);
                TreeMap<String, Integer> wordcount = URLtest.traverse(traversurl);
                URLtest.Writer(wordcount);
                System.out.println("\n Done, you can See the file.");
        } catch (Exception e) {
            System.out.println("Wrong Input\n");
            System.out.println(e);
        }
    }
}
