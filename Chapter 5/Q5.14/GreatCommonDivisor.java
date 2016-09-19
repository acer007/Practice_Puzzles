import java.util.Scanner;

public class GreatCommonDivisor{
    
    public static void main(String args[]){
        
        try{
            
            Scanner scanInput = new Scanner(System.in);
            int n1 = 0, n2 = 0;
            
            System.out.print("Enter two integers in order to find the GCD between them: ");
            
            //Verify entry for two numbers
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
            
            //System.out.println("n1 = " + n1 + "\nn2 = " + n2);
            
            //Define variables accordingly
            int bigN = 0;
            int smallN = 0;
            if (n1 < n2){
                bigN = n2;
                smallN = n1;
            }
            else {
                bigN = n1;
                smallN = n2;
            }
            
            //Compute GCD
            int gcd = 0;
            
            for (int k = 1; k < bigN; k++){
                
                if ((bigN % k == 0) && (smallN % k == 0) && (k > gcd)){
                    gcd = k;
                }
                
            }
            
            if (gcd == 0){
                System.out.println("There is no greater common divisor " + 
                                    "between " + n1 + " and " + n2);
            }
            else{
                System.out.println("The greatest common divisor between " + 
                n1 + " and " + n2 + " is " + gcd);
            }
            
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}