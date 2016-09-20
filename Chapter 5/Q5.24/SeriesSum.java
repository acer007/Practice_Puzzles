public class SeriesSum{
    
    public static void main(String args[]){
        
        try{
            
            double n = 0.0;
            
            for (int k = 1; k < 99; k = (k + 2)){
                
                n += (k / (k + 2.0));
                
            }
            
            System.out.println("Sum of the series n / (n + 2) where n is 1 - 97 is: " + n);
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}