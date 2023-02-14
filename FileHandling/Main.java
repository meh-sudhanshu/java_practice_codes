import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // File fileObj = new File("text.txt");
        // try{
        //     fileObj.createNewFile();
        // }catch(Exception e){
        //     e.printStackTrace();
        // }

        String[] arr ={
            "India is a strong nation",
            "India is a democratic soil",
            "Bihar is a great state and also dangerous",
            "I am a good boy"
        };
        // try{
        //     FileWriter writer = new FileWriter("text.txt");
        //     for(String str : arr){
        //         writer.write(str+"\n");
        //     }
        //     writer.close();
        // }catch(Exception e){
        //     e.printStackTrace();
        // }

        try{
            File myObj = new File("test.txt");
            myObj.createNewFile();
            Scanner sc = new Scanner(myObj);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        // reading from a file

       
    }
}