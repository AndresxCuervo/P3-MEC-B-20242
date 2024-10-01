package parcialeps;


import javax.swing.*;
import java.awt.*;

public class ParcialEps {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("EPS");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 400);
        ventana.setLayout(new BorderLayout());

        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setPreferredSize(new Dimension(200, 0));

        JPanel panelDerecho = new JPanel();
        panelDerecho.setLayout(new BorderLayout());

        JPanel panelSuperiorDerecho = new JPanel();
        panelSuperiorDerecho.setPreferredSize(new Dimension(0, 133));

        JPanel panelInferiorDerecho = new JPanel();

        panelDerecho.add(panelSuperiorDerecho, BorderLayout.NORTH);
        panelDerecho.add(panelInferiorDerecho, BorderLayout.CENTER);

        ventana.add(panelIzquierdo, BorderLayout.WEST);
        ventana.add(panelDerecho, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}


