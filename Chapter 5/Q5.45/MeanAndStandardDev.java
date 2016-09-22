import java.util.Scanner;

public class MeanAndStandardDev{
    
    public static void main(String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.print("Enter ten numbers: ");
            double sum = 0;
            double counter = 0;
            
            //Verify input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextDouble()){
                    
                    sum += scanInput.nextDouble();
                    counter++;
                    
                    if (counter == 10){
                        break;
                    }
                    
                }
                else{
                    String badInputStr = scanInput.next();
                    counter = 0;
                    sum = 0;
                    System.out.print("Re-enter ten numbers: ");
                }
                
                
            }
            
            System.out.println("Sum: " + sum);
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}