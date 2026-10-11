import java.util.Scanner;

public class greeting_conditions {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int button = Sc.nextInt();
        if (button == 1){
            System.out.println("Hello");
        }else if (button == 2){
            System.out.println("Namaste");
        }else if (button == 3){
            System.out.println("Bonjour");
        }else{
            System.out.println("Invalid Button");
        }
    }
}
