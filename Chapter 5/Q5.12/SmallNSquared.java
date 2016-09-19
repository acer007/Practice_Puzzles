public class SmallNSquared{
    
    public static void main(String args[]){
        
        try{
            
            int n = 0;
            
            while (Math.pow(n, 2) < 12000){
                
                n++;
                
            }
            
            System.out.println("Smallest value of n in order for n^2 > 12000: " + n);
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}