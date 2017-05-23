/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03.main;

import com.mycompany.lab03.models.Mark;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Константин
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "Bobby Lab1 123\n" +
                "Larry Lab2 456\n";
        
        List<Mark> markList = readInput(input);
        
        System.out.println("Success!");
    }
    
    
    public static List<Mark> readInput(String input){
        
        Scanner scanner = new Scanner(input);
        Boolean endOfSection = false;
        
        List<Mark> markList = new ArrayList();
        
        while (!endOfSection && scanner.hasNext()){
            String studentName = scanner.next();
            String markName = scanner.next();
            double mark = scanner.nextDouble();
            
            markList.add(new Mark(studentName, markName, mark));
            
            
        }
        
        return markList;
    }
}
