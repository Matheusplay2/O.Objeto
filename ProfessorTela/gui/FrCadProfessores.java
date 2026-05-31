
package gui;

import classes.Professor;
import gerenciador.GerenciadorProfessor;

public class FrCadProfessores extends javax.swing.JFrame {
     private GerenciadorProfessor gerente;
     private boolean editando;
  
    public FrCadProfessores() {
        initComponents();
        this.gerente= new GerenciadorProfessor();
        this.editando= false;
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
        panPreenchimento = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        edtSexo = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        edtIdade = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lblTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 0, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Professores");

        btnNovo.setBackground(new java.awt.Color(255, 204, 255));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panBotoes.add(btnNovo);

        btnCancelar.setBackground(new java.awt.Color(255, 204, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panBotoes.add(btnCancelar);

        btnExcluir.setBackground(new java.awt.Color(255, 204, 255));
        btnExcluir.setText("Excluir");
        panBotoes.add(btnExcluir);

        btnEditar.setBackground(new java.awt.Color(255, 204, 255));
        btnEditar.setText("Editar");
        panBotoes.add(btnEditar);

        btnSalvar.setBackground(new java.awt.Color(255, 204, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panBotoes.add(btnSalvar);

        panPreenchimento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setText("Nome:");
        panPreenchimento.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 9, 37, -1));

        lblSexo.setText("Sexo:");
        panPreenchimento.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 60, 37, -1));
        panPreenchimento.add(edtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 57, 71, -1));
        panPreenchimento.add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 6, 71, -1));

        lblIdade.setText("Idade:");
        panPreenchimento.add(lblIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 9, 37, -1));
        panPreenchimento.add(edtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 6, 71, -1));

        lblCpf.setText("Cpf:");
        panPreenchimento.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 60, 37, -1));
        panPreenchimento.add(edtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 57, 87, -1));

        AreaDados.setColumns(20);
        AreaDados.setRows(5);
        jScrollPane1.setViewportView(AreaDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(panPreenchimento, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panPreenchimento, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limparCampos();
        this.habilitar(true);
        this.editando=false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limparCampos();
        this.habilitar(false);
        this.editando=false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Professor novoProfessor= this.CamposParaObjeto();
        
        gerente.add(novoProfessor);
        this.limparCampos();
        this.habilitar(false);
    }//GEN-LAST:event_btnSalvarActionPerformed
    public Professor CamposParaObjeto(){
        Professor professor= new Professor();
        professor.setNome(edtNome.getText());
        professor.setCpf(edtCpf.getText());
        professor.setSexo(edtSexo.getText());
       
        
        int idade = Integer.parseInt(edtIdade.getText());
        professor.setIdade(idade);

         return professor;
         

    }
    
    public void ObjetoParaCampos(Professor professor){
       this.edtNome.setText(professor.getNome());
       this.edtCpf.setText(professor.getCpf());
       this.edtIdade.setText(professor.getIdade()+"");
       this.edtSexo.setText(professor.getSexo());
       
   }
    public void habilitar(boolean flag){
        this.edtNome.setEnabled(flag);
        this.edtCpf.setEnabled(flag);
        this.edtIdade.setEnabled(flag);
        this.edtSexo.setEnabled(flag);
    }
    
    public void limparCampos(){
        this.edtNome.setText("");
        this.edtCpf.setText("");
        this.edtIdade.setText("");
        this.edtSexo.setText("");
    }
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new FrCadProfessores().setVisible(true);
        }
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDados;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panBotoes;
    private javax.swing.JPanel panPreenchimento;
    // End of variables declaration//GEN-END:variables
}
