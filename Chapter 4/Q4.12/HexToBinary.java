import java.util.Scanner;

public class HexToBinary{
    
    public static void main (String args[]){
        
        try{
            
            // Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            // Prompt user input
            System.out.print("Enter a hexadecimal digit to convert to " + 
                                "binary: ");

            String hexString = scanInput.next();
            char hexDigit = hexString.charAt(0);
            
            //System.out.println("Hex String: " + hexString);
            //System.out.println("Hex Char: " + hexDigit);
            if (Character.isDigit(hexDigit)){
                int hexInt = hexString.toInteger();
            }
            
            if (Character.isUpperCase(hexDigit)){
                
                //check if capital letter ascii code is between 65 - 70
                
                
                //invalid
                
                
            }
            
            if (Character.isLowerCase()){
                
                //check if capital letter ascii code is between 97 - 102
                
                
                //invalid
                
                
            }
            
            //invalid
            else{
                System.out.println(hexDigit + "is an invalid input");
            }
            
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}