package com.t2tierp.ponto.cliente;

import com.erp.padrao.constantes.Constantes;
import com.t2tierp.ponto.java.PontoEscalaVO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;
import org.openswing.swing.util.client.ClientUtils;
import org.openswing.swing.util.java.Consts;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe de controle da tela PontoTurmaGrid.</p>
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
public class PontoTurmaGridController extends GridController implements GridDataLocator {

    private String acaoServidor;
    private String pk;
    private PontoEscalaDetalhe pontoEscalaDetalhe;

    public PontoTurmaGridController(PontoEscalaDetalhe pontoEscalaDetalhe) {
        acaoServidor = "pontoTurmaGridAction";
        this.pontoEscalaDetalhe = pontoEscalaDetalhe;
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        //define os parametros da grid
        otherGridParams.put("acao", Constantes.LOAD);
        otherGridParams.put("idPontoEscala", pk);

        return ClientUtils.getData(acaoServidor, new GridParams(action, startIndex, filteredColumns, currentSortedColumns, currentSortedVersusColumns, otherGridParams));
    }

    @Override
    public boolean beforeInsertGrid(GridControl grid) {
        if (pontoEscalaDetalhe.getForm1().getMode() == Consts.READONLY) {
            pontoEscalaDetalhe.getForm1().setMode(Consts.EDIT);
        }
        return true;
    }

    @Override
    public Response insertRecords(int[] rowNumbers, ArrayList newValueObjects) throws Exception {
        PontoEscalaVO escala = (PontoEscalaVO) pontoEscalaDetalhe.getForm1().getVOModel().getValueObject();
        if (escala.getId() != null) {
            //define os parametros da grid
            Map otherGridParams = new HashMap();
            otherGridParams.put("acao", Constantes.INSERT);
            otherGridParams.put("newValueObjects", newValueObjects);
            otherGridParams.put("pontoEscala", escala);
            //seta os parametros da grid
            GridParams pars = new GridParams(0, 0, null, null, null, otherGridParams);
            return ClientUtils.getData(acaoServidor, pars);
        }
        return new VOListResponse(newValueObjects, false, newValueObjects.size());
    }

    @Override
    public boolean beforeEditGrid(GridControl grid) {
        if (pontoEscalaDetalhe.getForm1().getMode() == Consts.READONLY) {
            pontoEscalaDetalhe.getForm1().setMode(Consts.EDIT);
        }
        return true;
    }

    @Override
    public Response updateRecords(int[] rowNumbers, ArrayList oldPersistentObjects, ArrayList persistentObjects) throws Exception {
        PontoEscalaVO escala = (PontoEscalaVO) pontoEscalaDetalhe.getForm1().getVOModel().getValueObject();
        if (escala.getId() != null) {
            //define os parametros da grid
            Map otherGridParams = new HashMap();
            otherGridParams.put("acao", Constantes.UPDATE);
            otherGridParams.put("persistentObjects", persistentObjects);
            //seta os parametros da grid
            GridParams pars = new GridParams(0, 0, null, null, null, otherGridParams);
            return ClientUtils.getData(acaoServidor, pars);
        }
        return new VOListResponse(persistentObjects, false, persistentObjects.size());
    }

    @Override
    public boolean beforeDeleteGrid(GridControl grid) {
        if (pontoEscalaDetalhe.getForm1().getMode() == Consts.READONLY) {
            pontoEscalaDetalhe.getForm1().setMode(Consts.EDIT);
        }
        return true;
    }

    @Override
    public Response deleteRecords(ArrayList persistentObjects) throws Exception {
        PontoEscalaVO escala = (PontoEscalaVO) pontoEscalaDetalhe.getForm1().getVOModel().getValueObject();
        if (escala.getId() != null) {
            //define os parametros da grid
            Map otherGridParams = new HashMap();
            otherGridParams.put("acao", Constantes.DELETE);
            otherGridParams.put("persistentObjects", persistentObjects);
            //seta os parametros da grid
            GridParams pars = new GridParams(0, 0, null, null, null, otherGridParams);
            return ClientUtils.getData(acaoServidor, pars);
        }
        return new VOListResponse(persistentObjects, false, persistentObjects.size());
    }

    /**
     * @param pk the pk to set
     */
    public void setPk(String pk) {
        this.pk = pk;
    }
}
