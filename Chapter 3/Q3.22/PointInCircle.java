/* User enters an (x, y) coordinate point
 * Program determines if the point is on a circle centered at the origin whose
 * radius is 10
 */
 
import java.util.Scanner;

public class PointInCircle{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Declare variables
            double x = 0, y= 0, distance = 0;
            boolean proceed = true, loop = true, verify = true;
            String key = "";
            
            while (loop){
                
                //Prompt input
                System.out.print("Enter a point with two coordinates (x, y): ");
                
                //Verify inputs
                while (scanInput.hasNext()){
                        
                    if (scanInput.hasNextDouble()){
                        x = scanInput.nextDouble();
                        break;
                    }
                    else{
                        String badInputStr = scanInput.next();
                        System.out.print("\nInvalid input. Please enter integers: ");
                    }
                }
                    
                while (scanInput.hasNext()){
                        
                    if (scanInput.hasNextDouble()){
                        y = scanInput.nextDouble();
                        break;
                    }
                    else{
                        String badInputStr = scanInput.next();
                        System.out.print("\nInvalid input. Please enter integers: ");
                    }
                }
                    
                
                
                //Calculate the distance
                distance = distance(x, y);
                
                //Display result
                if (distance <= 10){
                    System.out.println("Point (" + x + ", " + y + ") is in " + 
                    "the circle");
                }
                else{
                    System.out.println("Point (" + x + ", " + y + ") is not " + 
                    "in the circle");
                }
                
                //Continue the program
                System.out.print("\nPerform another calculation? ('y'/'Y' " + 
                "for yes or 'q'/'Q' to quit): ");
                
                while (verify){
                    
                    key = verifyContinuation(scanInput);
                        
                        if (key.equals("Q") || key.equals("q")){
                            verify = false;
                            loop = false;
                        }
                        else if (key.equals("e")){
                            System.out.println("Please re-enter 'Y' or 'y' to" +
                            " continue or enter 'Q' or 'q' to quit: ");
                        }
                        else{
                            //proceed = true;
                            System.out.println();
                            break;
                        }
                        
                }
                
            }

        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    //Methods
    
    /* Verify continuation
     * Parameters: Scanner
     * return: String
     */
    public static String verifyContinuation (Scanner scanInput){
        
        String key = "e";
        if (scanInput.hasNext()){
            
            key = scanInput.next();
            
            if (key.equals("Y") || key.equals("y") || key.equals("Q") || key.equals("q"))
                return key;
                
            else{
                String badInputStr = key;
                return "e";
            }
        }
        
        else{
            String badInputStr = scanInput.next();
            return "e";
        }
        
    }
    
    /* Calculate distance
     * Parameters: double x, double y
     * return: double
     */
    public static double distance(double i, double k){
        double answer = Math.sqrt((i * i) + (k * k));
        return answer;
    }
    
}