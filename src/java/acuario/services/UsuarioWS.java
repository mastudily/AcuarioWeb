/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario.services;

import acuario.bean.UsuarioFacade;
import acuario.clases.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Marcelo Astudillo
 */
@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {
    @EJB
    private UsuarioFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createUsuario")
    public boolean createUsuario(@WebParam(name = "entity") Usuario entity) {
        return ejbRef.create(entity);
    }

    @WebMethod(operationName = "createIdUsuario")
    public Integer createIdUsuario(@WebParam(name = "entity") Usuario entity) {
        return ejbRef.createId(entity);
    }

    @WebMethod(operationName = "editUsuario")
    public boolean editUsuario(@WebParam(name = "entity") Usuario entity) {
        return ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeUsuario")
    public boolean removeUsuario(@WebParam(name = "entity") Usuario entity) {
        return ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findUsuario")
    public Usuario findUsuario(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAllUsuario")
    public List<Usuario> findAllUsuario() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "countUsuario")
    public int countUsuario() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "validarUsuario")
    public Usuario validarUsuario(@WebParam(name = "identidad") String identidad, @WebParam(name = "clave") String clave) {
        return ejbRef.validarUsuario(identidad, clave);
    }

    @WebMethod(operationName = "findUsuarioByNombre")
    public List<Usuario> findUsuarioByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findUsuarioByNombre(nombre);
    }

    @WebMethod(operationName = "findUsuarioByIdentidad")
    public List<Usuario> findUsuarioByIdentidad(@WebParam(name = "rut") String rut) {
        return ejbRef.findUsuarioByIdentidad(rut);
    }
    
}
