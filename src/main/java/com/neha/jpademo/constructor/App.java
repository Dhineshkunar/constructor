package com.neha.jpademo.constructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Student s = new Student();
//    	s.name="s";
//    	s.rollno=1;
//    	System.out.println(s.name);
        Student s = new Student(1, "d");
    	System.out.println(s.rollno);
    	System.out.println( "Hello World!" );
    }
}
