package com.t2tierp.contratos.cliente;

import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Tela ContratoSolicitacaoServicoGrid.</p>
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
public class ContratoSolicitacaoServicoGrid extends InternalFrame {

    public ContratoSolicitacaoServicoGrid(ContratoSolicitacaoServicoGridController controller) {
        initComponents();
        gridControl1.setController(controller);
        gridControl1.setGridDataLocator(controller);
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
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        gridControl1 = new org.openswing.swing.client.GridControl();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn6 = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumn7 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn8 = new org.openswing.swing.table.columns.client.DateColumn();
        comboColumn9 = new org.openswing.swing.table.columns.client.ComboColumn();
        comboColumn10 = new org.openswing.swing.table.columns.client.ComboColumn();

        setTitle("T2Ti ERP - Gestão de Contratos");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato Solicitacao Servico"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(insertButton1);
        jPanel1.add(deleteButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setFunctionId("contratoSolicitacaoServico");
        gridControl1.setInsertButton(insertButton1);
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.t2tierp.contratos.java.ContratoSolicitacaoServicoVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        textColumn2.setColumnName("fornecedor.pessoa.nome");
        textColumn2.setHeaderColumnName("Fornecedor");
        textColumn2.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn2.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn2);

        textColumn3.setColumnName("cliente.pessoa.nome");
        textColumn3.setHeaderColumnName("Cliente");
        textColumn3.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn3.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn3);

        textColumn4.setColumnName("setor.nome");
        textColumn4.setHeaderColumnName("Setor");
        textColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn4.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn4);

        textColumn5.setColumnName("colaborador.pessoa.nome");
        textColumn5.setHeaderColumnName("Colaborador");
        textColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        textColumn5.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn5);

        textColumn6.setColumnName("contratoTipoServico.nome");
        textColumn6.setHeaderColumnName("Tipo Servico");
        textColumn6.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(textColumn6);

        dateColumn7.setColumnName("dataSolicitacao");
        dateColumn7.setHeaderColumnName("Data Solicitacao");
        dateColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        gridControl1.getColumnContainer().add(dateColumn7);

        dateColumn8.setColumnName("dataDesejadaInicio");
        dateColumn8.setHeaderColumnName("Data Desejada Inicio");
        dateColumn8.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        dateColumn8.setPreferredWidth(115);
        gridControl1.getColumnContainer().add(dateColumn8);

        comboColumn9.setColumnName("urgente");
        comboColumn9.setDomainId("simnao");
        comboColumn9.setHeaderColumnName("Urgente");
        comboColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(comboColumn9);

        comboColumn10.setColumnName("statusSolicitacao");
        comboColumn10.setDomainId("contratoStatusSolicitacaoServico");
        comboColumn10.setHeaderColumnName("Status Solicitacao");
        comboColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11));
        comboColumn10.setPreferredWidth(110);
        gridControl1.getColumnContainer().add(comboColumn10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(gridControl1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn10;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn9;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn7;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn8;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn6;
    // End of variables declaration//GEN-END:variables
}
