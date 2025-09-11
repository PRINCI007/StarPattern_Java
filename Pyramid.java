public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            // print spaces| as the no of rows increases the no of spaces decreases by 1.
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            // print stars| as the no of rows increases the no of stars increases by 2.
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("* ");
            }    
        System.out.println();
    }
}
}
//the pattern in above code between row and column is row*2-1.



//when we want the even no of stars in the pyramid,we can see the pattern between row and columns is row*2
//so we can replace the 2*i-1 with 2*i and it will give us the even no of stars in the pyramid.
//like in row 1 we have 2*1=2 stars, in row 2 we have 2*2=4 stars and so on.


