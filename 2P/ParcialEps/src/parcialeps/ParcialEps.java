package parcialeps;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParcialEps {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("EPS");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 800);
        ventana.setLayout(new BorderLayout());

        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setPreferredSize(new Dimension(200, 0));
        
        JPanel panelSuperiorIzquierdo = new JPanel();
        panelSuperiorIzquierdo.setPreferredSize(new Dimension (200,500));
        panelSuperiorIzquierdo.setLayout(new GridLayout(6, 1));
        
        
        JLabel etiquetaCedula = new JLabel("Número de cédula:");
        JTextField campoCedula = new JTextField();
        
        JLabel etiquetaCategoria = new JLabel("Categoría:");
        String[] categorias = {"Menor de 60 años", "Adulto mayor", "Persona con discapacidad"};
        JComboBox<String> comboCategoria = new JComboBox<>(categorias);
        
        JLabel etiquetaServicio = new JLabel("Servicio solicitado:");
        String[] servicios = {"Consulta medicina general", "Consulta medicina especializada", "Prueba de laboratorio", "Imágenes diagnósticas"};
        JComboBox<String> comboServicio = new JComboBox<>(servicios);
        
        panelSuperiorIzquierdo.add(etiquetaCedula);
        panelSuperiorIzquierdo.add(campoCedula);
        panelSuperiorIzquierdo.add(etiquetaCategoria);
        panelSuperiorIzquierdo.add(comboCategoria);
        panelSuperiorIzquierdo.add(etiquetaServicio);
        panelSuperiorIzquierdo.add(comboServicio);
        
        JPanel panelInferiorIzquierdo = new JPanel ();
        panelInferiorIzquierdo.setLayout(new GridLayout(1, 2));
        
        JButton Registrar = new JButton("Registrar");
        JLabel etiquetaHora = new JLabel();
        
        panelInferiorIzquierdo.add(Registrar);
        panelInferiorIzquierdo.add(etiquetaHora);
        
        
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
                etiquetaHora.setText(formatoHora.format(new Date()));
            }
        });
        
        timer.start();

        JPanel panelDerecho = new JPanel();
        panelDerecho.setLayout(new BorderLayout());

        JPanel panelSuperiorDerecho = new JPanel();
        panelSuperiorDerecho.setPreferredSize(new Dimension(0, 266));

        JPanel panelInferiorDerecho = new JPanel();

        panelDerecho.add(panelSuperiorDerecho, BorderLayout.NORTH);
        panelDerecho.add(panelInferiorDerecho, BorderLayout.CENTER);
        
        panelIzquierdo.add(panelSuperiorIzquierdo, BorderLayout.NORTH);
        panelIzquierdo.add(panelInferiorIzquierdo, BorderLayout.CENTER);

        ventana.add(panelIzquierdo, BorderLayout.WEST);
        ventana.add(panelDerecho, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}


