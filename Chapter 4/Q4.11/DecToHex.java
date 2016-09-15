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
            String hex = Integer.toHexString(dec);
            
            //Display
            System.out.println("The decimal " + dec + " in hexadecimal is " + hex);
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}