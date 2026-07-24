
package com.mycompany.biblioteca.view;

import com.mycompany.biblioteca.Controller.AutorController;
import com.mycompany.biblioteca.connection.SQLiteConnector;
import com.mycompany.biblioteca.model.dao.AutorDaoBanco;
import com.mycompany.biblioteca.model.dao.IAutorDao;
import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.view.tableModel.TMCadAutor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class DlgCadAutor extends javax.swing.JDialog {

    public AutorController autorController;
    public String nomeAntigo;
    public String cddAntiga;
    public boolean  editando;
    
    
    public DlgCadAutor(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        this.editando=false;
        this.nomeAntigo="";
        this.cddAntiga="";
        SQLiteConnector conexao = new SQLiteConnector("banco.sqlite");
        IAutorDao  autorDao = new AutorDaoBanco (conexao.getConnection());
        
        this.autorController= new AutorController(autorDao);
        this.habilitarCampos(false);
        this.limparCampos();
        this.atualizarTabela();
    }
    
    
       public void atualizarTabela(){
        List<Autor> lista= this.autorController.listarTodos();
        TMCadAutor tmCadAutor= new TMCadAutor(lista);
        grdCadAutor.setModel(tmCadAutor);
    }
       
       public void habilitarCampos(boolean flag){
          edtNome.setEnabled(flag);
          edtCidade.setEnabled(flag);
    }
      
     public void limparCampos(){
         edtNome.setText("");
         edtCidade.setText("");
         
     }
     
     public void objetoParaCampos(Autor autor){
         edtNome.setText(autor.getNome());
         edtCidade.setText(autor.getCddNatal());
         
         
     }
      

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        panPreencher = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtCidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdCadAutor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Autores ");

        btnNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\botao novo1.jpeg")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panBotoes.add(btnNovo);

        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\botao Cancelar.jpeg")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panBotoes.add(btnCancelar);

        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\botao Remover.jpeg")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panBotoes.add(btnExcluir);

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\botao editar.jpeg")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panBotoes.add(btnEditar);

        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\botao Salvar.jpeg")); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panBotoes.add(btnSalvar);

        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\sair (1).png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        panBotoes.add(btnVoltar);

        jLabel1.setText("Nome:");

        jLabel2.setText("Cidade:");

        javax.swing.GroupLayout panPreencherLayout = new javax.swing.GroupLayout(panPreencher);
        panPreencher.setLayout(panPreencherLayout);
        panPreencherLayout.setHorizontalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPreencherLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPreencherLayout.createSequentialGroup()
                        .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panPreencherLayout.createSequentialGroup()
                        .addComponent(edtNome)
                        .addGap(235, 235, 235))))
        );
        panPreencherLayout.setVerticalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPreencherLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        grdCadAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdCadAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdCadAutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdCadAutor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panPreencher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando=false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando=false;
    }//GEN-LAST:event_btnCancelarActionPerformed
  
    
 
    public Autor getObjetoSelecionadoNaGrid() {
        int linhaSelecionada = grdCadAutor.getSelectedRow();

        if (linhaSelecionada >= 0) {
            Autor autor = (Autor) grdCadAutor.getModel().getValueAt(linhaSelecionada, -1);
            return autor;
        }

        return null;
    }
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    Autor autorEscolhido = this.getObjetoSelecionadoNaGrid();
    
    if (autorEscolhido == null) {
        JOptionPane.showMessageDialog(this, "Selecione um autor na tabela.");
        return;
    }
    
    autorController.remover(autorEscolhido.getNome(), autorEscolhido.getCddNatal());
    JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
    this.atualizarTabela();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void grdCadAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdCadAutorMouseClicked
        Autor autor=this.getObjetoSelecionadoNaGrid();
        this.objetoParaCampos(autor);
    }//GEN-LAST:event_grdCadAutorMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   Autor autorEscolhido = this.getObjetoSelecionadoNaGrid();

    if (autorEscolhido == null) {
        JOptionPane.showMessageDialog(this, "Selecione um autor na tabela.");
        return;
    }

    String nomeEscolhido = autorEscolhido.getNome();
    String cddEscolhida = autorEscolhido.getCddNatal();
    Autor autorEditando = autorController.pesquisar(nomeEscolhido, cddEscolhida);

    if (autorEditando == null) {
        JOptionPane.showMessageDialog(this, "Não existe tal autor");
        this.editando = false;
    } else {
        this.limparCampos();
        this.habilitarCampos(true);

        this.objetoParaCampos(autorEditando);
        this.editando = true;
        this.nomeAntigo = autorEditando.getNome();
        this.cddAntiga = autorEditando.getCddNatal();
    }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(this.editando){
            autorController.atualizar(nomeAntigo, cddAntiga, edtNome.getText(),edtCidade.getText());

        }else{
            autorController.salvar(edtNome.getText(), edtCidade.getText());
        }
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando=false;
        this.atualizarTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed
     
    
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTable grdCadAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panPreencher;
    // End of variables declaration//GEN-END:variables
}
