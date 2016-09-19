import java.util.Scanner;

public class GreatCommonDivisor{
    
    public static void main(String args[]){
        
        try{
            
            Scanner scanInput = new Scanner(System.in);
            int n1 = 0, n2 = 0;
            
            System.out.print("Enter two integers in order to find the GCD between them: ");
            
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    
                    n1 = scanInput.nextInt();
                    
                    if (scanInput.hasNextInt()){

                        n2 = scanInput.nextInt();
                        break;
                    
                    }
                    else{
                        int badInputInt = n1;
                        String badInputStr = scanInput.next();
                        System.out.print("Enter two ints: ");

                    }
                    
                }
                
                else{
                    String badInputStr1 = scanInput.next();
                    String badInputStr2 = scanInput.next();
                    int badInputInt = n1;
                    System.out.print("Enter two integers: ");
                    
                }
                
            }
            
            
            System.out.println("n1 = " + n1 + "\nn2 = " + n2);
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}