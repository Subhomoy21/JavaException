package Exceptions;

public class throwAndThrows {
    static  int getNumberFromArray(int[]arr) throws ArithmeticException{ // here developer already stated that the method might throw exception
        return arr[8];
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        // toh jab pata haii ki exception aa sakta hai toh kyu na exception ko solve kar lo!
        //  using try catch block

        try{
            getNumberFromArray(arr);
        }
        catch (Exception e){
            System.out.println("Exception Catched" + e.getMessage());
        }
    }
}
