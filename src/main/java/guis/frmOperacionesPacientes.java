package guis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Jesús Pedro Lares Velencia (233383) y Marcos Alejandro Nuñez Rios
 * (248414)
 */
public class frmOperacionesPacientes extends JFrame {

    private JLabel lblOperacion, lblID, lblNombre, lblEdad, lblDireccion;
    private JTextField txtID, txtNombre, txtEdad, txtDireccion;
    private JButton btnAceptar, btnCancelar;
    private JComboBox cmbOperaciones;

    public frmOperacionesPacientes() {
        setTitle("Operaciones de pacientes");
        setSize(440, 240);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        iniciarComponentes();

        setVisible(true);

    }

    public void iniciarComponentes() {

        lblOperacion = new JLabel();
        lblID = new JLabel();
        lblNombre = new JLabel();
        lblEdad = new JLabel();
        lblDireccion = new JLabel();
        txtID = new JTextField();
        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtDireccion = new JTextField();
        btnAceptar = new JButton();
        btnCancelar = new JButton();
        String[] operaciones = {"Agregar", "Actualizar", "Eliminar"};
        cmbOperaciones = new JComboBox(operaciones);

        AbsoluteLayout al = new AbsoluteLayout();
        setLayout(al);

        lblOperacion.setText("Operacion");
        add(lblOperacion, new AbsoluteConstraints(255, 20, -1, -1));
        cmbOperaciones.addActionListener(new cambiarOperacionListener());
        add(cmbOperaciones, new AbsoluteConstraints(320, 15, -1, -1));

        lblID.setText("ID");
        add(lblID, new AbsoluteConstraints(20, 60, -1, -1));
        add(txtID, new AbsoluteConstraints(40, 60, 65, -1));

        lblNombre.setText("Nombre");
        add(lblNombre, new AbsoluteConstraints(120, 60, -1, -1));
        add(txtNombre, new AbsoluteConstraints(170, 60, 235, -1));

        lblEdad.setText("Edad");
        add(lblEdad, new AbsoluteConstraints(20, 95, -1, -1));
        add(txtEdad, new AbsoluteConstraints(55, 95, 50, -1));

        lblDireccion.setText("Direccion");
        add(lblDireccion, new AbsoluteConstraints(120, 95, -1, -1));
        add(txtDireccion, new AbsoluteConstraints(180, 95, 225, -1));

        btnAceptar.setText("Agregar");
        add(btnAceptar, new AbsoluteConstraints(235, 160, -1, -1));

        btnCancelar.setText("Cancelar");
        add(btnCancelar, new AbsoluteConstraints(320, 160, -1, -1));
    }

    class cambiarOperacionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String operacionSeleccionada = (String) cmbOperaciones.getSelectedItem();
            if (operacionSeleccionada != null) {
                btnAceptar.setText(operacionSeleccionada);

                boolean habilitarCampos = !operacionSeleccionada.equals("Eliminar");

                txtNombre.setEnabled(habilitarCampos);
                txtEdad.setEnabled(habilitarCampos);
                txtDireccion.setEnabled(habilitarCampos);
            }
            switch (operacionSeleccionada) {
                case "Agregar":
                    
            }
        }
    }

}
