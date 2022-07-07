package StarPattern;

public class RectangleStarPattern {
    public static void main(String[] args) {
        int row=3;
        int collumn= 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=collumn ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
