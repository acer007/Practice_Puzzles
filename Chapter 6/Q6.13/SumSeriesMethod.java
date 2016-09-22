public class SumSeriesMethod{
    
    public static void main(String args[]){
        
        try{
            
            System.out.println("i\t\tm(i)");
            System.out.println("-----------------------------------------------");
            displaySeries();
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void displaySeries(){
        
        double n = 0.0;
            
            for (int k = 1; k <= 20; k++){
                
                n += (k / (k + 1.0));
                System.out.println(k + "\t\t" + n);
            }
        
    }
    
}