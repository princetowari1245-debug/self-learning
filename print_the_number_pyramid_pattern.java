

import java.util.*;

public class print_the_number_pyramid_pattern {
    public static void main(String[] args) {
        int n=5;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print(i+" ");
           }
           System.out.println();
       }
    }
}
