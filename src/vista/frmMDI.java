/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 *
 * @author Estudiante
 */
public class frmMDI extends javax.swing.JFrame {

    /**
     * Creates new form frmMDI
     */
    public frmMDI() {
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

        jSeparator6 = new javax.swing.JSeparator();
        tBar = new javax.swing.JToolBar();
        TbBtnRegistrar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        TbBtnListado = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        TbBtnSalir = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        tbTbtnFechaSist = new javax.swing.JToggleButton();
        tbTbtnHoraSist = new javax.swing.JToggleButton();
        escritorio = new javax.swing.JDesktopPane();
        TbInferior = new javax.swing.JToolBar();
        lblFechaSis = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        lblHoraSis = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        opcRegistrar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opcSalir = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        opcListado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tBar.setRollover(true);

        TbBtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        TbBtnRegistrar.setFocusable(false);
        TbBtnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TbBtnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar.add(TbBtnRegistrar);
        tBar.add(jSeparator3);

        TbBtnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listado.png"))); // NOI18N
        TbBtnListado.setFocusable(false);
        TbBtnListado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TbBtnListado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar.add(TbBtnListado);
        tBar.add(jSeparator2);

        TbBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        TbBtnSalir.setFocusable(false);
        TbBtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TbBtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar.add(TbBtnSalir);
        tBar.add(jSeparator5);

        tbTbtnFechaSist.setText("Fecha Sistema");
        tbTbtnFechaSist.setFocusable(false);
        tbTbtnFechaSist.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbTbtnFechaSist.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar.add(tbTbtnFechaSist);

        tbTbtnHoraSist.setText("Hora Sistema");
        tbTbtnHoraSist.setFocusable(false);
        tbTbtnHoraSist.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbTbtnHoraSist.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar.add(tbTbtnHoraSist);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        TbInferior.setRollover(true);

        lblFechaSis.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        TbInferior.add(lblFechaSis);
        TbInferior.add(jSeparator4);

        lblHoraSis.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        TbInferior.add(lblHoraSis);

        menuArchivo.setText("Archivo");

        opcRegistrar.setText("Registrar");
        menuArchivo.add(opcRegistrar);
        menuArchivo.add(jSeparator1);

        opcSalir.setText("Salir");
        opcSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(opcSalir);

        menuBar.add(menuArchivo);

        menuConsulta.setText("Consultar");

        opcListado.setText("Lista Vehiculos");
        menuConsulta.add(opcListado);

        menuBar.add(menuConsulta);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tBar, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(escritorio)
            .addComponent(TbInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tBar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TbInferior, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcSalirActionPerformed

    public JToolBar getTbInferior() {
        return TbInferior;
    }

    public void setTbInferior(JToolBar TbInferior) {
        this.TbInferior = TbInferior;
    }

    public JLabel getLblFechaSis() {
        return lblFechaSis;
    }

    public void setLblFechaSis(JLabel lblFechaSis) {
        this.lblFechaSis = lblFechaSis;
    }

    public JLabel getLblHoraSis() {
        return lblHoraSis;
    }

    public void setLblHoraSis(JLabel lblHoraSis) {
        this.lblHoraSis = lblHoraSis;
    }

    public JToggleButton getTbTbtnFechaSist() {
        return tbTbtnFechaSist;
    }

    public void setTbTbtnFechaSist(JToggleButton tbTbtnFechaSist) {
        this.tbTbtnFechaSist = tbTbtnFechaSist;
    }

    public JToggleButton getTbTbtnHoraSist() {
        return tbTbtnHoraSist;
    }

    public void setTbTbtnHoraSist(JToggleButton tbTbtnHoraSist) {
        this.tbTbtnHoraSist = tbTbtnHoraSist;
    }

    public JButton getTbBtnListado() {
        return TbBtnListado;
    }

    public void setTbBtnListado(JButton TbBtnListado) {
        this.TbBtnListado = TbBtnListado;
    }

    public JButton getTbBtnRegistrar() {
        return TbBtnRegistrar;
    }

    public void setTbBtnRegistrar(JButton TbBtnRegistrar) {
        this.TbBtnRegistrar = TbBtnRegistrar;
    }

    public JButton getTbBtnSalir() {
        return TbBtnSalir;
    }

    public void setTbBtnSalir(JButton TbBtnSalir) {
        this.TbBtnSalir = TbBtnSalir;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenu getMenuArchivo() {
        return menuArchivo;
    }

    public void setMenuArchivo(JMenu menuArchivo) {
        this.menuArchivo = menuArchivo;
    }

    public JMenu getMenuConsulta() {
        return menuConsulta;
    }

    public void setMenuConsulta(JMenu menuConsulta) {
        this.menuConsulta = menuConsulta;
    }

    public JMenuItem getOpcListado() {
        return opcListado;
    }

    public void setOpcListado(JMenuItem opcListado) {
        this.opcListado = opcListado;
    }

    public JMenuItem getOpcRegistrar() {
        return opcRegistrar;
    }

    public void setOpcRegistrar(JMenuItem opcRegistrar) {
        this.opcRegistrar = opcRegistrar;
    }

    public JMenuItem getOpcSalir() {
        return opcSalir;
    }

    public void setOpcSalir(JMenuItem opcSalir) {
        this.opcSalir = opcSalir;
    }

    public JToolBar gettBar() {
        return tBar;
    }

    public void settBar(JToolBar tBar) {
        this.tBar = tBar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TbBtnListado;
    private javax.swing.JButton TbBtnRegistrar;
    private javax.swing.JButton TbBtnSalir;
    private javax.swing.JToolBar TbInferior;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblFechaSis;
    private javax.swing.JLabel lblHoraSis;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenuItem opcListado;
    private javax.swing.JMenuItem opcRegistrar;
    private javax.swing.JMenuItem opcSalir;
    private javax.swing.JToolBar tBar;
    private javax.swing.JToggleButton tbTbtnFechaSist;
    private javax.swing.JToggleButton tbTbtnHoraSist;
    // End of variables declaration//GEN-END:variables

}
