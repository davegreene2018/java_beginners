import java.util.Random;
import java.util.Scanner;



class Lottery2

{



    private int lotteryNumbers[];



    public Lottery2() {

        Random rand = new Random(System.currentTimeMillis());

        lotteryNumbers = new int[5];

        for (int i = 0; i < lotteryNumbers.length; i++) {

            lotteryNumbers[i] = Math.abs(rand.nextInt()) % 10;

        }

    }





    public int compareNumbers(int[] usersNumbers) {

        int match = 0;

        if (usersNumbers.length == lotteryNumbers.length) {

            for (int i = 0; i < lotteryNumbers.length; i++) {

                if (usersNumbers[i] == lotteryNumbers[i]) {
                    match++;

                }

            }

        }

        return match;

    }



    public int[] getLotteryNumbers() {

        return lotteryNumbers;

    }

}
