import java.util.*;

public class table_of_a_number_input_by_user {

    public static void main(String args []){
      Scanner sc = new Scanner (System.in);
     int n=sc.nextInt();
     for(int i=1; i<11; i++){
         System.out.println(i*n);
     }
    }
}
