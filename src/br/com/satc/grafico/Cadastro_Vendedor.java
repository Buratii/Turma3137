/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import br.com.satc.singleton.Classe_Singleton;
import javax.swing.JOptionPane;

/**
 *
 * @author Edutec
 */
public class Cadastro_Vendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Vendedor
     */
    public Cadastro_Vendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jlblCadVendedor = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jtxtRG = new javax.swing.JTextField();
        jtxtCPF = new javax.swing.JTextField();
        jtxtSalario = new javax.swing.JTextField();
        jtxtSetor = new javax.swing.JTextField();
        jlblNome = new javax.swing.JLabel();
        jlblRG = new javax.swing.JLabel();
        jlblCPF = new javax.swing.JLabel();
        jlblSalario = new javax.swing.JLabel();
        jlblSetor = new javax.swing.JLabel();
        jlblCargo = new javax.swing.JLabel();
        jtxtCargo = new javax.swing.JTextField();
        jlblEspeci = new javax.swing.JLabel();
        jtxtEspeci = new javax.swing.JTextField();
        jbtnSair = new javax.swing.JButton();
        jbtnCadastrar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jlblCadVendedor.setFont(new java.awt.Font("Gisha", 1, 24)); // NOI18N
        jlblCadVendedor.setText("Cadastro Vendedor");

        jlblNome.setText("Nome:");

        jlblRG.setText("RG:");

        jlblCPF.setText("CPF:");

        jlblSalario.setText("Salário:");

        jlblSetor.setText("Setor:");

        jlblCargo.setText("Cargo:");

        jlblEspeci.setText("Especialidade:");

        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        jbtnCadastrar.setText("Cadastrar");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCadVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtNome)
                            .addComponent(jtxtSetor)
                            .addComponent(jtxtSalario)
                            .addComponent(jtxtCPF)
                            .addComponent(jtxtRG)
                            .addComponent(jtxtCargo)
                            .addComponent(jtxtEspeci)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblNome)
                                    .addComponent(jlblRG)
                                    .addComponent(jlblCPF)
                                    .addComponent(jlblSalario)
                                    .addComponent(jlblSetor)
                                    .addComponent(jlblCargo))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblEspeci)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblCadVendedor)
                .addGap(18, 18, 18)
                .addComponent(jlblNome)
                .addGap(3, 3, 3)
                .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jlblRG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jlblCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jlblSetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblEspeci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtEspeci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSair)
                    .addComponent(jbtnCadastrar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
    dispose();
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
       String nome, rg, cpf, cargo, setor, especialidade;
    float salario, salariof = 0, comissao = 0;
    
    if (!(jtxtNome.getText().equals("") || jtxtRG.getText().equals("") || jtxtCPF.getText().equals("") || jtxtSetor.getText().equals("")
       || jtxtCargo.getText().equals("") || jtxtEspeci.getText().equals("")|| jtxtSalario.getText().equals(""))){
        
       nome = jtxtNome.getText();
       rg = jtxtRG.getText();
       cpf = jtxtCPF.getText();
       cargo = jtxtCargo.getText();
       setor = jtxtSetor.getText();
       
       especialidade = jtxtEspeci.getText();
       try{
       salario = Float.parseFloat(jtxtSalario.getText());
           Classe_Singleton.getInstance().vendedores.add(new Vendedor(nome, rg, cpf, cargo, setor, especialidade, salario, salariof, comissao));
           JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!.");
           jtxtCPF.setText("");
           jtxtCargo.setText("");
           jtxtEspeci.setText("");
           jtxtNome.setText("");
           jtxtRG.setText("");
           jtxtSalario.setText("");
           jtxtSetor.setText("");
       }catch(NumberFormatException nfe){
       JOptionPane.showMessageDialog(this,"Salário inválido : \n"+nfe);
       }
    }else{
      JOptionPane.showMessageDialog(this,"Campos em Branco.");
        
    }
    }//GEN-LAST:event_jbtnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JLabel jlblCPF;
    private javax.swing.JLabel jlblCadVendedor;
    private javax.swing.JLabel jlblCargo;
    private javax.swing.JLabel jlblEspeci;
    private javax.swing.JLabel jlblNome;
    private javax.swing.JLabel jlblRG;
    private javax.swing.JLabel jlblSalario;
    private javax.swing.JLabel jlblSetor;
    private javax.swing.JTextField jtxtCPF;
    private javax.swing.JTextField jtxtCargo;
    private javax.swing.JTextField jtxtEspeci;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextField jtxtRG;
    private javax.swing.JTextField jtxtSalario;
    private javax.swing.JTextField jtxtSetor;
    // End of variables declaration//GEN-END:variables
}
