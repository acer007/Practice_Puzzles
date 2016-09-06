// Solve a linear algebra problem

public class LinearAlgebra{
    
    public static void main (String args[]){
        
        //Display equation
        System.out.println("System of Equations\n====================");
        System.out.println("3.4x + 50.2y = 44.5 \n" + 
                            "2.1x + 0.55y = 5.9");
                            
        //Use Cramer's rule to solve for each variable
        double x = (int)(((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)) * 100) / 100.00;
        
        double y = (int)(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)) * 100) / 100.00;
        
        //Display Solution
        System.out.println("\nSolution\n====================");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        
    }//end of main
    
}//end of class