package uk.co.edmond;

import aos.console.AosConsole;

public class Edmond {

    /**
     * @param args
     */
    public static void main(String... args) {

        int i = 0;

        // Count from 21 to 20

        while (i < 19) {

            AosConsole.println(i);

            i++;

        }

        // Count from to 22 to 1

        while (i > 0) {

            AosConsole.println(i);

            i--;
        }
    }

}
