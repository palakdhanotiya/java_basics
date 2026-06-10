import java.util.Scanner;
public class SumSeries  {
    public static void main(String[] args){
        
        Scanner sc = new java.util.Scanner(System.in);
        int sum =0;

        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n ; i++){
            sum += i;

            if(i<n){
                System.out.print(i + " + ");
            }else{
                System.out.print(i);
            }
        }
        System.out.println(" = " + sum);
        sc.close();
    }
}
