package com.mycompany.login.igu;

import com.mycompany.login.logica.ControladoraLogica;
import com.mycompany.login.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminInterface extends javax.swing.JFrame {

    ControladoraLogica controladoraLog = null;
    Usuario usr = null;
    
    public AdminInterface(ControladoraLogica controladoraLog, Usuario usr) {
        initComponents();
        this.controladoraLog = controladoraLog;
        this.usr = usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        tituloPanel = new javax.swing.JLabel();
        txtUserLogged = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        btnEditar.setText("Editar Usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear Nuevo Usuario");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar Usuario");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRecargar.setText("Recargar Tabla");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tituloPanel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        tituloPanel.setText("Sistema Administrador de Usuarios");

        txtUserLogged.setEditable(false);
        txtUserLogged.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUserLogged.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserLogged.setBorder(null);
        txtUserLogged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserLoggedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(tituloPanel)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addComponent(panelTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserLogged))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //Previo a eliminar, me aseguro que la tabla no esté vacía
        if(tablaUsuarios.getRowCount() > 0){
            //Valido que se haya seleccionado un registro
            if(tablaUsuarios.getSelectedRow() != -1){
                //Obtengo la Id del auto a eliminar
                int idUser = (int) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0);
                controladoraLog.borrarUsuario(idUser);
                mostrarMensaje("Se ha eliminado con exito el usuario", "Info", "Borrado exitoso");
                cargarTabla();
                
            }
            else{
                mostrarMensaje("No se ha seleccionado ningun usuario", "Error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("La tabla está vacía, no se puede eliminar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        RegistroAdmin pantallaRegistroAdmin = new RegistroAdmin(controladoraLog, usr);
        pantallaRegistroAdmin.setVisible(true);
        pantallaRegistroAdmin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        Principal pantallaPrincipal = new Principal();
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtUserLoggedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserLoggedActionPerformed

    }//GEN-LAST:event_txtUserLoggedActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtUserLogged.setText(usr.getNombreUsuario());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Previo a editar, me aseguro que la tabla no esté vacía
        if(tablaUsuarios.getRowCount() > 0){
            //Valido que se haya seleccionado un registro
            if(tablaUsuarios.getSelectedRow() != -1){
                //Obtengo la Id del auto a editar
                int idUsuario = (int) tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0);
                Usuario usu = controladoraLog.traerUsuario(idUsuario);
                EditarUsuario pantallaEditar = new EditarUsuario(controladoraLog, usu);
                pantallaEditar.setVisible(true);
                pantallaEditar.setLocationRelativeTo(null);
                this.dispose();
            }
            else{
                mostrarMensaje("No se ha seleccionado ningun usuario", "Error", "Error al modificar");
            }
        }
        else{
            mostrarMensaje("La tabla está vacía, no se puede modificar", "Error", "Error al modificar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void cargarTabla() {
        //Defino el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            //Que fila y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //Establecemos los nombres de las columnas
        String titulos[] = {"Id", "Usuario", "Rol"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Traemos la lista de usuarios:
        List<Usuario> listaUsuarios = controladoraLog.traerUsuarios();
        //Consultamos si la lista esta vacía
        if(listaUsuarios != null){
            //Recorro lista y por cada usuario lo cargo a la tabla
            for(Usuario usr : listaUsuarios){
                Object[] objeto = {usr.getId(), usr.getNombreUsuario(), 
                        usr.getRolDeUsuario().getNombreRol()};
                modeloTabla.addRow(objeto);
            }
        }
        
                
        tablaUsuarios.setModel(modeloTabla);
    }
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JTextField txtUserLogged;
    // End of variables declaration//GEN-END:variables
}
