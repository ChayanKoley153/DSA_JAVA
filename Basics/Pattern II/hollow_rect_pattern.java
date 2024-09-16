public class hollow_rect_pattern {

    public static void hollow_rectangle(int totRows, int toCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner - columns
            for (int j = 1; j <= toCols; j++) {
                // cell - (i, j)
                if (i == 1 || i == totRows || j == 1 || j == toCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(10, 7);
    }
}
