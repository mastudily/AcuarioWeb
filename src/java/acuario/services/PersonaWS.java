/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.PersonaFacade;
import acuario.clases.Persona;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "PersonaWS")
public class PersonaWS {
    @EJB
    private PersonaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createPersona")
    public boolean createPersona(@WebParam(name = "entity") Persona entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdPersona")
    public Integer createIdPersona(@WebParam(name = "entity") Persona entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editPersona")
    public boolean editPersona(@WebParam(name = "entity") Persona entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removePersona")
    public boolean removePersona(@WebParam(name = "entity") Persona entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findPersona")
    public Persona findPersona(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllPersona")
    public List<Persona> findAllPersona() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countPersona")
    public int countPersona() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findPersonaByNombre")
    public List<Persona> findPersonaByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findPersonaByNombre(nombre);
    }

    @WebMethod(operationName = "findPersonaByIdentidad")
    public List<Persona> findPersonaByIdentidad(@WebParam(name = "rut") String rut) {
        return ejbRef.findPersonaByIdentidad(rut);
    }
    
}
