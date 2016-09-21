import java.util.Scanner;

public class FirstDayEachMonth{
    
    public static void main(String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.print("Enter the year: ");
            int year = scanInput.nextInt();
            
            System.out.print("Enter first day of the year as an int (Sunday=0, Monday=1, Tuesday=2, ...): ");
            int wkday = scanInput.nextInt();
            
            //Output
            for (int k = 1; k <= 12; k++){
                
                switch(wkday){
                    
                    case 1: 
                            System.out.println();
                            break;
                    
                }
                
            }
            
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}