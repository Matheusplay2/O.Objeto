
package com.mycompany.biblioteca.view;

import com.mycompany.biblioteca.Controller.LivroController;
import com.mycompany.biblioteca.connection.SQLiteConnector;
import com.mycompany.biblioteca.model.dao.ILivroDao;
import com.mycompany.biblioteca.model.dao.LivroDaoBanco;
import com.mycompany.biblioteca.model.entidades.Livro;
import com.mycompany.biblioteca.view.tableModel.TMCadLivro;
import java.sql.SQLException;
import java.util.List;


public class DlgBiblioteca extends javax.swing.JDialog {
    
    private LivroController livroController;
    public DlgBiblioteca(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        
      
        SQLiteConnector conexao=new SQLiteConnector("banco.sqlite");
        ILivroDao livroDao= new LivroDaoBanco(conexao.getConnection());
        this.livroController= new LivroController(livroDao);
          
        this.atualizarTabela();
    }
  
    
    public void atualizarTabela(){
        List<Livro> lstLivro= this.livroController.listarTodos();
        
        TMCadLivro tmCadLivro= new TMCadLivro(lstLivro);
        grdBiblioteca.setModel(tmCadLivro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdBiblioteca = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Biblioteca");

        grdBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(grdBiblioteca);

        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\sair (1).png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTable grdBiblioteca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
