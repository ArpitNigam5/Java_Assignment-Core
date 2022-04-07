
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationTest{
    public static void main(String[] args){
        
        ArrayList<Student> info = new ArrayList<>();
        
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Assignment_Java_core new\\Assignment_5\\Assignment_5\\output2.ser"));
            for(int i=0;i<5;i++)
            {
                Student S = (Student)in.readObject();
                info.add(S);
                System.out.println(S.FirstName+"\n"+S.DateOfBirth);
                System.out.println(S.address);
            }
               in.close();
            }
    catch(Exception e){
            e.printStackTrace();
        }
}
}