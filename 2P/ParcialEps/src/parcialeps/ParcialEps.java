package parcialeps;
import javax.swing.*;
import java.awt.*;

public class ParcialEps {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            
            JFrame frame = new JFrame("Eps");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            
            JPanel panelIzquierdo = new JPanel();
            panelIzquierdo.setBackground(Color.LIGHT_GRAY);
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.gridx = 0;
            gbc.gridy = 0;
            panel.add(panelIzquierdo, gbc);
            
            JPanel panelDerecho = new JPanel();
            panelDerecho.setLayout(new GridBagLayout());
            gbc.weightx = 2.0;
            gbc.gridx = 1;
            panel.add(panelDerecho, gbc);

            JPanel panelSuperior = new JPanel();
            panelSuperior.setBackground(Color.GRAY);
            gbc.weighty = 1.0;
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            panelDerecho.add(panelSuperior, gbc);

            JPanel panelInferior = new JPanel();
            panelInferior.setBackground(Color.DARK_GRAY);
            gbc.weighty = 2.0;
            gbc.gridy = 1;
            panelDerecho.add(panelInferior, gbc);
            
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}

