import java.util.Scanner;

public class DisplayPattern{
    
    public static void main(String args[]){
        
        try{
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.print("Enter an integer: ");
            
            int num = 0;
            
            //Verify input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    num = scanInput.nextInt();
                    
                    if (num > 0){
                        break;
                    }
                    else{
                        int badInputInt = num;
                        System.out.println("Re-enter a positive integer > 0: ");
                    }
                    
                }
                else{
                    String badInputStr = scanInput.next();
                    System.out.println("Re-enter an integer: ");
                }
                
            }
            
            display(num);
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    // Display method
    public static void display(int number){
        
        String keyC = "";
        
        for (int i = 1; i <= number; i++){
                
            for (int k = i; k < (number); k++){
                System.out.print("  ");    
            }
            if (i == 1){
                keyC = i + "";
            }
            else{
                keyC = (i) + " " + keyC;
            }
            System.out.println(keyC);
                
        }
            
    }
    
}