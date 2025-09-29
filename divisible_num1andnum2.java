import java.util.Scanner;
public class divisible_num1andnum2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of num::");
        int num= sc.nextInt();
        int num2= sc.nextInt();
        if(num%num2==0  || num2%num==0 )
        {
            System.out.print("yes it is divisible");

        }
        else
        {
            System.out.print("it is not divisible");
        }

    }
    
}
