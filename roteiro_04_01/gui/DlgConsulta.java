
package com.mycompany.roteiro_04_01.gui;

import com.mycompany.roteiro_04_01.classes.Consulta;
import com.mycompany.roteiro_04_01.classes.Medico;
import com.mycompany.roteiro_04_01.classes.Paciente;
import com.mycompany.roteiro_04_01.gerenciadores.GerenciadorConsulta;
import com.mycompany.roteiro_04_01.gerenciadores.GerenciadorMedico;
import com.mycompany.roteiro_04_01.gerenciadores.GerenciadorPaciente;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;


public class DlgConsulta extends javax.swing.JDialog {

    private GerenciadorConsulta gerenteConsulta;
    private boolean editando;
    private GerenciadorMedico gerenteMedico;
    private GerenciadorPaciente gerentePaciente;
   
    private Consulta consultaEscolhida;
    
    public DlgConsulta(java.awt.Frame parent, boolean modal) throws FileNotFoundException {
        super(parent, modal);
        initComponents();
    this.gerenteConsulta = new GerenciadorConsulta();
    this.gerenteMedico = new GerenciadorMedico();
    this.gerentePaciente = new GerenciadorPaciente();
    this.editando = false;
    this.consultaEscolhida = null;
    this.habilitarCampos(false);
    this.atualizarListagem();
    }

     private void atualizarListagem(){
       String listagem=this.gerenteConsulta.listar();
       edtListagem.setText(listagem);
      
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadConsultas = new javax.swing.JLabel();
        panOpcoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        panPreencher = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        edtData = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        edtHoras = new javax.swing.JTextField();
        lblPaciente = new javax.swing.JLabel();
        edtPaciente = new javax.swing.JTextField();
        lblMedico = new javax.swing.JLabel();
        edtMedico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListagem = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCadConsultas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCadConsultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadConsultas.setText("Cadastro de Consultas");

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

        btnSalvar.setText("Salvar");
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

        lblData.setText("Data:");

        lblHoras.setText("Horas:");

        edtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtHorasActionPerformed(evt);
            }
        });

        lblPaciente.setText("CPF Paciente:");

        lblMedico.setText("CRM Medico:");

        javax.swing.GroupLayout panPreencherLayout = new javax.swing.GroupLayout(panPreencher);
        panPreencher.setLayout(panPreencherLayout);
        panPreencherLayout.setHorizontalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPreencherLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPreencherLayout.createSequentialGroup()
                        .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(lblMedico)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panPreencherLayout.createSequentialGroup()
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPaciente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(edtPaciente))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panPreencherLayout.setVerticalGroup(
            panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPreencherLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaciente)
                    .addComponent(edtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panPreencherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoras)
                    .addComponent(edtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedico)
                    .addComponent(edtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        edtListagem.setColumns(20);
        edtListagem.setRows(5);
        jScrollPane1.setViewportView(edtListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCadConsultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panOpcoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
            .addComponent(panPreencher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCadConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtHorasActionPerformed
     
    }//GEN-LAST:event_edtHorasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    Consulta novaConsulta = this.camposParaObjeto();
    if (novaConsulta == null) return;

    if (editando) {
        this.gerenteConsulta.atualizar(
            consultaEscolhida.getData(),
            consultaEscolhida.getHoras(),
            consultaEscolhida.getPaciente(),
            consultaEscolhida.getMedico(),
            novaConsulta
        );
      
    try {
        this.gerenteConsulta.salvarNoArquivo();
    } catch (IOException e) {
         JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
    }
        JOptionPane.showMessageDialog(this, "Consulta atualizada com sucesso");
    } else {
        this.gerenteConsulta.add(novaConsulta);
        JOptionPane.showMessageDialog(this, "Consulta salva com sucesso");
    }
     try {
        this.gerenteConsulta.salvarNoArquivo(); 
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo: " + e.getMessage());
    }


    this.habilitarCampos(false);
    this.limparCampos();
    this.editando = false;
    this.consultaEscolhida = null;
    this.atualizarListagem();
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    String crm = JOptionPane.showInputDialog("Digite o CRM do medico da consulta:");
    String cpf = JOptionPane.showInputDialog("Digite o CPF do paciente da consulta:");
    String data = JOptionPane.showInputDialog("Digite a data da consulta:");
    String horas = JOptionPane.showInputDialog("Digite o horario da consulta:");

    Medico medico = this.gerenteMedico.pesquisar(crm);
    Paciente paciente = this.gerentePaciente.pesquisar(cpf);

    if (medico == null) {
        JOptionPane.showMessageDialog(this, "Medico nao encontrado");
        return;
    }
    if (paciente == null) {
        JOptionPane.showMessageDialog(this, "Paciente nao encontrado");
        return;
    }

    boolean removido = this.gerenteConsulta.remover(data, horas, paciente, medico);

    if (removido) {
        JOptionPane.showMessageDialog(this, "Consulta removida com sucesso");
    } else {
        JOptionPane.showMessageDialog(this, "Consulta nao encontrada");
    }
    
    try {
    this.gerenteConsulta.salvarNoArquivo();
  } catch (IOException e) {
    JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage());
     }

    this.habilitarCampos(false);
    this.limparCampos();
    this.editando = false;
     String listagem=this.gerenteConsulta.listar();
     edtListagem.setText(listagem);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    String crm = JOptionPane.showInputDialog("Digite o CRM do medico da consulta:");
    String cpf = JOptionPane.showInputDialog("Digite o CPF do paciente da consulta:");
    String data = JOptionPane.showInputDialog("Digite a data da consulta:");
    String horas = JOptionPane.showInputDialog("Digite o horario da consulta:");

    Medico medico = this.gerenteMedico.pesquisar(crm);
    Paciente paciente = this.gerentePaciente.pesquisar(cpf);

    if (medico == null) {
        JOptionPane.showMessageDialog(this, "Medico nao encontrado");
        return;
    }
    if (paciente == null) {
        JOptionPane.showMessageDialog(this, "Paciente nao encontrado");
        return;
    }

    Consulta consultaEncontrada = this.gerenteConsulta.pesquisar(data, horas, paciente, medico);

    if (consultaEncontrada != null) {
        this.consultaEscolhida = consultaEncontrada;
        this.editando = true;
        this.habilitarCampos(true);
        this.objetosParaCampos(consultaEncontrada);
    } else {
        JOptionPane.showMessageDialog(this, "Consulta nao encontrada");
      }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando=false;
        this.consultaEscolhida=null;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.habilitarCampos(false);
        this.limparCampos();;
        this.editando=false;
        this.consultaEscolhida=null;
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public Consulta camposParaObjeto() {
    Medico medico = this.gerenteMedico.pesquisar(edtMedico.getText());
    Paciente paciente = this.gerentePaciente.pesquisar(edtPaciente.getText());

    if (medico == null) {
        JOptionPane.showMessageDialog(this, "Medico nao encontrado. Verifique o CRM");
        return null;
    }
    if (paciente == null) {
        JOptionPane.showMessageDialog(this, "Paciente nao encontrado. Verifique o CPF");
        return null;
    }

    Consulta consulta = new Consulta();
    consulta.setData(edtData.getText());
    consulta.setHoras(edtHoras.getText());
    consulta.setMedico(medico);
    consulta.setPaciente(paciente);
    return consulta;
}

public void objetosParaCampos(Consulta consulta) {
    edtData.setText(consulta.getData());
    edtHoras.setText(consulta.getHoras());
    edtMedico.setText(consulta.getMedico().getCrm());
    edtPaciente.setText(consulta.getPaciente().getCpf());
}
    public void limparCampos(){
        edtData.setText("");
        edtHoras.setText("");
        edtMedico.setText("");
        edtPaciente.setText("");
        
    }
    
    
    public void habilitarCampos(boolean flag){
       edtData.setEnabled(flag);
       edtHoras.setEnabled(flag);
       edtMedico.setEnabled(flag);
       edtPaciente.setEnabled(flag);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextField edtHoras;
    private javax.swing.JTextArea edtListagem;
    private javax.swing.JTextField edtMedico;
    private javax.swing.JTextField edtPaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadConsultas;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JPanel panOpcoes;
    private javax.swing.JPanel panPreencher;
    // End of variables declaration//GEN-END:variables
}
