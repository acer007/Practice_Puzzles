//Print a table

public class PrintTable{
    
    public static void main (String args[]){
        
        try{
            
            //Print a bold heading
            String header = "\033[1ma \t b \t pow(a, b) \033[0m";
            System.out.println(header);
            
            //Declare Variables
            int a, b, c;
            
            //Display
            for (int k = 1; k <=5; k++ ){
                a = k;
                b = a+1;
                c = (int)Math.pow(a, b);
                System.out.printf("%d \t %d \t %d \n",a, b, c);
                
            }
        
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end of main
    
}//end fo class