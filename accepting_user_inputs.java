import java.util.Scanner; 

public class accepting_user_inputs{
    public static void main (String[]agrs){
        
        Scanner sk= new Scanner(System.in);
        System.out.println("Hello, Please enter your name:");
        int age = sk.nextInt();
        System.out.println("Hello " + age);

        sk.close(); 
    }
}
