package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("TestFile");
            Scanner scanFile = new Scanner(fr);
            while (scanFile.hasNextLine()) {
                System.out.println(scanFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
