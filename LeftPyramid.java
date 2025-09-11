public class LeftPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            // print stars| as the no of rows increases the no of stars increases by 1.
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }    
        System.out.println();
    }
}
}
