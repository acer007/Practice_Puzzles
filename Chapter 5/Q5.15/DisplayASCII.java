public class DisplayASCII{
    
    public static void main(String args[]){
        
        try{
            
            int counter = 0;
            char ch;
            
            for (int k = 33; k <= 127; k++){
                
                ch = (char)k;    
                System.out.print(ch + " ");
                counter++;
                
                if (counter == 10){
                    System.out.print("\n");
                    counter = 0;
                }
                
            }
            
            System.out.println();
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
