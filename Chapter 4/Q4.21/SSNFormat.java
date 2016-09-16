import java.util.Scanner;

public class SSNFormat{
    
    public static void main(String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.print("Enter your SSN as XXX-XX-XXXX: ");
            String ssn = "";
            boolean proceed = true;
            
            //Verify input
            while (proceed){
                
                ssn = scanInput.next();
                
                if (ssn.length == 11){
                    
                    for (int k = 0; k < 3; k++){
                        
                        if (!(Character.isDigit(ssn[k]))){
                            String badInput = ssn;
                            System.out.print("Re-enter SSN as XXX-XX-XXXX: ");
                        }
                        else{
                            
                            for (int j = ){
                                
                            }
                            
                        }
                    }
                    
                }
            
                else{
                    String badInput = ssn;
                    System.out.print("Re-enter SSN as XXX-XX-XXXX: ");
                }
                
            }
            
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}