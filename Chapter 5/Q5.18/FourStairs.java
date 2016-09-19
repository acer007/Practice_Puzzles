import java.util.Scanner;

public class FourStairs{
    
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
            
            String keyA = "", keyB = "", keyC = "", keyD = "";
            
            //Pattern A
            System.out.println("Pattern A");
            
            for (int i = 0; i < lines; i++){
                
                keyA += (i+1) + " ";
                System.out.println(keyA);
                
            }
            
            
            //Pattern B
            System.out.println("Pattern B");
            
            for (int  i = lines; i > 0; i--){
                
                for (int k = 1; k < i; k++){
                    keyB += k + " ";
                }
                System.out.println(keyB);
                keyB = "";
            }
            
            /*for (int j = lines; j > 0; j--){
                
                for (int k = (lines - j); k > 0; k--){
                    
                    keyB = (keyB) + " " + k;
                    
                }
                
                System.out.println(keyB);
                keyB = "";
                
            }*/

            
            
            //Pattern C
            System.out.println("Pattern C");
            
            for (int i = 0; i < lines; i++){
                
                for (int k = 1; k < (lines - (i)); k++){
                    System.out.printf("  ");    
                }
                keyC = (i+1) + " " + keyC;
                System.out.println(keyC);
                
            }
            
            
            //Pattern D
            System.out.println("Pattern D");
            
            
            
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}