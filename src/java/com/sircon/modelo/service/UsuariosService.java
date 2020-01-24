package com.sircon.modelo.service;

import com.sircon.control.dto.RptaLoginDTO;
import com.sircon.control.dto.UsuarioDTO;
import com.sircon.modelo.dao.implement.UsuarioDAO;
import com.sircon.modelo.entidades.Usuario;

/**
 *
 * @author Erick Meza
 */
public class UsuariosService {
    
    private UsuarioDAO dao;
    
    private static final String CODIGO_OK = "00";
    
    private static final String CODIGO_ERROR = "-1";
    
    private static final String MSG_USUARIO_NO_EXISTE = "Usuario no existe";
    
    private static final String MSG_USUARIO_CLAVE_INCORRECTA = "Contraseña Incorrecta";
    
    private static final String MSG_AUTENTICACION_CORRECTA = "Usuario y Password Correctos";
    
    public UsuariosService(){
        this.dao = new UsuarioDAO();
    }
    
    public RptaLoginDTO autenticar(UsuarioDTO usuario){
        
        RptaLoginDTO respuesta;
        
        Usuario usuarioEncontrado = dao.buscarUsuario(usuario.getUsuario());
        
        if (usuarioEncontrado == null){
            respuesta = new RptaLoginDTO(CODIGO_ERROR, MSG_USUARIO_NO_EXISTE);
        }else if(!usuarioEncontrado.getPassword().equals(usuario.getPass())){
            respuesta = new RptaLoginDTO(CODIGO_ERROR, MSG_USUARIO_CLAVE_INCORRECTA);            
        }else{
            respuesta = new RptaLoginDTO(CODIGO_OK, MSG_AUTENTICACION_CORRECTA);
        }
        
        return respuesta;
    }
    
}
