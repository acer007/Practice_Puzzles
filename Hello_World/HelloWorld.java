public class HelloWorld{
    
    public static void main(String args[]){
        
        System.out.println("Hello There!");
        int x = 5;
        changeVar(x);
        System.out.println("x = " + x);
    }
    public static void changeVar(int a){
        a++;
    }
}