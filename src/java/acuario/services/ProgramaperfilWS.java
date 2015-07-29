/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.ProgramaperfilFacade;
import acuario.clases.Programaperfil;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "ProgramaperfilWS")
public class ProgramaperfilWS {
    @EJB
    private ProgramaperfilFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createProgramaperfil")
    public boolean createProgramaperfil(@WebParam(name = "entity") Programaperfil entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdProgramaperfil")
    public Integer createIdProgramaperfil(@WebParam(name = "entity") Programaperfil entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editProgramaperfil")
    public boolean editProgramaperfil(@WebParam(name = "entity") Programaperfil entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeProgramaperfil")
    public boolean removeProgramaperfil(@WebParam(name = "entity") Programaperfil entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findProgramaperfil")
    public Programaperfil findProgramaperfil(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllProgramaperfil")
    public List<Programaperfil> findAllProgramaperfil() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countProgramaperfil")
    public int countProgramaperfil() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "listaProgramas")
    public List<Programaperfil> listaProgramas(@WebParam(name = "perfilid") Integer perfilid) {
        return ejbRef.listaProgramas(perfilid);
    }
    
}
