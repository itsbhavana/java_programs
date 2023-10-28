import java.util.*;

class SumOfNNaturalNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value :" );
        int n = sc.nextInt();
        
        int sum =  (n * (n + 1)) / 2;
        System.out.println("Sum of N natural Numbers is " + sum);


    }
}