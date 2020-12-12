package FlightControl;

import flightControl.domain.*;
import flightControl.logic.FlightControl;
import java.util.Scanner;
import flightControl.ui.TextUI;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl fl = new FlightControl();
        TextUI tui = new TextUI(fl, scanner);
        tui.start();
    }
}
