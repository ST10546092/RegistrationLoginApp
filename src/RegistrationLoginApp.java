
import java.io.InputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class RegistrationLoginApp {
    /**
    *@aparam args the command line arguments
     */
    public static void main(String [] args){
        RegistrationLogin Uyanda = new RegistrationLogin();
        
        Scanner input =new Scanner (System.in);
        // must not contain underscore and <=5 chars)
        System.out.println("Enter username");
        String username = input.nextLine();
        if (Uyanda.checkUsername(username));
        System.out.println("correct");
        }else
      {
         System.out.println("Incorrect");
}

     public boolean checkPasswordComplexity(String password){
         //TODO code application Logic here
         //Characters long and contains a capital letter and a digit
         //A correct length
     }
     boolean hasLength= password.length()>=8;
     boolean hasNumbers= password.matches(".*[0-9].*")
             boolean hasUpper = password.matches(".*[A-Z].*");
             boolean hasSpecial = password.chars().anyMatch(c> !Character.letterOrdigit(c));
             return hasLength && hasNumbers && hasUpper && hasSpecial;
}
public boolean checkCellPhoneNumber(){
    //TODO: use a regualr expression to check the cell phone number
    // starts with the south african international code 
    // and is the correct length
    checkcellPhoneNumber(String cellNumber){
    if(cellNumber.startWith("+27") &&)
        cellNumber.length()==12){
        // Check if the rest are only digits 
        String numberPart =
                cellNumber.substring(1); 
        
        if(numberPart.matches("[0-9]")){
            return true;
        }
    }
        return false;
}
public static String registerCellNumber(String cellNumber){
        if(checkCellnumber(cellNumber(cellNumber)){
            return "Cell number successfully captured ";
        } else {
            return "Cell number is incorrectly formated; please enter the number and try again.";
            
        }
    }
    public static boolean loginUser(String enteredUsername, String enteredPassword, String CorrectUsername, String correctPassword){
        return
                enteredUsername.equals(correctUsername)&&
                enteredPassword.equals(correctPassword); 
    }
    
    public static boolean checkUsernamee(String username){
        return username.contains("_")&&
                username.length()<=5;
    }
    
    }
        
      
}
    
    
}
    