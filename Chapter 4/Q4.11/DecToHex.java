import java.util.Scanner;

public class DecToHex{
    
    public static void main(String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.println("Enter a Decimal Value (0 to 15): ");
            
            //Verify input
            int dec = 0;
            
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    dec = scanInput.nextInt();
                    
                    if (dec < 0 || dec > 15){
                        int badInputInt = dec;
                        System.out.print("Re-enter and integer between 0 and 15: ");
                    }
                    else{
                        break;
                    }
                }
                
                else{
                    String badInputStr = scanInput.next();
                    System.out.print("Re-enter a valid integer between 0 and 15: ");
                }
                
            }
            
            //Convert Decimal to Hex
            
            
            //Display
            
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}