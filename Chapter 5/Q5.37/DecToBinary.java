import java.util.Scanner;

public class DecToBinary{
    
    public static void main(String args[]){
        
        try{
            
            Scanner scanInput = new Scanner(System.in);
            
            // Prompt user input
            System.out.print("Enter a decimal digit to convert to " + 
                                "binary: ");
            
            //Verify Input as int
            int dec = 0;
            while (scanInput.hasNext()){
            
                if (scanInput.hasNextInt()){
                    
                    dec = scanInput.nextInt();
                    break;
                    
                }
                else{
                    
                    String badInputStr = scanInput.next();
                    System.out.print("Please re-enter an integer to be converted to binary: ");
                    
                }
            
            }
            
            //Convert input to binary, convert the remainder to a char and add it to a string as a loop
            String binaryStr = "";
                
                while (dec != 0){
                    
                    int rem = dec % 2;
                    binaryStr += Integer.toString(rem);
                    dec = dec / 2;
                    
                }
                if ((binaryStr.length() % 4) != 0){
                    
                    while ((binaryStr.length() % 4) != 0){
                        binaryStr += "0";
                    }
                    
                }
                
                //output
                binaryStr = palindrome(binaryStr);
                System.out.println("Binary Number: " + binaryStr);
                
            
            
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