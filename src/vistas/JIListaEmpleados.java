package vistas;

import conexion.base_datos;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class JIListaEmpleados extends javax.swing.JInternalFrame {

    public JIListaEmpleados() {
        initComponents();
        
        Statement st;
        DefaultTableModel dtm;
        ResultSet rs = null;
        base_datos db = new base_datos();

        db.Establece_Conexion();
        String sql;

        try {
            st = db.conex.createStatement();
            sql = "Select * from regempleados";
            rs = st.executeQuery(sql);
            String Fila[] = new String[4];
            String titulos[] = {"Código","Nombre", "Apellido paterno y materno",  "Área de trabajo"};
            dtm = new DefaultTableModel(null, titulos);
            while (rs.next()) {
                Fila[0] = rs.getString("codigo");
                Fila[1] = rs.getString("nombres");
                Fila[2] = rs.getString("apellidos");
                Fila[3] = rs.getString("areat");
                dtm.addRow(Fila);
            }
            this.jTable1.setModel(dtm);
        } catch (SQLException ex) {
            System.err.println(
                    "error: no se puede mostrar el registro");
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("LISTA DE EMPLEADOS ACTUALIZADA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
