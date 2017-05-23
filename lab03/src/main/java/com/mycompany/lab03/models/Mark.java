/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab03.models;

/**
 *
 * @author Константин
 */
public class Mark {
    static int lastStudentNumber = 0;
    private int studentNumber;
    private String studentName;
    private String markName;
    private double markValue; 

    public Mark(String studentName, String markName, double markValue){
        lastStudentNumber++;
        this.setStudentNumber(lastStudentNumber);
        this.setStudentName(studentName);
        this.setMarkName(markName);
        this.setMarkValue(markValue);
    }
    
    public static int getLastStudentNumber() {
        return lastStudentNumber;
    }

    public static void setLastStudentNumber(int lastStudentNumber) {
        Mark.lastStudentNumber = lastStudentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public double getMarkValue() {
        return markValue;
    }

    public void setMarkValue(double markValue) {
        this.markValue = markValue;
    }
    
}
