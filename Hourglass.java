public class Hourglass {
    public static void main(String[] args) {
        int n = 5; // Height of the hourglass

        // Upper part of the hourglass
        for(int i=1;i<=n;i++){   //or to remove the one star from the end; i<=n-1;it will lead to stop the last iteration;
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=(2*(n-i)+1);k++){
                System.out.print("* ");
            }System.out.println();
        }
        for(int i=2;i<=n;i++){  //or let start the second half as i=2; here we did the same.
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("* ");
            }System.out.println();
        }
}
}