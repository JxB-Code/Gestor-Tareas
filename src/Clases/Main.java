package Clases;

import GUI.LoginWindow;
import java.util.Scanner;

public class Main {
    public static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        LoginWindow login = new LoginWindow();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}

