import java.util.*;
public class do_while {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the value of n:");
        int sum=0;
        int n= sc.nextInt();
        int i=1;
        //for(int i=1; i<=n; i++)
        do
        {
        	Random rand= new Random();
        	int t= rand.nextInt(n)+1;
        	System.out.println("the random number is:"+t);
        	sum=sum+t;
        	      i++;
        }
        while(i<=n);
        double avg=(double)sum/n;
        System.out.println("the sum is:"+sum+"\nthe avrage is:"+avg);
	}

}
