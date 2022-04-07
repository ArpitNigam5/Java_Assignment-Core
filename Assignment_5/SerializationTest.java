import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationTest {
    public static void main(String[] args) {

        try{
            Student s1 = new Student("Ayan", "19-08-2002", "Indore", "MP", "India", 00001);
            Student s2 = new Student("Samkit", "10-10-2001", "Indore", "MP", "India", 00001);
            Student s3 = new Student("Ashu", "24-03-2003", "Indore", "MP", "India", 00001);
            Student s4 = new Student("Arpit", "23-05-2002", "Indore", "MP", "India", 00001);
            Student s5 = new Student("adi", "30-07-2002", "Indore", "MP", "India", 00001);
            
            FileOutputStream fos= new FileOutputStream("D:\\Assignment_Java_core new\\Assignment_5\\Assignment_5\\Output1.ser");
            try (ObjectOutputStream out = new ObjectOutputStream(fos)) 
            {
                ArrayList <Student> lis = new ArrayList<> ();
                    lis.add(s1);
                    lis.add(s2);
                    lis.add(s3);
                    lis.add(s4);
                    lis.add(s5);

                for(int i=0;i<lis.size();i++){
                    out.writeObject(lis.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}