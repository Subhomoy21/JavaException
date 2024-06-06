package Exceptions;

import java.util.Scanner;

class MyException extends Exception{
        // constructor
    public MyException(String message){
        super(message);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        try{
            int age = sc.nextInt();
            if(age>80){
                    throw new MyException("My error is this:");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
