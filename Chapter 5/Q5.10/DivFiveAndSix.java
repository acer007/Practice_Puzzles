public class DivFiveAndSix{
    
    public static void main(String args[]){
        
        try{
            
            int counter = 0;
            
            for (int k = 100; k <= 1000; k++){
                
                /*if ((k % 5 == 0) && (k % 6 == 0)){
                    
                    System.out.print(k + " ");
                    counter++;
                }*/
                if (k % 30 == 0){
                    
                    System.out.print(k + " ");
                    counter++;
                }
                
                if (counter == 10){
                    System.out.print("\n");
                    counter = 0;
                }
                
            }
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}