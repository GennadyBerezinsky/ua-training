package ua.training;

import ua.training.abstract_factory.Client;
import ua.training.abstract_factory.product.DraculaTheme;
import ua.training.abstract_factory.product.IntelijiTheme;

/**
 * Created by User on 21.10.2018.
 */


public class Main {
    public static void main(String[] args) {
        /**
         * Abstract factory.
         * Creates windows with buttons of 2 themes: intellij and dracula
         * and print them.
         */
        {
            Client client = new Client();

            client.getForm(new DraculaTheme());
            System.out.println(client.printForm());

            client.getForm(new IntelijiTheme());
            System.out.println(client.printForm());
        }


    }
}
