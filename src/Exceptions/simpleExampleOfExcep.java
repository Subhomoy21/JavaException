package Exceptions;

public class simpleExampleOfExcep {
    public static void main(String[] args) {
        int [] ar = new int[5];
        System.out.println("Hello");
        try{
            System.out.println(ar[8]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Bhai error mat de red wala dil se burra lagta hai bass isko print karwa de!");
        }
        System.out.println("Bye");
    }
}
