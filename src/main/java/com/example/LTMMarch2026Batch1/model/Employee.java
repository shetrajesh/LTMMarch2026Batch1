package com.example.LTMMarch2026Batch1.model;

import java.util.Scanner;

public class Employee {

    private int employeeId;
    private String employeeName;

    public void read(){
        Scanner sc=new Scanner(System.in);
        int employeeId=sc.nextInt();
        String employeeName=sc.nextLine();
    }
}
