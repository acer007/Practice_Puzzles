import java.util.Scanner;

public class NumberPyramid{
    
    public static void main(String args[]){
        
        try{
            
            Scanner scanInput = new Scanner(System.in);
            
            System.out.print("Enter the number of lines: ");
            int lines = 0;
            
            //Verify Input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    
                    lines = scanInput.nextInt();
                    
                    if (lines < 0){
                        
                        int badInputInt = lines;
                        System.out.println("Re-enter the number of lines " + 
                                    "as a positive whole number: ");
                    }
                    
                    else
                        break;
                    
                }
                
                else{
                    
                    String badInputStr = scanInput.next();
                    System.out.print("Enter the number of lines as a " + 
                                        "whole number: ");
                    
                }
                
            }
            
            //Print out pyramid
            String key = "";
            
            for (int k = 1; k <= lines; k++){
                
                //must nest another for loop in order to determine centeredness
                for (int j = 0; j < (lines - k); j++){
                    System.out.printf("   ");
                }
                
                if (k == 1){
                    key = " " + k + " ";
                    System.out.println(key);
                }
                else{
                    key = " " + k + " " + key + " " + k + " ";
                    System.out.println(key);
                }
                
            }
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}