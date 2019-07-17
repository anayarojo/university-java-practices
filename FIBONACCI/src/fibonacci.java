
public class fibonacci {
    public static int fibonacci(int n){
       
           if(n==1) return 1;
           else return n*(fibonacci(n-1));
       }
    public static void main(String[] args) {
       
       int n=5;
       
       int combinaciones=fibonacci.fibonacci(n);
       
       System.out.println(combinaciones);
        
    }
    

}
