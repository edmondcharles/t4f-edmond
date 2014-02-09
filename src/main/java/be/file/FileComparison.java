package be.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import io.aos.console.AosConsole;

public class FileComparison {

    public static void main(String[] args) throws Exception {
  
        File file = new File("my simple - file. txt");
        
        String fileContent = " bla bla , I am the content";
        
        write(file,fileContent);
        
        String readFileContent = read(file);
        
        if( ! readFileContent.equals (fileContent)){
            throw new Exception ("NO ...");
        }
        else{
            AosConsole.print("Good, the read content =" + readFileContent);
        }

    }

    private static String read(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        return br.readLine();
    }

    private static void write(File file, String fileContent) throws IOException {
        FileWriter fileWriter = new FileWriter (file);
        fileWriter.write(fileContent);
        fileWriter.close();
    }

}
