package com.login;

import javax.swing.SwingUtilities;

public class Login {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setVisible(true);
        });
    }
}