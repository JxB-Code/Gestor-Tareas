package Clases;

import GUI.LoginWindow;
import java.util.ArrayList;

public class Main {

    public static ArrayList<User> users = new ArrayList();

    public static void main(String[] args) {

        LoginWindow login = new LoginWindow();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    public void createUser(String nombre, String password) {
        User usuario = new User(nombre, password);
        users.add(usuario);
    }
}
