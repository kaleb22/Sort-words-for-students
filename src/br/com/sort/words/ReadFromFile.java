package br.com.sort.words;

import java.io.*;
import java.util.ArrayList;

public class ReadFromFile {

    public ArrayList<String> readFromFile(File file) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader =  new BufferedReader(new FileReader(file));

        String st;
        while((st = reader.readLine()) != null){
            list.add(st);
        }

        return list;
    }
}
