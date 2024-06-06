package Exceptions;

public class moreThanOneExceptions {
    public static void main(String[] args) {
//        int [] arr= new int[5];
//        try{
//            int res = 5/0;
//            System.out.println(arr[8]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Trying to access outer bound element:");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }
        int [] arr= new int[5];
        try{
            int res = 5/0;
            System.out.println(res);
            System.out.println(arr[8]);
        }
//        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
//            System.out.println("Handling the exception:");
//        } another process
        catch (Exception e){
            System.out.println("All exception handled!");
        }
    }
}
