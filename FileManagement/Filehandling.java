package FileManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling  {
    public static void main(String[] args) throws IOException {
try {
    File f = new File("nikhil.txt") ;
    if(!f.exists()){
        if(f.createNewFile()){
            System.out.println("New File created with name :: "+ f.getName() + "Of size :: " + f.length() + "Added at path :: "+ f.getAbsolutePath());
        }else{
            System.out.println("File does not created");
        }
    }else{
        System.out.println("File already exists");
    }

    // write ops
    writeInFile("Hello from Node family");
    writeInFile("Hello from React family");
    writeInFile("Hello from Express family");

    // read ops
  StringBuilder data=  readInFile();
    System.out.println(data);

} catch (Exception e) {
    System.out.println("IO Execption occured" + e);
    e.printStackTrace();
}
    }

    static void writeInFile(String content){
        try {
            FileWriter fw = new FileWriter("nikhil.txt", true); // Append mode
            fw.write(content);
            fw.write("\n"); // Move to next line
            fw.close();
        } catch (Exception e) {
            System.out.println("Error in file writter ops " + e);
            e.printStackTrace();
        }

    }

    static StringBuilder readInFile(){
        try {
            File fr = new File("nikhil.txt");
            Scanner sc = new Scanner(fr);
            StringBuilder data = new StringBuilder();
            while(sc.hasNextLine()){
          data.append(sc.nextLine()+"\n");
            }
            return data;

        } catch (Exception e) {
            System.out.println("Error in file read ops " + e);
            e.printStackTrace();
        }

        return null;
    }
}
