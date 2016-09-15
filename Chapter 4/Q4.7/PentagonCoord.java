// Enter the radius of the bounding circle and determine the coordinates of
// five corner points of a pentagon bounded within the circle

import java.util.Scanner;

public class PentagonCoord{
    
    public static void main (String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);

            //Prompt input
            System.out.print("Enter the radius of the bounding circle: ");
            double radius = 0;
            
            //Verify input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextDouble()){
                    radius = scanInput.nextDouble();
                    
                    if (radius <= 0){
                        double badInputDouble = radius;
                        System.out.print("Re-enter the radius: ");
                    }
                    else
                        break;
                }
                
                else{
                    String badInputStr = scanInput.next();
                    System.out.print("Re-enter the radius: ");
                }
                
            }
            
            //Generate 5 coordinate points
            double vertex1X, vertex1Y, vertex2X, vertex2Y, vertex3X, vertex3Y,
            vertex4X, vertex4Y, vertex5X, vertex5Y;
            
            double radian = (2.0 / 5.0) * Math.PI;
            //System.out.println("Radian: " + radian);
            
            vertex1X = xCoord(radius, radian, 1);
            vertex1Y = yCoord(radius, radian, 1);
            
            vertex2X = xCoord(radius, radian, 2);
            vertex2Y = yCoord(radius, radian, 2);
            
            vertex3X = xCoord(radius, radian, 3);
            vertex3Y = yCoord(radius, radian, 3);
            
            vertex4X = xCoord(radius, radian, 4);
            vertex4Y = yCoord(radius, radian, 4);
            
            vertex5X = xCoord(radius, radian, 5);
            vertex5Y = yCoord(radius, radian, 5);
            
            //Display
            System.out.println("\nThe coordinates of the five vertices within the circle are:");
            System.out.println("Vertex 1 (" + vertex1X + ", " + vertex1Y + ")");
            System.out.println("Vertex 2 (" + vertex2X + ", " + vertex2Y + ")");
            System.out.println("Vertex 3 (" + vertex3X + ", " + vertex3Y + ")");
            System.out.println("Vertex 4 (" + vertex4X + ", " + vertex4Y + ")");
            System.out.println("Vertex 5 (" + vertex5X + ", " + vertex5Y + ")");
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//end main
    
    /* X-coordinate
     * Parameters: Double radius, double radian, int i
     * return: double
     */
    public static double xCoord (double radius, double radian, int i){
        double ans = radius * Math.cos(radian * i);
        ans = ((int)(ans * 1000)) / 1000.0;
        return ans;
    }
    
    /* Y-coordinate
     * Parameters: Double radius, double radian, int i
     * return: double
     */
    public static double yCoord (double radius, double radian, int i){
        double ans = radius * Math.sin(radian * i);
        ans = ((int)(ans * 1000)) / 1000.0;
        return ans;
    }
    
    
    
}//end class