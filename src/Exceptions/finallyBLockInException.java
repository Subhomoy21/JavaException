package Exceptions;

public class finallyBLockInException {
    public static void main(String[] args) {
        int [] ans = new int[5];
        //case 1: when there is exception in try block
//        try{
//            System.out.println(ans[9]);
//        }
//        catch (Exception e){
//            System.out.println("Exception Handling");
//        }
//        finally {
//            System.out.println("I will run always:");
//        }
//        System.out.println("Finished");
        // for above code
        // output -
        //Exception Handling
        //I will run always:
        //Finished

        // case 2: when there is no exception in try block
        try{
            System.out.println(ans[1]);
        }
        catch (Exception e){
            System.out.println("Exception Handled");
        }
        finally {
            System.out.println("I will run anyway");
        }
        System.out.println("It's the end");
    }
}
