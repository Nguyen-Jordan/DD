package fr.campus.DD.Case;

import fr.campus.DD.Menu.Menu;

public class EmptyCase implements Case{
    String message = "You are on a save room. Take a breath and continue";
    public EmptyCase () {
        Menu.slowPrint(this.message);
    }
}
