/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Sebastian Leal S
 */
public class frmRegMDI extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRegistroMDI
     */
    public frmRegMDI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        panelPropietario = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        calendarProp = new com.toedter.calendar.JCalendar();
        panelVehiculo = new javax.swing.JPanel();
        lblTipoVehiculo = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCilindraje = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        cmbTipoVehiculo = new javax.swing.JComboBox<>();
        txtPlaca = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtCilindraje = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMarca = new javax.swing.JList<>();
        spnModelo = new javax.swing.JSpinner();

        setClosable(true);

        lblNombre.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblNombre.setText("Nombre");

        lblIdentificacion.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblIdentificacion.setText("Identificacion");

        lblTelefono.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblTelefono.setText("Telefono");

        lblCorreo.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblCorreo.setText("Correo");

        lblFechaNac.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblFechaNac.setText("Fecha nacimiento");

        txtNombre.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtIdentificacion.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N

        btnSiguiente.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        btnSiguiente.setText("Siguiente");

        javax.swing.GroupLayout panelPropietarioLayout = new javax.swing.GroupLayout(panelPropietario);
        panelPropietario.setLayout(panelPropietarioLayout);
        panelPropietarioLayout.setHorizontalGroup(
            panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPropietarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPropietarioLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(114, 114, 114)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPropietarioLayout.createSequentialGroup()
                        .addComponent(lblIdentificacion)
                        .addGap(42, 42, 42)
                        .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPropietarioLayout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addGap(96, 96, 96)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPropietarioLayout.createSequentialGroup()
                        .addComponent(lblCorreo)
                        .addGap(114, 114, 114)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPropietarioLayout.createSequentialGroup()
                        .addComponent(lblFechaNac)
                        .addGap(24, 24, 24)
                        .addComponent(calendarProp, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnSiguiente))))
        );
        panelPropietarioLayout.setVerticalGroup(
            panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPropietarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdentificacion)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPropietarioLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblFechaNac))
                    .addComponent(calendarProp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPropietarioLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnSiguiente))))
        );

        tabbedPane.addTab("Propietario", panelPropietario);

        lblTipoVehiculo.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblTipoVehiculo.setText("Tipo Vehiculo");

        lblPlaca.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblPlaca.setText("Placa");

        lblMarca.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblMarca.setText("Marca");

        lblModelo.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblModelo.setText("Modelo");

        lblCilindraje.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblCilindraje.setText("Cilindraje");

        lblValor.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        lblValor.setText("Valor");

        cmbTipoVehiculo.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        cmbTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));

        txtPlaca.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N

        txtValor.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N

        txtCilindraje.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N

        btnAnterior.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        btnAnterior.setText("Anterior");

        btnRegistrar.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");

        listMarca.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        listMarca.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nissan", "Mazda", "Chevrolet", "Volkswagen", "Fiat", "Seat", "Toyota", "Ford", "Honda", "Jeep", "Mitsubishi" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMarca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listMarca.setPreferredSize(new java.awt.Dimension(4, 21));
        jScrollPane1.setViewportView(listMarca);

        javax.swing.GroupLayout panelVehiculoLayout = new javax.swing.GroupLayout(panelVehiculo);
        panelVehiculo.setLayout(panelVehiculoLayout);
        panelVehiculoLayout.setHorizontalGroup(
            panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVehiculoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVehiculoLayout.createSequentialGroup()
                        .addComponent(lblTipoVehiculo)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVehiculoLayout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addGap(383, 383, 383)
                        .addComponent(btnRegistrar))
                    .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelVehiculoLayout.createSequentialGroup()
                            .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(lblModelo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnModelo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVehiculoLayout.createSequentialGroup()
                            .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVehiculoLayout.createSequentialGroup()
                                    .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelVehiculoLayout.createSequentialGroup()
                                    .addComponent(lblCilindraje)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(56, 56, 56)
                            .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        panelVehiculoLayout.setVerticalGroup(
            panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVehiculoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVehiculoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTipoVehiculo))
                    .addComponent(cmbTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModelo)
                        .addComponent(spnModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVehiculoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addGroup(panelVehiculoLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValor)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelVehiculoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCilindraje)
                    .addComponent(txtCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(panelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnterior)
                    .addComponent(btnRegistrar)))
        );

        tabbedPane.addTab("Vehiculo", panelVehiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public void setTabbedPane(JTabbedPane tabbedPane) {
        this.tabbedPane = tabbedPane;
    }

    public JButton getBtnAnterior() {
        return btnAnterior;
    }

    public void setBtnAnterior(JButton btnAnterior) {
        this.btnAnterior = btnAnterior;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JButton getBtnSiguiente() {
        return btnSiguiente;
    }

    public void setBtnSiguiente(JButton btnSiguiente) {
        this.btnSiguiente = btnSiguiente;
    }

    public JCalendar getCalendarProp() {
        return calendarProp;
    }

    public void setCalendarProp(JCalendar calendarProp) {
        this.calendarProp = calendarProp;
    }

    public JComboBox<String> getCmbTipoVehiculo() {
        return cmbTipoVehiculo;
    }

    public void setCmbTipoVehiculo(JComboBox<String> cmbTipoVehiculo) {
        this.cmbTipoVehiculo = cmbTipoVehiculo;
    }

    public JPanel getPanelPropietario() {
        return panelPropietario;
    }

    public void setPanelPropietario(JPanel panelPropietario) {
        this.panelPropietario = panelPropietario;
    }

    public JPanel getPanelVehiculo() {
        return panelVehiculo;
    }

    public void setPanelVehiculo(JPanel panelVehiculo) {
        this.panelVehiculo = panelVehiculo;
    }

    public JTextField getTxtCilindraje() {
        return txtCilindraje;
    }

    public void setTxtCilindraje(JTextField txtCilindraje) {
        this.txtCilindraje = txtCilindraje;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(JTextField txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public JList<String> getListMarca() {
        return listMarca;
    }

    public void setListMarca(JList<String> listMarca) {
        this.listMarca = listMarca;
    }

    public JSpinner getSpnModelo() {
        return spnModelo;
    }

    public void setSpnModelo(JSpinner spnModelo) {
        this.spnModelo = spnModelo;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public void setTxtPlaca(JTextField txtPlaca) {
        this.txtPlaca = txtPlaca;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSiguiente;
    private com.toedter.calendar.JCalendar calendarProp;
    private javax.swing.JComboBox<String> cmbTipoVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCilindraje;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoVehiculo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JList<String> listMarca;
    private javax.swing.JPanel panelPropietario;
    private javax.swing.JPanel panelVehiculo;
    private javax.swing.JSpinner spnModelo;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtCilindraje;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
