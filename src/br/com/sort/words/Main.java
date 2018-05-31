package br.com.sort.words;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import br.com.sort.words.ReadFromFile;

public class Main {
    public static void main(String[] args) throws IOException, NullPointerException {
        ArrayList<String> students;
        ArrayList<String> words;
        
        ReadFromFile service = new ReadFromFile();

        File studentsFile = new File("C:\\Users\\Usuario\\Desktop\\file.txt");
        File wordsFile = new File("C:\\Users\\Usuario\\Desktop\\words.txt");

        students = service.readFromFile(studentsFile);
        words = service.readFromFile(wordsFile);
        

        Random random = new Random();

        for(int i = 0; i < 7; i++){
            int x = random.nextInt(students.size()-1) + 1; //students.size is our maximum and 1 our minimum
            int y = random.nextInt(words.size()-1) + 1;

            System.out.println(students.get(x) + "   :   " + words.get(y));
            students.remove(x);
            words.remove(y);
        }
    }
}
