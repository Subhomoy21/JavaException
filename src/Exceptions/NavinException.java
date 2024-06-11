package Exceptions;

class NavinExceptions extends Exception{
    public NavinExceptions(String string){
        super(string);
    }
}

public class NavinException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try{
            j = 18/i;
            if(j==0){
                throw new NavinExceptions("I dont want zero" );
            }
        }
        catch (NavinExceptions e){
            // System.out.println("Cannot divide by Zero:" + e);
            j = 18/1;
            System.out.println("That the default output:" + e);
        }
        catch (Exception e){
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);
        System.out.println("Bye:");
    }
}
