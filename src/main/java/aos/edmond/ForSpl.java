package aos.edmond;

import aos.console.AosConsole;

public class ForSpl {

    /**
     * @param args
     */
    public static void main(String... args) {

        for (int i = 0; i <= 20; i++) {
            AosConsole.println(i);
        }

        AosConsole.println("-----------");

        for (int i = 100; i >= 90; i--) {
            AosConsole.println(i);
        }

    }

}
