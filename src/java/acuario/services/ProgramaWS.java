/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.ProgramaFacade;
import acuario.clases.Programa;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "ProgramaWS")
public class ProgramaWS {
    @EJB
    private ProgramaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createPrograma")
    public boolean createPrograma(@WebParam(name = "entity") Programa entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdPrograma")
    public Integer createIdPrograma(@WebParam(name = "entity") Programa entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editPrograma")
    public boolean editPrograma(@WebParam(name = "entity") Programa entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removePrograma")
    public boolean removePrograma(@WebParam(name = "entity") Programa entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findPrograma")
    public Programa findPrograma(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllPrograma")
    public List<Programa> findAllPrograma() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countPrograma")
    public int countPrograma() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "ProgramaPorTipo")
    public List<Programa> ProgramaPorTipo(@WebParam(name = "programatipo") String programatipo) {
        return ejbRef.ProgramaPorTipo(programatipo);
    }

    @WebMethod(operationName = "ProgramaPorPadreid")
    public List<Programa> ProgramaPorPadreid(@WebParam(name = "programapadreid") String programapadreid) {
        return ejbRef.ProgramaPorPadreid(programapadreid);
    }

    @WebMethod(operationName = "listaProgramasTipo")
    public List<Programa> listaProgramasTipo(@WebParam(name = "perfilid") Integer perfilid, @WebParam(name = "programatipo") String programatipo, @WebParam(name = "programapadreid") Integer programapadreid) {
        return ejbRef.listaProgramasTipo(perfilid, programatipo, programapadreid);
    }

    @WebMethod(operationName = "findProgramaById")
    public List<Programa> findProgramaById(@WebParam(name = "id") Integer id) {
        return ejbRef.findProgramaById(id);
    }

    @WebMethod(operationName = "findProgramaByNombre")
    public List<Programa> findProgramaByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findProgramaByNombre(nombre);
    }

    @WebMethod(operationName = "findProgramaByTipo")
    public List<Programa> findProgramaByTipo(@WebParam(name = "tipo") String tipo) {
        return ejbRef.findProgramaByTipo(tipo);
    }
    
}
