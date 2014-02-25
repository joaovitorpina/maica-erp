package com.t2tierp.financeiro.cliente;

import javax.swing.ImageIcon;
import org.openswing.swing.client.GenericButton;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.util.client.ClientUtils;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Tela FinParcelaPagamentoGrid.</p>
*
* <p>The MIT License</p>
*
* <p>Copyright: Copyright (C) 2010 T2Ti.COM
*
* Permission is hereby granted, free of charge, to any person
* obtaining a copy of this software and associated documentation
* files (the "Software"), to deal in the Software without
* restriction, including without limitation the rights to use,
* copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the
* Software is furnished to do so, subject to the following
* conditions:
*
* The above copyright notice and this permission notice shall be
* included in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
* OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
* NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
* HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
* WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
* FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
* OTHER DEALINGS IN THE SOFTWARE.
*
*        The author may be contacted at:
*            t2ti.com@gmail.com</p>
*
* @author Claudio de Barros (t2ti.com@gmail.com)
* @version 1.0
*/
public class FinParcelaPagamentoGrid extends InternalFrame {

    private FinParcelaPagamentoGridController controller;

    public FinParcelaPagamentoGrid(FinParcelaPagamentoGridController controller) {
        initComponents();
        gridControl1.setController(controller);
        gridControl1.setGridDataLocator(controller);

        genericButton1.setToolTipText("Pagar parcelas selecionadas");

        this.controller = controller;
    }

    public GridControl getGrid1() {
        return gridControl1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        genericButton1 = new GenericButton(new ImageIcon(ClientUtils.getImage("ok.gif")));
        gridControl1 = new org.openswing.swing.client.GridControl();
        checkBoxColumn1 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        integerColumn5 = new org.openswing.swing.table.columns.client.IntegerColumn();
        dateColumn6 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn7 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn8 = new org.openswing.swing.table.columns.client.DateColumn();
        decimalColumn10 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn11 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn12 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn13 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn14 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn15 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn16 = new org.openswing.swing.table.columns.client.DecimalColumn();

        setTitle("T2Ti ERP - Financeiro - Contas a Pagar");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fin Parcela Pagar"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);

        genericButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genericButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(genericButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setAutoLoadData(false);
        gridControl1.setFunctionId("finParcelaPagamento");
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.t2tierp.financeiro.java.FinParcelaPagarVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        checkBoxColumn1.setColumnName("selecionado");
        checkBoxColumn1.setEnableInReadOnlyMode(true);
        checkBoxColumn1.setHeaderColumnName(" ");
        checkBoxColumn1.setPreferredWidth(30);
        gridControl1.getColumnContainer().add(checkBoxColumn1);

        textColumn2.setColumnFilterable(true);
        textColumn2.setColumnName("contaCaixa.nome");
        textColumn2.setColumnSortable(true);
        textColumn2.setHeaderColumnName("Conta Caixa");
        textColumn2.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn2.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn2);

        textColumn3.setColumnFilterable(true);
        textColumn3.setColumnName("finLancamentoPagar.fornecedor.pessoa.nome");
        textColumn3.setColumnSortable(true);
        textColumn3.setHeaderColumnName("Fornecedor");
        textColumn3.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn3.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn3);

        textColumn5.setColumnFilterable(true);
        textColumn5.setColumnName("finLancamentoPagar.numeroDocumento");
        textColumn5.setColumnSortable(true);
        textColumn5.setHeaderColumnName("Nr Documento");
        textColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(textColumn5);

        textColumn4.setColumnFilterable(true);
        textColumn4.setColumnName("finStatusParcela.descricao");
        textColumn4.setColumnSortable(true);
        textColumn4.setHeaderColumnName("Status Parcela");
        textColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(textColumn4);

        integerColumn5.setColumnName("numeroParcela");
        integerColumn5.setHeaderColumnName("Numero Parcela");
        integerColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(integerColumn5);

        dateColumn6.setColumnFilterable(true);
        dateColumn6.setColumnName("dataEmissao");
        dateColumn6.setColumnSortable(true);
        dateColumn6.setHeaderColumnName("Data Emissao");
        dateColumn6.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn6);

        dateColumn7.setColumnFilterable(true);
        dateColumn7.setColumnName("dataVencimento");
        dateColumn7.setColumnSortable(true);
        dateColumn7.setHeaderColumnName("Data Vencimento");
        dateColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn7);

        dateColumn8.setColumnName("descontoAte");
        dateColumn8.setHeaderColumnName("Desconto Ate");
        dateColumn8.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn8);

        decimalColumn10.setColumnName("valor");
        decimalColumn10.setColumnSortable(true);
        decimalColumn10.setDecimals(2);
        decimalColumn10.setHeaderColumnName("Valor");
        decimalColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(decimalColumn10);

        decimalColumn11.setColumnName("taxaJuro");
        decimalColumn11.setHeaderColumnName("Taxa Juro");
        decimalColumn11.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn11.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn11);

        decimalColumn12.setColumnName("taxaMulta");
        decimalColumn12.setHeaderColumnName("Taxa Multa");
        decimalColumn12.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn12.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn12);

        decimalColumn13.setColumnName("taxaDesconto");
        decimalColumn13.setHeaderColumnName("Taxa Desconto");
        decimalColumn13.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn13.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn13);

        decimalColumn14.setColumnName("valorJuro");
        decimalColumn14.setHeaderColumnName("Valor Juro");
        decimalColumn14.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn14.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn14);

        decimalColumn15.setColumnName("valorMulta");
        decimalColumn15.setHeaderColumnName("Valor Multa");
        decimalColumn15.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn15.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn15);

        decimalColumn16.setColumnName("valorDesconto");
        decimalColumn16.setHeaderColumnName("Valor Desconto");
        decimalColumn16.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        decimalColumn16.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(gridControl1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genericButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genericButton1ActionPerformed
        controller.pagamentoCompartilhado();
    }//GEN-LAST:event_genericButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn1;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn6;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn7;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn8;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn10;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn11;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn12;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn13;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn14;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn15;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn16;
    private org.openswing.swing.client.GenericButton genericButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn5;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    // End of variables declaration//GEN-END:variables
}
