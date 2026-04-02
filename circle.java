public class CirclePattern {
    public static void main(String[] args) {
        int radius = 10;
        // Iterate through rows and columns of a 2r x 2r grid
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                // Distance formula: sqrt((x2-x1)^2 + (y2-y1)^2)
                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
                
                // Print '*' if the distance is close to the radius
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

