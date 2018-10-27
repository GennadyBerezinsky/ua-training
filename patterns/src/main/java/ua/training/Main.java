package ua.training;

import com.sun.xml.internal.bind.v2.runtime.output.XMLStreamWriterOutput;
import ua.training.abstractFactory.Client;
import ua.training.abstractFactory.product.DraculaTheme;
import ua.training.abstractFactory.product.IntelijiTheme;
import ua.training.bridge.Window;
import ua.training.bridge.abstracts.MSWinAbs;
import ua.training.bridge.abstracts.MacOSAbs;
import ua.training.bridge.realisation.MSWin;
import ua.training.bridge.realisation.MacOs;
import ua.training.builder.Entity;

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
            System.out.println("Abstract factory");
            Client client = new Client();

            client.getForm(new DraculaTheme());
            System.out.println(client.printForm());

            client.getForm(new IntelijiTheme());
            System.out.println(client.printForm());

            System.out.println("______________________");
        }

        /**
         * Builder
         *
         */
        {
            System.out.println("Builder");
            Entity entity = new Entity.Builder().setName("Name").setSecondname("second name")
                    .setSurname("surname").setNickname("nickname").build();
            System.out.println(entity.toString());
            System.out.println("_______________________");
        }

        /**
         * Bridge
         */
        {
            Window window;
            window = new MacOSAbs(new MacOs());
            window.theme();

            window = new MSWinAbs(new MSWin());
            window.theme();
        }

    }
}
