package solutionfortest03;

public class workingsolution {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            int value = i % 2 == 0 ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = 1 - value;
            }
            System.out.println();
        }
    }
}