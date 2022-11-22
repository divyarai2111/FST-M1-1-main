package activities;

class CustomException extends Exception{
    private String message;

    CustomException(String str){
        this.message=str;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
public class Activity8 {

    public static void main(String args[]) {
        try {
            exceptionTest("Will print exception");
            exceptionTest(null);
            exceptionTest("will this print?");
        }catch(CustomException e){
            System.out.println("Inside catch  "+e.getMessage());
        }


    }

    public static void exceptionTest(String message) throws CustomException{
        if(message==null)
            throw new CustomException("String is null");
        else
            System.out.println(message);
    }
}
