package guis;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Jesús Pedro Lares Velencia (233383) y Marcos Alejandro Nuñez Rios
 * (248414)
 */
public class frmVentanaPrincipal extends JFrame {

    private JMenuBar mnbPrincipal;
    private JMenu mnuOperaciones, mnuConsultas;
    private JMenuItem mniOperacionesPacientes, mniOperacionesMedicos, 
            mniOperacionesInventario, mniOperacionesConsultas, 
            mniConsultaPacientes, mniConsultaMedicos, 
            mniConsultaInventario, mniConsultaConsultas;
    
    public frmVentanaPrincipal() {
        setTitle("HospitalGUI");
        setSize(270, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        iniciarComponentes();
        centrarVentana();
        setVisible(true);

    }

    public void iniciarComponentes() {
        
        mnbPrincipal = new JMenuBar();
        mnuOperaciones = new JMenu();
        mnuConsultas = new JMenu();
        mniOperacionesPacientes = new JMenuItem();
        mniOperacionesMedicos = new JMenuItem();
        mniOperacionesInventario = new JMenuItem();
        mniOperacionesConsultas = new JMenuItem();
        mniConsultaPacientes = new JMenuItem();
        mniConsultaMedicos = new JMenuItem();
        mniConsultaInventario = new JMenuItem();
        mniConsultaConsultas = new JMenuItem();
        
        setJMenuBar(mnbPrincipal);
        
        mnuOperaciones.setText("Operaciones");
        mnbPrincipal.add(mnuOperaciones);
        
        mnuConsultas.setText("Consultas");
        mnbPrincipal.add(mnuConsultas);
        
        mniOperacionesPacientes.setText("Pacientes");
        mniOperacionesPacientes.addActionListener(
                new abrirOpsPacientesListener());
        mnuOperaciones.add(mniOperacionesPacientes);
        
        mniOperacionesMedicos.setText("Medicos");
        mnuOperaciones.add(mniOperacionesMedicos);
        
        mniOperacionesInventario.setText("Inventario");
        mnuOperaciones.add(mniOperacionesInventario);
        
        mniOperacionesConsultas.setText("Consultas");
        mnuOperaciones.add(mniOperacionesConsultas);
        
        mniConsultaPacientes.setText("Pacientes");
        mnuConsultas.add(mniConsultaPacientes);
        
        mniConsultaMedicos.setText("Medicos");
        mnuConsultas.add(mniConsultaMedicos);
        
        mniConsultaInventario.setText("Inventario");
        mnuConsultas.add(mniConsultaInventario);
        
        mniConsultaConsultas.setText("Consultas");
        mnuConsultas.add(mniConsultaConsultas);
        
    }
    
    class abrirOpsPacientesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new frmOperacionesPacientes();
        }
    }

    public void centrarVentana() {
        Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();

        Dimension tamVentana = getSize();

        if (tamVentana.height > tamPantalla.height) {
            tamVentana.height = tamPantalla.height;
        }
        if (tamVentana.width > tamPantalla.width) {
            tamVentana.width = tamPantalla.width;
        }

        setLocation((tamPantalla.width - tamVentana.width) / 2,
                (tamPantalla.height - tamVentana.height) / 2);
    }

}
