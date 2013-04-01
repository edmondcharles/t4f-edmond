package be.loop.nested;

import aos.console.AosConsole;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            AosConsole.println("..............");

            for (int j = 0; j < 10; j++) {

                if ((i == 2) && (j == 6)) {

                    AosConsole.println(i + " " + j + "€€€€€€€€€€€€€€€€");

                }
                else {

                    AosConsole.println(i + " " + j);
                }

            }

        }
    }

}
