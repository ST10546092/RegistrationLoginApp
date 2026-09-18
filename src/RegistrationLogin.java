/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 }
/**
 *
 * @author Student
 */
public class RegistrationLogin {
    public static void main(String [] args){
        RegistrationLogin Uyanda = new RegistrationLogin();
        
        Scanner input = new Scanner(System.in);
        // Must not conatian underscore the must be <=5 chars
        System.out.println("Enter username");
        String username= input.nextLine();
        if(Uyanda.checkUsername(username)){
            System.out.println("Correct format");
        }else{
            System.ot.printLn("Incorrect Format");
        }
         
    }

    boolean checkUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
