public class nested_loop7 {
    public static void main(String[] args) {
        int k= 1;
        for(int i=5; i>0; i-- )
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(k++ +" ");
            }
            System.out.println(" ");
        }
    }
    
}
