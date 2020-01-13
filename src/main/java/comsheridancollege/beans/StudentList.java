/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comsheridancollege.beans;

import java.util.Scanner;

/**
 *
 * @author ewedf
 */
public class StudentList {
    public static void main (String[] arg){
        
        Student [] s = new Student [2];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i <= s.length ; i++)
        {
        s[i] = new Student();
        System.out.println("Enter Student Id: ");
        s[i].setId(scan.nextInt());
        System.out.println("ID:" +s[i].getId());
        }
        
        /*Student s1 = new Student();
        s1.setId("991495299");
        s1.setName("Mohammed");
        s1.setAddress("Ironstone");
        System.out.println(s1.getName());
        */
        /*
        Student [] studentList = new Student[2];
        
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setId("991495299");
        s1.setName("Mohammed");
        s1.setAddress("Ironstone");
        
        s2.setId("991495222");
        s2.setName("Micheal");
        s2.setAddress("webb drive");
        
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        
        studentList[0]=s1;
        studentList[1]=s2;
        */
        /*
        for(Student s: studentList){
            s.setName("Micheal");
            System.out.println(s.getName());
        }
        */
        
        
        
    }
    
}
