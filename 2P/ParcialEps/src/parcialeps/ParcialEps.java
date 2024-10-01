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
        ventana.setSize(600, 400);
        ventana.setLayout(new BorderLayout());

        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setPreferredSize(new Dimension(200, 0));
        panelIzquierdo.setLayout(new GridLayout(7, 1));
        
        JLabel etiquetaCedula = new JLabel("Número de cédula:");
        JTextField campoCedula = new JTextField();
        
        JLabel etiquetaCategoria = new JLabel("Categoría:");
        String[] categorias = {"Menor de 60 años", "Adulto mayor", "Persona con discapacidad"};
        JComboBox<String> comboCategoria = new JComboBox<>(categorias);
        
        JLabel etiquetaServicio = new JLabel("Servicio solicitado:");
        String[] servicios = {"Consulta medicina general", "Consulta medicina especializada", "Prueba de laboratorio", "Imágenes diagnósticas"};
        JComboBox<String> comboServicio = new JComboBox<>(servicios);
        
        JButton Registrar = new JButton("Registrar");
        JLabel etiquetaHora = new JLabel();
        
        panelIzquierdo.add(etiquetaCedula);
        panelIzquierdo.add(campoCedula);
        panelIzquierdo.add(etiquetaCategoria);
        panelIzquierdo.add(comboCategoria);
        panelIzquierdo.add(etiquetaServicio);
        panelIzquierdo.add(comboServicio);
        panelIzquierdo.add(Registrar);
        panelIzquierdo.add(etiquetaHora);
        
        /*etiquetaHora.setPreferredSize(new Dimension(100, 30));*/
        
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
        panelSuperiorDerecho.setPreferredSize(new Dimension(0, 133));

        JPanel panelInferiorDerecho = new JPanel();

        panelDerecho.add(panelSuperiorDerecho, BorderLayout.NORTH);
        panelDerecho.add(panelInferiorDerecho, BorderLayout.CENTER);

        ventana.add(panelIzquierdo, BorderLayout.WEST);
        ventana.add(panelDerecho, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}


