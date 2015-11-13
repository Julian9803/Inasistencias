/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import Clases.Area;
import Clases.Estudiante;
import Clases.Fallaarea;
import Clases.Grado;
import Clases.Profesor;
import Controlador.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class asignarFalla extends javax.swing.JFrame {


    public asignarFalla() {
        initComponents();
        cmbTipoGrado.setVisible(false);
        cargarGrado();
        cargarAreas();
        cargarProfesor();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbGrado = new javax.swing.JComboBox();
        cmbTipoGrado = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbProfesor = new javax.swing.JComboBox();
        cmbArea = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox();
        btnAsignar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asignar Falla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione el Grado");

        cmbGrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGradoItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione el Profesor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione el Area");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Seleccione la Fecha");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione la Hora");

        cmbHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primera", "Segunda", "Tercera", "Cuarta", "Quinta", "Sesta" }));

        btnAsignar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAsignar.setText("Asignar Falla");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione la Semana");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74)
                        .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbTipoGrado, 0, 155, Short.MAX_VALUE)
                            .addComponent(cmbProfesor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbArea, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtHora)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbTipoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        int opcion =JOptionPane.showConfirmDialog(rootPane, "Esta Seguro de registrar esta falla", "Question?", JOptionPane.OK_CANCEL_OPTION);
        if(opcion == JOptionPane.OK_OPTION){
            long esD = documento(cmbTipoGrado.getSelectedItem().toString());
            long prD = documento(cmbProfesor.getSelectedItem().toString());
            Estudiante es = (Estudiante) HibernateUtil.QueryUnicode("FROM Estudiante WHERE NumeroDocumento = "+esD);
            Profesor prof = (Profesor) HibernateUtil.QueryUnicode("FROM Profesor WHERE NumeroDocumento = "+prD);
            Area area = (Area)HibernateUtil.QueryUnicode("FROM Area WHERE NombreArea = '"+cmbArea.getSelectedItem().toString()+"'");

            Date fecha = dcFecha.getDate();
            String Hora = cmbHora.getSelectedItem().toString();
            short semana = Short.parseShort(txtHora.getText());

            Fallaarea fal = new Fallaarea(es, prof, area, fecha, Hora, semana);
            HibernateUtil.Save(fal);
            JOptionPane.showMessageDialog(rootPane, "Se registro satisfactoriamte la falla", "EnhoraBuena", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAsignarActionPerformed
    
    
    private void cmbGradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGradoItemStateChanged
        if(cmbGrado.equals("--Selecione un Grado--")){
            cmbTipoGrado.setVisible(false);
        }else{
            
            String grado = (String)cmbGrado.getSelectedItem();

            cmbTipoGrado.removeAllItems();
            cargarEstudiante(grado);
        }
    }//GEN-LAST:event_cmbGradoItemStateChanged

    
    public void cargarGrado(){
        ArrayList<Grado> lista = new ArrayList<Grado>();
        lista = (ArrayList<Grado>) HibernateUtil.Query("FROM Grado WHERE Estado = 'Activo' AND Tipo = 'Secundaria'");                
        cmbGrado.addItem("--Selecione un Grado--");
        for(Grado item: lista){
            cmbGrado.addItem(item.getGrado());
        }
    }
    
    public void cargarEstudiante(String Grado){
        cmbTipoGrado.setVisible(true);
        ArrayList<Estudiante> lista = new ArrayList<>();
        lista = (ArrayList<Estudiante>) HibernateUtil.Query("FROM Estudiante WHERE Estado = 'Activo' AND Tipo = 'Secundaria'");
        for(Estudiante item: lista){
            if(item.getGrado().getGrado().equals(Grado)){
                cmbTipoGrado.addItem(item.getNumeroDocumento()+"-"+item.getNombres());
            }
        }
    }
    
    public void cargarAreas(){
       ArrayList<Area> lista = new ArrayList<Area>();
       lista = (ArrayList<Area>) HibernateUtil.Query("FROM Area WHERE Estado = 'Activo'");
       for(Area item: lista){
           cmbArea.addItem(item.getNombreArea());
       }
       
    }
    
    public void cargarProfesor(){
        ArrayList<Profesor> lista = new ArrayList<Profesor>();
        lista = (ArrayList<Profesor>) HibernateUtil.Query("FROM Profesor WHERE Estado = 'Activo' AND Tipo = 'Secundaria'");
        for(Profesor item: lista){
            cmbProfesor.addItem(item.getNumeroDocumento()+"-"+item.getNombres());
        }
    }
    
    private long documento(String cadena){
        long documento = 0;
        char[] aux = cadena.toCharArray();
        String auxD = "";
        for(int i = 0; i<aux.length; i++){
            if(aux[i] == '-'){
                documento = Long.parseLong(auxD);
                return documento;
            }else{
                auxD += aux[i];

            }
        }
        return documento;
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asignarFalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JComboBox cmbArea;
    private javax.swing.JComboBox cmbGrado;
    private javax.swing.JComboBox cmbHora;
    private javax.swing.JComboBox cmbProfesor;
    private javax.swing.JComboBox cmbTipoGrado;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
