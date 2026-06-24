
package com.mycompany.calculadora.view;

import com.mycompany.calculadora.classes.CalculadoraService;


public class CalculadoraFrame extends javax.swing.JFrame {

    private CalculadoraService service;
    private boolean novaEntrada;
    public CalculadoraFrame() {
        initComponents();
        this.service= new CalculadoraService();
        this.novaEntrada=true;
        this.registrarEventos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn7.setText("7");

        btn4.setText("4");

        btn1.setText("1");

        btn8.setText("8");

        btn9.setText("9");

        btn5.setText("5");

        btn6.setText("6");

        btn3.setText("3");

        btn2.setText("2");

        btn0.setText("0");

        btnDivisao.setText("%");

        btnVezes.setText("*");

        btnCancelar.setText("C");

        btnMenos.setText("-");

        btnMais.setText("+");

        btnPonto.setText(".");

        btnTotal.setText("=");

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CALCULADORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn1)
                                    .addComponent(btn4)
                                    .addComponent(btn7))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn5)
                                    .addComponent(btn8)
                                    .addComponent(btn2)))
                            .addComponent(btn0))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6)
                            .addComponent(btn3)
                            .addComponent(btn9)
                            .addComponent(btnPonto)
                            .addComponent(btnCancelar))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVezes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivisao)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnVezes))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btnMenos))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn3)
                    .addComponent(btn2)
                    .addComponent(btnMais))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnPonto)
                    .addComponent(btnTotal))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarEventos() {
    btn0.addActionListener(evt -> clicarNumero("0"));
    btn1.addActionListener(evt -> clicarNumero("1"));
    btn2.addActionListener(evt -> clicarNumero("2"));
    btn3.addActionListener(evt -> clicarNumero("3"));
    btn4.addActionListener(evt -> clicarNumero("4"));
    btn5.addActionListener(evt -> clicarNumero("5"));
    btn6.addActionListener(evt -> clicarNumero("6"));
    btn7.addActionListener(evt -> clicarNumero("7"));
    btn8.addActionListener(evt -> clicarNumero("8"));
    btn9.addActionListener(evt -> clicarNumero("9"));

    btnPonto.addActionListener(evt    -> clicarPonto());
    btnMais.addActionListener(evt     -> clicarOperador("+"));
    btnMenos.addActionListener(evt    -> clicarOperador("-"));
    btnVezes.addActionListener(evt    -> clicarOperador("×"));
    btnDivisao.addActionListener(evt  -> clicarOperador("÷"));
    btnTotal.addActionListener(evt    -> clicarIgual());
    btnCancelar.addActionListener(evt -> clicarLimpar());
}
    private void clicarNumero(String numero) {
    if (display.getText().equals("0")) {
        display.setText(numero);
    } else {
        display.setText(display.getText() + numero);
    }
    service.setNumeroAtual(valorAtual());
}
 
    private void clicarPonto() {
    String texto = display.getText();
    
    String[] partes = texto.split("[+\\-×÷]");
    String ultimaParte = partes[partes.length - 1];

    if (!ultimaParte.contains(".")) {
        display.setText(texto + ".");
    }
}
 
    private void clicarOperador(String op) {
    service.setNumeroAtual(valorAtual());
    service.definirOperador(op);
    display.setText(display.getText() + " " + op + " "); 
    novaEntrada = false; 
}
    private void clicarIgual() {
    service.setNumeroAtual(valorAtual());
    double resultado = service.calcularResultado();
    display.setText(formatarNumero(resultado));
    service.resetar();
    novaEntrada = true;
}
 
    private void clicarLimpar() {
        display.setText("0");
        service.resetar();
        novaEntrada = true;
    }
 
     private double valorAtual() {
    try {
        String texto = display.getText().trim();
    
        String[] partes = texto.split("\\s*[+×÷]\\s*|\\s*-\\s*(?=\\d)");
        String ultimo = partes[partes.length - 1].trim();
        return Double.parseDouble(ultimo);
    } catch (NumberFormatException e) {
        return 0;
    }
}
 
    private String formatarNumero(double num) {
        if (Double.isNaN(num) || Double.isInfinite(num)) return "Erro";
        if (num == (long) num) return String.valueOf((long) num);
        return String.valueOf(num);
    }
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
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnVezes;
    private javax.swing.JTextField display;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
