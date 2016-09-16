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
                
                int hex = (int)hexDigit - 48;
                String binary1 = "";
                
                while (hex != 0){
                    
                    int rem = hex % 2;
                    binary1 += Integer.toString(rem);
                    hex = hex / 2;
                    
                }
                if (binary1.length() < 4){
                    
                    while (binary1.length() != 4){
                        binary1 += "0";
                    }
                    
                }
                binary1 = palindrome(binary1);
                System.out.println("Binary Number: " + binary1);
                
            }
            
            else if (Character.isUpperCase(hexDigit)){
                
                //check if capital letter ascii code is between 65 - 70
                int hex = (int)hexDigit - 65;
                String binary1 = "";
                
                if (hex <= 5){
                    
                    hex += 10;
                    
                    while (hex != 0){
                    
                        int rem = hex % 2;
                        binary1 += Integer.toString(rem);
                        hex = hex / 2;
                    
                    }
                    
                    if (binary1.length() < 4){
                        
                        while (binary1.length() != 4){
                            binary1 += "0";
                        }
                        
                    }
                    binary1 = palindrome(binary1);
                    System.out.println("Binary Number: " + binary1);
                    
                }
                
            }
            
            else if (Character.isLowerCase(hexDigit)){
                
                //check if capital letter ascii code is between 97 - 102
                int hex = (int)hexDigit - 97;
                String binary1 = "";
                
                if (hex <= 5){
                    
                    hex += 10;
                    
                    while (hex != 0){
                    
                        int rem = hex % 2;
                        binary1 += Integer.toString(rem);
                        hex = hex / 2;
                    
                    }
                    
                    if (binary1.length() < 4){
                        
                        while (binary1.length() != 4){
                            binary1 += "0";
                        }
                        
                    }
                    binary1 = palindrome(binary1);
                    System.out.println("Binary Number: " + binary1);
                    
                }
                
            }
            
            //invalid
            else{
                System.out.println(hexDigit + " is an invalid input");
            }
            
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    /* palindrome
     * Parameters: String
     * return: String
     */
     
    public static String palindrome (String sequence){
        String copy = "";
        
        for (int k = sequence.length(); k >= 1; k--){
            copy += sequence.charAt(k-1);
        }
        
        return copy;
    }
    
}