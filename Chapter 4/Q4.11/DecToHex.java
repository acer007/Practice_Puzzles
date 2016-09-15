import java.util.Scanner;

public class DecToHex{
    
    public static void main(String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.print("Enter a Positive Decimal Value: ");
            
            //Verify input
            int dec = 0;
            
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    dec = scanInput.nextInt();
                    
                    if (dec < 0){
                        int badInputInt = dec;
                        System.out.print("Re-enter a positive integer: ");
                    }
                    else{
                        break;
                    }
                }
                
                else{
                    String badInputStr = scanInput.next();
                    System.out.print("Re-enter a positive integer: ");
                }
                
            }
            
            //Convert Decimal to Hex
            //String hex = Integer.toHexString(dec);
            
            String hex2 = convertToHex(dec);
            
            //Display
            //System.out.println("The decimal " + dec + " in hexadecimal is " + hex);
            System.out.println("Version 2: " + hex2);
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    /* convertToHex
     * Parameters: int
     * return: String
     */
     
    public static String convertToHex(int num){
        String hex = "";
        
        while (num != 0){
            int rem = num % 16;
            
            if (rem < 10){
                hex = hex + Integer.toString(rem);
            }
            else{
                switch (rem){
                    
                    case 10: hex += "A";
                             break;
                             
                    case 11: hex += "B";
                             break;
                             
                    case 12: hex += "C";
                             break;
                             
                    case 13: hex += "D";
                             break;
                             
                    case 14: hex += "E";
                             break;
                             
                    case 15: hex += "F";
                             break;
                             
                }
            }
            
            num = num / 16;
            
        }
        
        return hex;
    }
    
    /* palindrome
     * Parameters: String
     * return: String
     */
     
    public static String palindrome (String sequence){
        String copy = "";
        
        for (int k = sequence.length(); k >=0; k--){
            copy = copy + sequence.charAt(k);
        }
        
        return copy;
    }
    
}