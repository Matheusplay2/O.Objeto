package com.mycompany.roteiro_04_01.gui;

import com.mycompany.roteiro_04_01.classes.Paciente;
import com.mycompany.roteiro_04_01.gerenciadores.GerenciadorPaciente;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;


public class DlgPaciente extends javax.swing.JDialog {

     
    private GerenciadorPaciente gerente;
    private boolean editando;
    private String cpfEscolhido;
    
    public DlgPaciente(java.awt.Frame parent, boolean modal) throws FileNotFoundException {
        super(parent, modal);
        initComponents();
        this.gerente= new GerenciadorPaciente();
        this.editando=false;
        this.cpfEscolhido="";
        this.habilitarCampos(false);
        this.atualizarListagem();
        
    }

    
       private void atualizarListagem(){
       String listagem=this.gerente.listar();
       edtListagem.setText(listagem);
      
  }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadPacientes = new javax.swing.JLabel();
        panOpcoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        panPreencher = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        edtNascimento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtHistorico = new javax.swing.JTextArea();
        lblHistorico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCadPacientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadPacientes.setText("Cadastro de Pacientes");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panOpcoes.add(btnNovo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panOpcoes.add(btnEditar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panOpcoes.add(btnCancelar);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panOpcoes.add(btnExcluir);

        btnSalvar.setText("Salvar ");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panOpcoes.add(btnSalvar);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        panOpcoes.add(btnVoltar);

        lblNome.setText("Nome:");

        lblCpf.setText("Cpf:");

        lblNascimento.setText("Data Nascimento:");

        javax.swing.GroupLayout panPreencherLayout = new javax.swing.GroupLayout(panPreencher);
        panPreencher.setLayout(panPreencherLayout);
        panPreencherLayout.setHorizontalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPreencherLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panPreencherLayout.createSequentialGroup()
                        .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panPreencherLayout.createSequentialGroup()
                        .addComponent(lblNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        panPreencherLayout.setVerticalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPreencherLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNascimento))
                .addGap(18, 18, 18)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane1.setViewportView(edtListagem);

        edtHistorico.setColumns(20);
        edtHistorico.setRows(5);
        jScrollPane2.setViewportView(edtHistorico);

        lblHistorico.setText("Historico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCadPacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(panPreencher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
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
        this.habilitarCampos(false);
        this.limparCampos();
        this.editando=false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.cpfEscolhido= JOptionPane.showInputDialog("Digite cpf do(a) paciente que deseja editar");
        Paciente pacienteEscolhido=this.gerente.pesquisar(cpfEscolhido);
        
        if(pacienteEscolhido != null){
            this.gerente.atualizar(cpfEscolhido, pacienteEscolhido);
            
            JOptionPane.showConfirmDialog(this, " Dados do paciente atualizados");
            this.habilitarCampos(true);
            this.limparCampos();
            this.editando=false;
            this.objetoParaCampos(pacienteEscolhido);
            
        }else{
            JOptionPane.showConfirmDialog(this, "Paciente nao encontrada");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.cpfEscolhido=JOptionPane.showInputDialog("Digite cpf do()a paciente que deseja excluir");
        Paciente pacienteEscolhido=this.gerente.pesquisar(cpfEscolhido);
        
        if(pacienteEscolhido != null){
            
            this.gerente.remover(cpfEscolhido);
            JOptionPane.showMessageDialog(this, "Paciente removido");
            
            try {
            this.gerente.salvarNoArquivo();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
        }
            this.habilitarCampos(false);
            this.limparCampos();
            this.editando=false;
            
            String listagem=this.gerente.listar();
            edtListagem.setText(listagem);
        }else{
            JOptionPane.showMessageDialog(this, "Paciente nao encontrado");
            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Paciente pacienteEscolhido=this.camposParaObjeto();
        
        if(editando==true){
            this.gerente.atualizar(cpfEscolhido, pacienteEscolhido);
            JOptionPane.showConfirmDialog(this, "Paciente atuaizado");
        }else{
            this.gerente.add(pacienteEscolhido);
            JOptionPane.showMessageDialog(this, "Paciente adicionado");
        }
        try {
        this.gerente.salvarNoArquivo();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
    }
            this.habilitarCampos(false);
            this.limparCampos();
            this.atualizarListagem();
            
    }//GEN-LAST:event_btnSalvarActionPerformed
    public void objetoParaCampos(Paciente paciente){
        edtNome.setText(paciente.getNome());
        edtCpf.setText(paciente.getCpf());
        edtHistorico.setText(paciente.getHistorico());
        edtNascimento.setText(paciente.getDataNascimento());
    }
    
    
    public Paciente camposParaObjeto(){
        Paciente paciente= new Paciente();
        
        paciente.setNome(edtNome.getText());
        paciente.setCpf(edtCpf.getText());
        paciente.setHistorico(edtHistorico.getText());
        paciente.setDataNascimento(edtNascimento.getText());
        return paciente;
    }
    public void habilitarCampos(boolean flag){
        edtNome.setEnabled(flag);
        edtCpf.setEnabled(flag);
        edtHistorico.setEnabled(flag);
        edtNascimento.setEnabled(flag);
        
    }
    public void limparCampos(){
        edtNome.setText("");
        edtCpf.setText("");
        edtHistorico.setText("");
        edtNascimento.setText("");
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextArea edtHistorico;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtNascimento;
    private javax.swing.JTextField edtNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCadPacientes;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblHistorico;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel panOpcoes;
    private javax.swing.JPanel panPreencher;
    // End of variables declaration//GEN-END:variables
}
