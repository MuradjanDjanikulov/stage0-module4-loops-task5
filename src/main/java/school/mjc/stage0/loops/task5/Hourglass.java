package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 2) {
            return;
        }
        if(height%2==0) {
            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < height - 2 * i; k++) {
                    System.out.print("8");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }


                if (i < height / 2 - 1) {
                    System.out.println();
                }

            }
            System.out.println();

            // Bottom half of the hourglass
            for (int i = height / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < height - 2 * i; k++) {
                    System.out.print("8");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                if (i > 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
        else {
            // Top half of the hourglass
            for (int i = 0; i < height / 2 + 1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < height - 2 * i; k++) {
                    System.out.print("8");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                if (i < height / 2) {
                    System.out.println();
                }
            }
            System.out.println();

            // Bottom half of the hourglass
            for (int i = height / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < height - 2 * i; k++) {
                    System.out.print("8");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                if (i > 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }

    }
}