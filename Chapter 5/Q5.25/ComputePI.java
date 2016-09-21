public class ComputePI{
    
    public static void main(String args[]){
        
        try{
            
            double pi = 0;
            double numerator = -1.0, denominator = 0, sum = 0;
            
            for (int k = 1; k <= 100000; k++){
                
                numerator *= -1;

                denominator = 2.0 * k - 1.0;
                sum = (numerator / denominator);
                pi += sum;  
                
                if ((k % 1000) == 0){
                    double ans = 4.0 * pi;
                    System.out.println(k + ": \t" + ans + "");
                }
                
            }
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}