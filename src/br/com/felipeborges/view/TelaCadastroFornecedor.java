/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.felipeborges.view;

import br.com.felipeborges.controller.CidadeController;
import br.com.felipeborges.controller.FornecedorController;
import br.com.felipeborges.model.Cidade;
import br.com.felipeborges.pessoa.Fornecedor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class TelaCadastroFornecedor extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int linhaSelecionada;

    public TelaCadastroFornecedor(DefaultTableModel modelo) {
        initComponents();
        this.modelo = modelo;
        carregarCombo();
    }

    /**
     * Creates new form TelaFuncionario
     */
    public TelaCadastroFornecedor(DefaultTableModel modelo, int linhaSelecionada, int idFornecedor) {
        initComponents();
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        FornecedorController fc = new FornecedorController();
        Fornecedor f = fc.buscarFornecedorbyId(idFornecedor);
        txIdFornecedor.setText((String.valueOf(f.getIdFornecedor())));
        txNomeFornecedor.setText(f.getNome());

        if (f.getTipo().equalsIgnoreCase("Fisica")) {
            cbTipo.setSelectedIndex(0);
        } else if (f.getTipo().equalsIgnoreCase("Juridica")) {
            cbTipo.setSelectedIndex(1);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(f.getDataNasci());
        txDataNascimentoFornecedor.setText(data);

        txCpf.setText(f.getCpf());
        txRg.setText(f.getRg());
        txCnpj.setText(f.getCnpj());
        txIE.setText(f.getIe());
        txEmail.setText(f.getEmail());
        txHomePage.setText(f.getHomePage());
        txTelefone.setText(f.getTelefone());
        txCelular.setText(f.getCelular());
        txFax.setText(f.getFax());
        carregarCombo(f.getCidade());
        txUf.setText(f.getUf());
        txEndereco.setText(f.getEndereco());
        txProximo.setText(f.getEnderecoProximo());
        txCep.setText(f.getCep());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        GrupoSexo = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txDataNascimento = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txNomeFornecedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btConfirmar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txEndereco = new javax.swing.JTextField();
        txDataNascimentoFornecedor = new javax.swing.JFormattedTextField();
        cbTipo = new javax.swing.JComboBox();
        txCpf = new javax.swing.JFormattedTextField();
        txRg = new javax.swing.JFormattedTextField();
        txTelefone = new javax.swing.JFormattedTextField();
        txCelular = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txCnpj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txUf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txFax = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txIE = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txHomePage = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txProximo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txIdFornecedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txCep = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Fornecedor");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome.:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txDataNascimento.setText("Data de Nascimento");
        jPanel1.add(txDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, -1, -1));

        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        jLabel4.setText("RG.:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, -1, -1));
        jPanel1.add(txNomeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 37, 492, -1));

        jLabel8.setText("Endereco.:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 537, 11));

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 392, -1, -1));

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 392, -1, -1));

        jLabel9.setText("Telefone.:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, -1, -1));

        jLabel10.setText("Celular.:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 219, -1, -1));

        jLabel11.setText("Sexo.:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));
        jPanel1.add(txEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 328, 480, -1));

        try {
            txDataNascimentoFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txDataNascimentoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 86, 157, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fisica", "Juridica" }));
        jPanel1.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 63, 221, -1));

        try {
            txCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 112, 491, -1));

        try {
            txRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 138, 491, -1));

        try {
            txTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 216, 210, -1));

        try {
            txCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 216, 193, -1));

        jLabel13.setText("Cidade.:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, -1, -1));

        cbCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 302, 136, -1));

        jLabel12.setText("CNPJ.:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, -1, -1));
        jPanel1.add(txCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 164, 200, -1));

        jLabel5.setText("UF:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 305, -1, -1));
        jPanel1.add(txUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 302, 118, -1));

        jLabel6.setText("Fax.:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, -1, -1));

        try {
            txFax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txFax, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 242, 210, -1));

        jLabel7.setText("IE.:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 167, -1, -1));
        jPanel1.add(txIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 164, 180, -1));

        jLabel14.setText("E-mail.:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, -1, -1));
        jPanel1.add(txEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 190, 200, -1));

        jLabel15.setText("Home Page.:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 193, -1, -1));
        jPanel1.add(txHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 190, 180, -1));

        jLabel16.setText("Proximo.:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 357, -1, -1));
        jPanel1.add(txProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 354, 480, -1));

        jLabel2.setText("Codigo.:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        txIdFornecedor.setEditable(false);
        jPanel1.add(txIdFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 11, 68, -1));

        jLabel17.setText("CEP.:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 305, -1, -1));
        jPanel1.add(txCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 302, 118, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txNomeFornecedor.setText("");
        txDataNascimentoFornecedor.setText("");
        txCpf.setText("");
        txRg.setText("");
        txCnpj.setText("");
        txIE.setText("");
        txEmail.setText("");
        txHomePage.setText("");
        txTelefone.setText("");
        txCelular.setText("");
        txFax.setText("");
        //cbCidade.
        txCep.setText("");
        txEndereco.setText("");
        txProximo.setText("");
        txUf.setText("");

    }//GEN-LAST:event_btLimparActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        Fornecedor f = new Fornecedor();
        f.setNome(txNomeFornecedor.getText());
        if (cbTipo.getSelectedIndex() == 0) {
            f.setTipo("Fisica");
        } else if (cbTipo.getSelectedIndex() == 1) {
            f.setTipo("Juridica");
        }
        try {
            String data = (txDataNascimentoFornecedor.getText());
            f.setDataNasci(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter a data!");
        }
        f.setCpf(txCpf.getText());
        f.setRg(txRg.getText());
        f.setCnpj(txCnpj.getText());
        f.setIe(txIE.getText());
        f.setEmail(txEmail.getText());
        f.setHomePage(txHomePage.getText());
        f.setTelefone(txTelefone.getText());
        f.setCelular(txCelular.getText());
        f.setFax(txFax.getText());
        f.setCidade((Cidade) cbCidade.getSelectedItem());
        f.setCep(txCep.getText());
        f.setEndereco(txEndereco.getText());
        f.setEnderecoProximo(txProximo.getText());

        FornecedorController fc = new FornecedorController();
        if ((txIdFornecedor.getText().equals("") || (txIdFornecedor.getText().equals(null)))) {
            int id = fc.salvar(f);
            if (id > 0) {
                modelo.addRow(new Object[]{id, f.getNome(), f.getCidade(), f.getTipo()});
                JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!");
            }
        } else {
            f.setIdFornecedor(Integer.parseInt(txIdFornecedor.getText()));
            int id = fc.salvar(f);
            if (id > 0) {
                modelo.removeRow(linhaSelecionada);
                modelo.addRow(new Object[]{id, f.getNome(), f.getCidade(), f.getTipo()});
                JOptionPane.showMessageDialog(null, "Fornecedor Atualizado com sucesso!");
            }
        }
        dispose();
    }//GEN-LAST:event_btConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox cbCidade;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JFormattedTextField txCelular;
    private javax.swing.JTextField txCep;
    private javax.swing.JTextField txCnpj;
    private javax.swing.JFormattedTextField txCpf;
    private javax.swing.JLabel txDataNascimento;
    private javax.swing.JFormattedTextField txDataNascimentoFornecedor;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JFormattedTextField txFax;
    private javax.swing.JTextField txHomePage;
    private javax.swing.JFormattedTextField txIE;
    private javax.swing.JTextField txIdFornecedor;
    private javax.swing.JTextField txNomeFornecedor;
    private javax.swing.JTextField txProximo;
    private javax.swing.JFormattedTextField txRg;
    private javax.swing.JFormattedTextField txTelefone;
    private javax.swing.JTextField txUf;
    // End of variables declaration//GEN-END:variables

    private void carregarCombo() {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCidade.getModel();
        comboModel.removeAllElements();
        List<Cidade> cidades = new ArrayList<>();
        CidadeController cc = new CidadeController();
        cidades = cc.getCidade();

        for (int linha = 0; linha < cidades.size(); linha++) {
            Cidade c = cidades.get(linha);
            comboModel.addElement(c);
        }
    }

    private void carregarCombo(Cidade cidade) {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCidade.getModel();
        comboModel.removeAllElements();
        List<Cidade> cidades = new ArrayList<>();
        CidadeController cc = new CidadeController();
        cidades = cc.getCidade();

        for (int linha = 0; linha < cidades.size(); linha++) {
            Cidade c = cidades.get(linha);
            comboModel.addElement(c);
            if (cidade.getCd_cidade()== c.getCd_cidade()) {
                comboModel.setSelectedItem(c);
            }
        }
    }
}
