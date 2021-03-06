package com.t2tierp.financeiro.servidor;

import com.erp.padrao.constantes.Constantes;
import com.erp.padrao.servidor.HibernateUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.type.Type;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.server.Action;
import org.openswing.swing.server.UserSessionParameters;
import org.openswing.swing.util.server.HibernateUtils;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Action FinFluxoCaixaDetalhe.</p>
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
public class FinFluxoCaixaDetalheAction implements Action {

    public FinFluxoCaixaDetalheAction() {
    }

    public String getRequestName() {
        return "finFluxoCaixaDetalheAction";
    }

    public Response executeCommand(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        GridParams pars = (GridParams) inputPar;
        Integer acao = (Integer) pars.getOtherGridParams().get("acao");

        switch (acao) {
            case Constantes.LOAD: {
                return load(inputPar, userSessionPars, request, response, userSession, context);
            }
            case Constantes.INSERT: {
                return insert(inputPar, userSessionPars, request, response, userSession, context);
            }
            case Constantes.UPDATE: {
                return update(inputPar, userSessionPars, request, response, userSession, context);
            }
            case Constantes.DELETE: {
                return delete(inputPar, userSessionPars, request, response, userSession, context);
            }
        }
        return null;
    }

    private Response load(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        Session session = null;
        GridParams pars = (GridParams) inputPar;
        Integer idContaCaixa = (Integer) pars.getOtherGridParams().get("idContaCaixa");
        Date dataInicio = (Date) pars.getOtherGridParams().get("dataInicio");
        Date dataFim = (Date) pars.getOtherGridParams().get("dataFim");
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");

        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String baseSQL = "select FIN_FLUXO_CAIXA from com.t2tierp.financeiro.java.ViewFinFluxoCaixaID as FIN_FLUXO_CAIXA "
                    + " where FIN_FLUXO_CAIXA.viewFinFluxoCaixa.idContaCaixa = " + idContaCaixa
                    + " and FIN_FLUXO_CAIXA.viewFinFluxoCaixa.dataVencimento between '"
                    + formatoData.format(dataInicio) + "' and '" + formatoData.format(dataFim) + "'";

            Response res = HibernateUtils.getAllFromQuery(pars.getFilteredColumns(),
                    pars.getCurrentSortedColumns(),
                    pars.getCurrentSortedVersusColumns(),
                    com.t2tierp.financeiro.java.ViewFinFluxoCaixaID.class,
                    baseSQL,
                    new Object[0],
                    new Type[0],
                    "FIN_FLUXO_CAIXA",
                    HibernateUtil.getSessionFactory(),
                    session);

            return res;
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ErrorResponse(ex.getMessage());
        } finally {
            try {
                session.close();
            } catch (Exception ex1) {
            }
        }
    }

    public Response insert(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        return null;
    }

    public Response update(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        return null;
    }

    public Response delete(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        return null;
    }
}
