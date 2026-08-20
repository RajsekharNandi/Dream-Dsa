import java.util.*;
public class Main5 {
    public static void main(String[] args){
       int n = 3456;
        int a,b;
        boolean flag = true;
         while(n%10 != 0){
          a = n%10;
          b = (n/10)%10;
          if(a<b){
              flag = false;
              break;
          }
         }
         if(flag){
             System.out.println("The digits are in descending order");
         } else {
             System.out.println("The digits are not in descending order");
         }
       
    }
}
