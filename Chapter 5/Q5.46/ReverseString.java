import java.util.Scanner;

public class ReverseString{
    
    public static void main(String args[]){
        
        try{
            
            Scanner scanInput = new Scanner(System.in);

            System.out.print("Enter a string\nType 'quit' to quit the program: ");
            
            String entry = "";
            String input = "";
            
            while (scanInput.hasNext()){
                
                input = scanInput.next();
                if (input.equals("quit")){
                    break;
                }
                else{
                    entry = entry + " " + input;
                }

            }

            String copy = "";
        
            for (int k = entry.length(); k >= 1; k--){
                copy += entry.charAt(k-1);
            }
        
            System.out.println("The reversed string is " + copy);
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}