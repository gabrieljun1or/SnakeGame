package org.example;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class StartGame extends javax.swing.JFrame {
    public static void main(String[] args) {
        new StartGame();
    }

    StartGame() {
        add(new StartGame());
        setTitle("Jogo da Cobrinha - Snake game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

}
