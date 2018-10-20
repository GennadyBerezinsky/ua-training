<<<<<<< HEAD
package view.reader;

import java.util.Scanner;

/**
 * Created by User on 13.10.2018.
 */


public class ConsoleReader implements Reader {
    Scanner scanner = new Scanner(System.in);


    public String read() {
        return scanner.nextLine();
    }
}
=======
package view.reader;

import java.util.Scanner;

/**
 * Created by User on 13.10.2018.
 */


public class ConsoleReader implements Reader {
    Scanner scanner = new Scanner(System.in);


    public String read() {
        return scanner.nextLine();
    }
}
>>>>>>> 2c53b71b2a9897adeff5c7fe99dbf05774097027
