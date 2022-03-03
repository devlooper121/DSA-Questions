// package getting started;
import java.util.Scanner;
public class isPrime {
      public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for(int j = 0 ; j < n ; j++){
          int n1 = scn.nextInt();
          if(n1%2 != 0 ||  n1 == 2){
            int flag = 0;
            for(int i = 2; i*i <= n1; i++){
              if(n1%i == 0){
                System.out.println("not prime");
                flag = 1;
                break;
              }
            }
            if(flag == 0){
              System.out.println("prime");
            }
          }else{
            System.out.println("not prime");
          }
          
        }
      }
}
