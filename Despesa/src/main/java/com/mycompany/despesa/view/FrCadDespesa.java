
package com.mycompany.despesa.view;

import com.mycompany.despesa.controller.GastoController;
import com.mycompany.despesa.model.dao.GastoDAOSQLite;
import com.mycompany.despesa.model.dao.GastoDao;
import com.mycompany.despesa.model.entidade.Gasto;
import com.mycompany.despesa.model.service.GerenciadorGasto;
import com.mycompany.despesa.view.tableModel.TMGasto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus henrique
 */
public class FrCadDespesa extends javax.swing.JFrame {

    public GastoController gastoController;
    public int idAtual;
    public boolean editando;
    
    private static final DateTimeFormatter FORMATO_EXIBICAO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public FrCadDespesa() {
        initComponents();
        
          this.editando = false;
        this.idAtual = 0;

        GastoDao dao = new GastoDAOSQLite();
        GerenciadorGasto gerenciador = new GerenciadorGasto(dao);
        this.gastoController = new GastoController(gerenciador);

        this.habilitarCampos(false);
        this.limparCampos();
        this.atualizarTabela();
        this.atualizarTotal();
    }
    
    public void atualizarTabela() {
        List<Gasto> lista = this.gastoController.buscarTodos();
        TMGasto tmGasto = new TMGasto(lista);
        TmDespesa.setModel(tmGasto);
    }

    public void atualizarTotal() {
        LocalDate hoje = LocalDate.now();
        double total = gastoController.buscarTotalDoMes(hoje.getMonthValue(), hoje.getYear());
        lblTotal.setText(String.format("Total do mês: R$ %.2f", total));
    }

    public void habilitarCampos(boolean flag) {
        edtData.setEnabled(flag);
        edtValor.setEnabled(flag);
        edtDescricao.setEnabled(flag);
    }

    public void limparCampos() {
        edtData.setText("");
        edtValor.setText("");
        edtDescricao.setText("");
    }

   public void objetoParaCampos(Gasto gasto) {
    // MANUTENÇÃO: gasto.getData() vem em ISO (yyyy-MM-dd) do banco.
    // Aqui converte pra dd/MM/yyyy só pra exibir no campo de edição.
    // Ao salvar, o GerenciadorGasto converte de volta pra ISO.
    LocalDate data = LocalDate.parse(gasto.getData());
    edtData.setText(data.format(FORMATO_EXIBICAO));

    edtValor.setText(String.valueOf(gasto.getValor()));
    edtDescricao.setText(gasto.getDescricao());
}

    public Gasto getObjetoSelecionadoNaGrid() {
        int linhaSelecionada = TmDespesa.getSelectedRow();
        if (linhaSelecionada >= 0) {
            Gasto gasto = (Gasto) TmDespesa.getModel().getValueAt(linhaSelecionada, -1);
            return gasto;
        }
        return null;
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TmDespesa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panPreencher = new javax.swing.JPanel();
        edtData = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        edtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        edtDescricao = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        panBotoes = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TmDespesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TmDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TmDespesaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TmDespesa);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Minhas Despesas");

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setText("Data:");

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor.setText("Valor:");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescricao.setText("Descricao:");

        javax.swing.GroupLayout panPreencherLayout = new javax.swing.GroupLayout(panPreencher);
        panPreencher.setLayout(panPreencherLayout);
        panPreencherLayout.setHorizontalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPreencherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        panPreencherLayout.setVerticalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPreencherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblValor)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\Despesa\\src\\main\\java\\com\\mycompany\\despesa\\view\\resources\\botao novo1.jpeg")); // NOI18N
        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panBotoes.add(jButton1);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\Despesa\\src\\main\\java\\com\\mycompany\\despesa\\view\\resources\\botao Remover.jpeg")); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panBotoes.add(btnExcluir);

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\Despesa\\src\\main\\java\\com\\mycompany\\despesa\\view\\resources\\botao editar.jpeg")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panBotoes.add(btnEditar);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\Despesa\\src\\main\\java\\com\\mycompany\\despesa\\view\\resources\\botao Cancelar.jpeg")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panBotoes.add(btnCancelar);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matheus henrique\\Faculdade\\O.Objeto\\O.Objeto\\Despesa\\src\\main\\java\\com\\mycompany\\despesa\\view\\resources\\botao Salvar.jpeg")); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panBotoes.add(btnSalvar);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotal.setText("Total Mes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panPreencher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;
        this.idAtual = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         Gasto gastoEscolhido = this.getObjetoSelecionadoNaGrid();

        if (gastoEscolhido == null) {
            JOptionPane.showMessageDialog(this, "Selecione um gasto na tabela.");
            return;
        }

        gastoController.remover(gastoEscolhido.getId());
        JOptionPane.showMessageDialog(this, "Exclusão feita com sucesso!");
        this.atualizarTabela();
        this.atualizarTotal();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         Gasto gastoEscolhido = this.getObjetoSelecionadoNaGrid();

        if (gastoEscolhido == null) {
            JOptionPane.showMessageDialog(this, "Selecione um gasto na tabela.");
            return;
        }

        this.limparCampos();
        this.habilitarCampos(true);
        this.objetoParaCampos(gastoEscolhido);
        this.editando = true;
        this.idAtual = gastoEscolhido.getId();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
        this.idAtual = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
          try {
            double valor = Double.parseDouble(edtValor.getText());

            if (this.editando) {
                gastoController.editar(idAtual, edtData.getText(), valor, edtDescricao.getText());
            } else {
                gastoController.salvar(edtData.getText(), valor, edtDescricao.getText());
            }

            this.limparCampos();
            this.habilitarCampos(false);
            this.editando = false;
            this.idAtual = 0;
            this.atualizarTabela();
            this.atualizarTotal();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor inválido. Digite apenas números.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void TmDespesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmDespesaMouseClicked
            Gasto gasto = this.getObjetoSelecionadoNaGrid();
        if (gasto != null) {
            this.objetoParaCampos(gasto);
        }   
    }//GEN-LAST:event_TmDespesaMouseClicked

  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TmDespesa;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JTextField edtValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panPreencher;
    // End of variables declaration//GEN-END:variables
}
