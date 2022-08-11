/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mgalo.proyectoProductos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marlon Galo
 */
public class Productos extends javax.swing.JFrame {
    /*
    Instanciar la clase ExistenciaProducto
    */
    ExistenciaProducto existenciaProducto = new ExistenciaProducto();
    private double resultado=0;
    private double numero1;
    private double numero2;
    /**
     * Creates new form Notas
     */
    public Productos() {
        initComponents();
        DefaultTableModel model= (DefaultTableModel) TablaGeneral.getModel();
        
        /*
        Agregar las COlumnas
        */
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        model.addColumn("Total");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        LabelNotasEstudiantes = new javax.swing.JLabel();
        LabelCodigoProducto = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        TextPrecio = new javax.swing.JTextField();
        LabelCantidad = new javax.swing.JLabel();
        TextCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaGeneral = new javax.swing.JTable();
        BotonAgregar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        TextCodigoProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(530, 630));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(530, 630));

        LabelNotasEstudiantes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelNotasEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNotasEstudiantes.setText("Manejo de Productos");

        LabelCodigoProducto.setText("Codigo de producto");

        LabelNombre.setText("Nombre");

        LabelPrecio.setText("Precio");

        LabelCantidad.setText("Cantidad");

        TablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaGeneral.setPreferredSize(new java.awt.Dimension(100, 120));
        TablaGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaGeneralMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaGeneral);

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(LabelNotasEstudiantes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LabelCodigoProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LabelNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LabelPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LabelCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BotonAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BotonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TextCodigoProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCodigoProducto)
                            .addComponent(LabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCantidad))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextNombre)
                            .addComponent(TextPrecio)
                            .addComponent(TextCantidad)
                            .addComponent(TextCodigoProducto))))
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(LabelNotasEstudiantes)
                .addGap(241, 241, 241))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelNotasEstudiantes)
                .addGap(39, 39, 39)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCodigoProducto)
                    .addComponent(TextCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPrecio)
                    .addComponent(TextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCantidad)
                    .addComponent(TextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:
        numero1=Double.parseDouble(TextPrecio.getText());
        numero2=Double.parseDouble(TextCantidad.getText());
        resultado=numero1*numero2;
        DefaultTableModel model = (DefaultTableModel) TablaGeneral.getModel();
        existenciaProducto.setCodigoProducto(TextCodigoProducto.getText());
        existenciaProducto.setPrecio(Double.parseDouble(TextPrecio.getText()));
        existenciaProducto.setCantidad(Double.parseDouble(TextCantidad.getText()));
        existenciaProducto.setNombre(TextNombre.getText());
        existenciaProducto.setTotal(resultado);
        
        
        
                
            
       /*
        Crear un objeto para establecer a la tabla los datos que hemos capturado
        */ 
       Object[] row ={existenciaProducto.getCodigoProducto(),existenciaProducto.getNombre(),existenciaProducto.getPrecio(), existenciaProducto.getCantidad(), existenciaProducto.getTotal()};
       
       /*
       Establecer la fila al modelo de la tabla
       */
       model.addRow(row);
    }//GEN-LAST:event_BotonAgregarActionPerformed

    /**/
    private void TablaGeneralMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaGeneralMousePressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TablaGeneral.getModel();
        try{
            int filaSeleccionada = TablaGeneral.getSelectedRow();
            /*
            Obtenemos los elementos de la fila seleccionada
            */
            ExistenciaProducto existenciaProducto = new ExistenciaProducto((String)TablaGeneral.getValueAt(filaSeleccionada, 0),
                                                                            (String)TablaGeneral.getValueAt(filaSeleccionada, 1),
                                                                            (double)TablaGeneral.getValueAt(filaSeleccionada, 2),
                                                                            (double)TablaGeneral.getValueAt(filaSeleccionada, 3));                                                                            
            JOptionPane.showMessageDialog(null, existenciaProducto.getCodigoProducto() + " " + existenciaProducto.getNombre() + " " + 
                                                 existenciaProducto.getPrecio() + " " + existenciaProducto.getCantidad());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        
        }
    }//GEN-LAST:event_TablaGeneralMousePressed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TablaGeneral.getModel();
        
        if (TablaGeneral.getSelectedRowCount()==1){
            model.removeRow(TablaGeneral.getSelectedRow());
        }
        else{
            if(TablaGeneral.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "La tabla no contiene datos, esta vacia");
            }
            else{
                JOptionPane.showMessageDialog(this, "Favor selecciones una fila a ser borrada");
            }
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

        
        
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCodigoProducto;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelNotasEstudiantes;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JTable TablaGeneral;
    private javax.swing.JTextField TextCantidad;
    private javax.swing.JTextField TextCodigoProducto;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextPrecio;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
