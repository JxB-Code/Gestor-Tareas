package Clases;

import RegistrationGUI.MainWindow;
import java.util.ArrayList;

public class Main {

    public static ArrayList<User> users = new ArrayList();

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
