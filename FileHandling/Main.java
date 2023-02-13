package FileHandling;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) {
        String[] arr ={
            "The mentor is good",
            "The students are good",
            "The college is good",
            "The state is also good"
    };
        try{
            FileWriter writer = new FileWriter("text.txt");
            for(String str : arr){
                writer.write(str);
                writer.write("\n");
            }
            writer.close();
        }catch(Exception e){
            System.out.println("exception occured");
        }
    }
}
