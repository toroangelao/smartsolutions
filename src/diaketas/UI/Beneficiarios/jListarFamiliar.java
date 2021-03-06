/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.UI.UI;
import diaketas.Modelo.ONG.Familiar;
import diaketas.Modelo.Gestores.Gestor_de_beneficiarios;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kesada
 */
public class jListarFamiliar extends javax.swing.JPanel {

    JPanel panel;
    String jPanelAnterior, jPanelSiguiente;
    ArrayList <Familiar> familiares;
    
    /**
     * Creates new form jAltaFamiliar
     * @param jPanelAnterior
     * @param jPanelSiguiente  
     */
    public jListarFamiliar(String jPanelAnterior, String jPanelSiguiente) {
        this.jPanelAnterior = jPanelAnterior;
        this.jPanelSiguiente = jPanelSiguiente;
        
        /*Inicializamos*/
        initComponents();
        
        /* inicioModificarFamiliar()*/
        /* inicioConsultarFamiliar()*/
        /*Mostramos inicioMostrarFamiliar*/

        familiares = diaketas.diaketas.ong.gestorBeneficiarios.iniciarConsultarFamiliar();

        if(familiares.isEmpty()){
            JOptionPane.showMessageDialog(this, "No se ha encontrado ningún familiar para este beneficiario.",
                    "No se han encontrado familiares", JOptionPane.INFORMATION_MESSAGE);
            botonOK.setEnabled(false);
        }else{
            /*Mostramos los familiares*/
            DefaultListModel modelo = new DefaultListModel();
            for (int i = 0; i < familiares.size();i++){
                System.out.println(familiares.get(i).Nombre_Apellidos);
                modelo.addElement((String)familiares.get(i).Nombre_Apellidos);}
            listaFamiliares.setModel(modelo);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();
        botonCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFamiliares = new javax.swing.JList();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Beneficiarios");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Familiares");

        jLabel2.setText("Seleccione un familiar");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaFamiliares);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(botonOK)
                        .addGap(18, 18, 18)
                        .addComponent(botonCancel)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOK)
                    .addComponent(botonCancel))
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
    
        if (listaFamiliares.getSelectedIndex() != -1){
            if (jPanelSiguiente.compareTo("BajaFamiliar") ==0){
                
                /*Pasamos al formulario de Baja el nombre del familiar*/
                panel = new jBajaFamiliar(jPanelAnterior, (String) listaFamiliares.getSelectedValue());
                
                diaketas.diaketas.ong.gestorBeneficiarios.seleccionarFamiliar((String)listaFamiliares.getSelectedValue());
                
                UI.jPrincipal.add(jPanelSiguiente, panel); 
                UI.cl.show(UI.jPrincipal, "BajaFamiliar");
                
            }else if (jPanelSiguiente.compareTo("ConsultarFamiliar") ==0){
 
                /*Pasamos al formulario de Modificar el nombre del familiar*/
                panel = new jConsultarFamiliar(jPanelAnterior, (String) listaFamiliares.getSelectedValue());
                
                UI.jPrincipal.add(jPanelSiguiente, panel); 
                UI.cl.show(UI.jPrincipal, "ConsultarFamiliar");  
                
            }else{
                
                /*Pasamos al formulario de Modificar el nombre del familiar*/
                panel = new jModificarFamiliar(jPanelAnterior, (String) listaFamiliares.getSelectedValue());
                
                UI.jPrincipal.add(jPanelSiguiente, panel); 
                UI.cl.show(UI.jPrincipal, "ModificarFamiliar");  
                
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un familiar.", "Familiar", JOptionPane.ERROR_MESSAGE);

        }    
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
            UI.cl.show(UI.jPrincipal, jPanelAnterior);
            // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList listaFamiliares;
    // End of variables declaration//GEN-END:variables
}
