import java.util.Scanner;

public class PalindromeInt{
    
    public static void main(String args[]){
        
        try{
            
            //Declare Scanner
            Scanner scanInput = new Scanner(System.in);
            
            //Prompt input
            System.out.print("Enter an integer to determine if it is a palindrome: ");
            
            int num = 0;
            
            //Verify input
            while (scanInput.hasNext()){
                
                if (scanInput.hasNextInt()){
                    num = scanInput.nextInt();
                    
                    if (num >= 0){
                        break;
                    }
                    else{
                        int badInputInt = num;
                        System.out.println("Re-enter a positive integer: ");
                    }
                    
                }
                else{
                    String badInputStr = scanInput.next();
                    System.out.println("Re-enter an integer: ");
                }
                
            }
            
            //int reversedNum = reverse(num);
            //System.out.println(reversedNum);
            boolean answer = isPalindrome(num);
            if (answer == true){
                System.out.println("The integer is a palindrome");
            }
            else{
                System.out.println("The integer is not a palindrome");
            }
            
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    //Methods
    
    //Return Reversal of Integer
    public static int reverse(int number){
        
        String numStr = "" + number;
        String copy = "";
        for (int k = numStr.length(); k > 0; k--){
            copy += numStr.charAt(k - 1);
        }
        int reversedNum = Integer.parseInt(copy);
        return reversedNum;
    }
    
    //Return true if number is a palindrome
    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }
    
    
}