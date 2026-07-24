
package com.mycompany.biblioteca.view;

import com.mycompany.biblioteca.Controller.AutorController;
import com.mycompany.biblioteca.Controller.LivroController;
import com.mycompany.biblioteca.connection.SQLiteConnector;
import com.mycompany.biblioteca.model.dao.AutorDaoBanco;
import com.mycompany.biblioteca.model.dao.IAutorDao;
import com.mycompany.biblioteca.model.dao.ILivroDao;
import com.mycompany.biblioteca.model.dao.LivroDaoBanco;
import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.model.entidades.Livro;
import com.mycompany.biblioteca.view.tableModel.TMCadLivro;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class DlgCadLivro extends javax.swing.JDialog {
    public LivroController livroController;
    public AutorController autorController;
    public String tituloAntigo;
    public boolean editando;
 
    public DlgCadLivro(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        this.editando = false;
        this.tituloAntigo = "";

        SQLiteConnector conexao = new SQLiteConnector("banco.sqlite");
        ILivroDao livroDao = new LivroDaoBanco(conexao.getConnection());
        IAutorDao autorDao = new AutorDaoBanco(conexao.getConnection());
        this.livroController = new LivroController(livroDao);
        this.autorController = new AutorController(autorDao);
      
        
        this.habilitarCampos(false);
        this.limparCampos();
        this.carregarComboAutores();
        this.atualizarTabela();
    }
     
     public void atualizarTabela() {
        List<Livro> lista = this.livroController.listarTodos();
        TMCadLivro tmCadLivro = new TMCadLivro(lista);
        grdCadLivro.setModel(tmCadLivro);
    }
    
     
     public void habilitarCampos(boolean flag) {
        edtTitulo.setEnabled(flag);
        edtAno.setEnabled(flag);
        jComboBoxAutor.setEnabled(flag);
    }
    
    public void carregarComboAutores() {
        jComboBoxAutor.removeAllItems();
        List<Autor> autores = this.autorController.listarTodos();
        for (Autor a : autores) {
            jComboBoxAutor.addItem(a);
        }
    }
     public void limparCampos() {
        edtTitulo.setText("");
        edtAno.setText("");
        if (jComboBoxAutor.getItemCount() > 0) {
            jComboBoxAutor.setSelectedIndex(0);
        }
    }
     
    public void objetoParaCampos(Livro livro) {
        edtTitulo.setText(livro.getTitulo());
        edtAno.setText(livro.getAno() + "");
        jComboBoxAutor.setSelectedItem(livro.getAutor());
    }
    
     public Livro getObjetoSelecionadoNaGrid() {
        int linhaSelecionada = grdCadLivro.getSelectedRow();
        if (linhaSelecionada >= 0) {
            Livro livro = (Livro) grdCadLivro.getModel().getValueAt(linhaSelecionada, -1);
            return livro;
        }
        return null;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        panBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        panPreencher = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        edtAno = new javax.swing.JTextField();
        jComboBoxAutor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdCadLivro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Cadastro de Livros");

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

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\botao editar.jpeg")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panBotoes.add(btnEditar);

        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\BIBLIOTECA\\src\\main\\java\\com\\mycompany\\biblioteca\\view\\resources\\botao Remover.jpeg")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panBotoes.add(btnExcluir);

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

        lblAutor.setText("Autor:");

        lblAno.setText("Ano:");

        lblTitulo.setText("Titulo");

        javax.swing.GroupLayout panPreencherLayout = new javax.swing.GroupLayout(panPreencher);
        panPreencher.setLayout(panPreencherLayout);
        panPreencherLayout.setHorizontalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPreencherLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPreencherLayout.createSequentialGroup()
                        .addComponent(lblAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(409, 409, 409))
                    .addGroup(panPreencherLayout.createSequentialGroup()
                        .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(edtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(edtAno))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panPreencherLayout.setVerticalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPreencherLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(edtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAno)
                    .addComponent(edtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(jComboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        grdCadLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdCadLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdCadLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdCadLivro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addComponent(panPreencher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         Livro livroEscolhido = this.getObjetoSelecionadoNaGrid();

        if (livroEscolhido == null) {
            JOptionPane.showMessageDialog(this, "Selecione um livro na tabela.");
            return;
        }

        Livro livroEditando = livroController.pesquisar(livroEscolhido.getTitulo());

        if (livroEditando == null) {
            JOptionPane.showMessageDialog(this, "Não existe tal livro.");
            this.editando = false;
        } else {
            this.limparCampos();
            this.habilitarCampos(true);
            this.objetoParaCampos(livroEditando);
            this.editando = true;
            this.tituloAntigo = livroEditando.getTitulo();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         Livro livroEscolhido = this.getObjetoSelecionadoNaGrid();

        if (livroEscolhido == null) {
        JOptionPane.showMessageDialog(this, "Selecione um livro na tabela.");
            return;
        }

        livroController.remover(livroEscolhido.getTitulo());
        JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        this.atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Autor autorSelecionado = (Autor) jComboBoxAutor.getSelectedItem();

        if (this.editando) {
            livroController.atualizar(tituloAntigo, edtTitulo.getText(), autorSelecionado, edtAno.getText());
        } else {
            livroController.salvar(edtTitulo.getText(), autorSelecionado, edtAno.getText());
        }
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
        this.atualizarTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
         dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void grdCadLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdCadLivroMouseClicked
        Livro livro = this.getObjetoSelecionadoNaGrid();
        if(livro != null){
            this.objetoParaCampos(livro);
        }
    }//GEN-LAST:event_grdCadLivroMouseClicked



    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtAno;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JTable grdCadLivro;
    private javax.swing.JComboBox<Autor> jComboBoxAutor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panPreencher;
    // End of variables declaration//GEN-END:variables
}
