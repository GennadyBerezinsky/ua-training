package ua.training.bridge.abstracts;

import ua.training.bridge.Implementator;
import ua.training.bridge.Window;

/**
 * Created by User on 26.10.2018.
 */


public class MacOSAbs extends Window {
    public MacOSAbs(Implementator imp) {
        super(imp);
    }

    public void theme() {
        System.out.println("MacOS abstraction");
        super.theme();
    }
}
