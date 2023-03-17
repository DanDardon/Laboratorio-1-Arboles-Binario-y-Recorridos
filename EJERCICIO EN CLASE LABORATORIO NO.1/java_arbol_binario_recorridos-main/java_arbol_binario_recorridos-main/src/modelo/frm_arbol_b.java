
package modelo;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class frm_arbol_b extends javax.swing.JFrame {
String strRecorrido = "";
    public frm_arbol_b() {
        initComponents();
         txtConsola.setText("Programa iniciado correctamente..." + System.lineSeparator());
        
        btnLimpiarArbol.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        j_arbol = new javax.swing.JTree();
        btn_agregar = new javax.swing.JButton();
        txt_agregar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        btnLimpiarArbol = new javax.swing.JButton();
        btnPreorden = new javax.swing.JButton();
        btnOrden = new javax.swing.JButton();
        btnPostorden = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(j_arbol);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txtConsola.setColumns(20);
        txtConsola.setRows(5);
        jScrollPane2.setViewportView(txtConsola);

        btnLimpiarArbol.setText("Limpiar");
        btnLimpiarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarArbolActionPerformed(evt);
            }
        });

        btnPreorden.setText("Preorden");
        btnPreorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreordenActionPerformed(evt);
            }
        });

        btnOrden.setText("Inorden");
        btnOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenActionPerformed(evt);
            }
        });

        btnPostorden.setText("Postorden");
        btnPostorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostordenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnLimpiarArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPostorden, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_agregar))
                                .addComponent(btnPreorden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarArbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPreorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPostorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

         try{
            
            if (txt_agregar.getText().length() <= 0) 
                    throw new Exception("¡Ingrese un valor por favor!");
                
            int valorNuevo = 0;
            try{ valorNuevo = Integer.parseInt(txt_agregar.getText());}
            catch(Exception ex){throw new Exception("¡Ingrese un entero!");}

            DefaultMutableTreeNode nodoRaiz = (DefaultMutableTreeNode) j_arbol.getModel().getRoot();
            if(nodoRaiz != null)
            {
                DefaultMutableTreeNode nodoAuxiliar = nodoRaiz;
                DefaultMutableTreeNode nodoPadre;
                
                while(true){
                    nodoPadre = nodoAuxiliar;
                    String s = nodoAuxiliar.getUserObject().toString().split("-")[1].trim();
                    int valorNodoActual = Integer.parseInt(s);
                    if(valorNuevo < valorNodoActual){
                        nodoAuxiliar = (DefaultMutableTreeNode) nodoAuxiliar.getFirstChild();
                        
                        if(nodoAuxiliar.getUserObject().toString().equals("I - NULL"))
                        {
                            nodoAuxiliar.setUserObject("I - " + valorNuevo);
                            nodoAuxiliar.add(new DefaultMutableTreeNode("I - NULL"));
                            nodoAuxiliar.add(new DefaultMutableTreeNode("D - NULL"));
                            
                            j_arbol.expandPath(new TreePath(nodoAuxiliar.getPath()));
                         txtConsola.setText(txtConsola.getText() + "Nuevo nodo agregado: " + txt_agregar.getText() + System.lineSeparator());
                            return;
                        }
                    }
                    else
                    {
                        nodoAuxiliar = (DefaultMutableTreeNode) nodoAuxiliar.getLastChild();
                        
                        if(nodoAuxiliar.getUserObject().toString().equals("D - NULL"))
                        {
                            nodoAuxiliar.setUserObject("D - " + valorNuevo);
                            nodoAuxiliar.add(new DefaultMutableTreeNode("I - NULL"));
                            nodoAuxiliar.add(new DefaultMutableTreeNode("D - NULL"));
                            
                            j_arbol.expandPath(new TreePath(nodoAuxiliar.getPath()));
                           txtConsola.setText(txtConsola.getText() + "Nuevo nodo agregado: " + txt_agregar.getText() + System.lineSeparator());
                            return;
                        }
                    }
                }
            }
            else {               
                              
                nodoRaiz = new DefaultMutableTreeNode("R - " + txt_agregar.getText());
                DefaultMutableTreeNode nodoIzquierdo = new DefaultMutableTreeNode("I - NULL");
                DefaultMutableTreeNode nodoDerecho = new DefaultMutableTreeNode("D - NULL");
                
                nodoRaiz.add(nodoIzquierdo);
                nodoRaiz.add(nodoDerecho);
                
                DefaultTreeModel modeloArbol = (DefaultTreeModel) j_arbol.getModel();
                modeloArbol.setRoot(nodoRaiz);
                
               txtConsola.setText(txtConsola.getText() + "Nodo RAÍZ agregado: " + txt_agregar.getText() + System.lineSeparator());
            }

        }catch(Exception ex)
        {
            txtConsola.setText(txtConsola.getText() + "Error en btnAgregarActionPerformed(): " + ex.getMessage() + System.lineSeparator());
        }          
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btnLimpiarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarArbolActionPerformed
        try
        {
            DefaultTreeModel modeloArbol = (DefaultTreeModel) j_arbol.getModel();
            modeloArbol.setRoot(null);

            txtConsola.setText(txtConsola.getText() + "¡Vaciado del árbol! " + System.lineSeparator());
            txtConsola.setText("");
        }catch(Exception ex)
        {
            txtConsola.setText(txtConsola.getText() + "Error en btnLimpiarArbolActionPerformed(): " + ex.getMessage() + System.lineSeparator());
        }
    }//GEN-LAST:event_btnLimpiarArbolActionPerformed

    private void btnPreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreordenActionPerformed
        try{
            if(j_arbol.getModel().getRoot() == null)
            throw new Exception("¡Ningún nodo en el árbol para recorrer!");

            DefaultMutableTreeNode nodoRaiz = (DefaultMutableTreeNode) j_arbol.getModel().getRoot();
            txtConsola.setText(txtConsola.getText() + "Recorrido PREORDEN: ");

            strRecorrido = "";
            RecorridoPreorden(nodoRaiz);
            txtConsola.setText(txtConsola.getText() + strRecorrido.substring(0, strRecorrido.length() - 3) + "." + System.lineSeparator());
        }catch(Exception ex)
        {
            txtConsola.setText(txtConsola.getText() + "Error en btnPreordenActionPerformed(): " + ex.getMessage() + System.lineSeparator());
        }
    }//GEN-LAST:event_btnPreordenActionPerformed

    private void btnOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenActionPerformed
       try{
        if(j_arbol.getModel().getRoot() == null)
            throw new Exception("¡Ningún nodo en el árbol para recorrer!");

        DefaultMutableTreeNode nodoRaiz = (DefaultMutableTreeNode) j_arbol.getModel().getRoot();
        txtConsola.setText(txtConsola.getText() + "Recorrido EN ORDEN: ");

        strRecorrido = "";
        RecorridoEnOrden(nodoRaiz);
        txtConsola.setText(txtConsola.getText() + strRecorrido.substring(0, strRecorrido.length() - 3) + "." + System.lineSeparator());
    }catch(Exception ex)
    {
        txtConsola.setText(txtConsola.getText() + "Error en btnOrdenActionPerformed(): " + ex.getMessage() + System.lineSeparator());
    }
    }//GEN-LAST:event_btnOrdenActionPerformed

    private void btnPostordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostordenActionPerformed
        try{
        if(j_arbol.getModel().getRoot() == null)
            throw new Exception("¡Ningún nodo en el árbol para recorrer!");

        DefaultMutableTreeNode nodoRaiz = (DefaultMutableTreeNode) j_arbol.getModel().getRoot();
        txtConsola.setText(txtConsola.getText() + "Recorrido POSTORDEN: ");

        strRecorrido = "";
        RecorridoPostorden(nodoRaiz);
        txtConsola.setText(txtConsola.getText() + strRecorrido.substring(0, strRecorrido.length() - 3) + "." + System.lineSeparator());
    }catch(Exception ex)
    {
        txtConsola.setText(txtConsola.getText() + "Error en btnPostordenActionPerformed(): " + ex.getMessage() + System.lineSeparator());
    }
    }//GEN-LAST:event_btnPostordenActionPerformed
public void RecorridoPreorden(DefaultMutableTreeNode nodoRaiz)
    {
        if(!nodoRaiz.getUserObject().toString().equals("I - NULL") && !nodoRaiz.getUserObject().toString().equals("D - NULL"))
        {
            strRecorrido += nodoRaiz.getUserObject().toString().split("-")[1].trim() + " - ";
            RecorridoPreorden((DefaultMutableTreeNode) nodoRaiz.getFirstChild());
            RecorridoPreorden((DefaultMutableTreeNode) nodoRaiz.getLastChild());
        }
    }

public void RecorridoEnOrden(DefaultMutableTreeNode nodoRaiz)
{
    if(!nodoRaiz.getUserObject().toString().equals("I - NULL") && !nodoRaiz.getUserObject().toString().equals("D - NULL"))
    {
        RecorridoEnOrden((DefaultMutableTreeNode) nodoRaiz.getFirstChild());
        strRecorrido += nodoRaiz.getUserObject().toString().split("-")[1].trim() + " - ";
        RecorridoEnOrden((DefaultMutableTreeNode) nodoRaiz.getLastChild());
    }
}

public void RecorridoPostorden(DefaultMutableTreeNode nodoRaiz)
{
    if(!nodoRaiz.getUserObject().toString().equals("I - NULL") && !nodoRaiz.getUserObject().toString().equals("D - NULL"))
    {
        RecorridoPostorden((DefaultMutableTreeNode) nodoRaiz.getFirstChild());
        RecorridoPostorden((DefaultMutableTreeNode) nodoRaiz.getLastChild());
        strRecorrido += nodoRaiz.getUserObject().toString().split("-")[1].trim() + " - ";
    }
}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_arbol_b().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarArbol;
    private javax.swing.JButton btnOrden;
    private javax.swing.JButton btnPostorden;
    private javax.swing.JButton btnPreorden;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree j_arbol;
    private javax.swing.JTextArea txtConsola;
    private javax.swing.JTextField txt_agregar;
    // End of variables declaration//GEN-END:variables
}
