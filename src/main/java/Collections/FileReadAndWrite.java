package Collections;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadAndWrite {
    public static void main(String[] args) throws IOException {
        String File_path = "C:\\Spring\\Day1\\src\\main\\java\\Collections\\file.txt";
        Path f=  Paths.get(File_path);
        Files.createFile(f);
        String str="Vaa da Macha";
        //To Write the file
        File file= new File(File_path);
        file.createNewFile();
        BufferedWriter writer= new BufferedWriter(new FileWriter(File_path,true));
        writer.write(str);
        writer.close();
        //To read the file
        BufferedReader Br= new BufferedReader(new FileReader(File_path));
        Br.read();
        System.out.println(Br.readLine());
        Br.close();
        String line= Br.readLine();
        //To read the multiple lines
        while(line != null){
            System.out.println(Br.readLine());
            line= Br.readLine();
        }
        //to check whether the file is exist
        System.out.println(Files.exists(f));
    }
}
