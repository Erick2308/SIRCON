<%-- 
    Document   : index.jsp
    Created on : 09/12/2019, 11:06:13 AM
    Author     : gdelossantos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CEP NSDC </title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/milogin.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" href="imagen/paloma.jpg" type="imagen/jpg"/>
        
        
    </head>
    
    <body>
        <div class="fondo">
            
        </div>
        <div class="container" id="containerLogin">
               <center>
                <br>
             
                <h1>
                    <style>
                    body {
                    color: white;
                                        
                    }
                    </style>
                    Portal NSDC
                    <head>
                    <style type="text/css">
                    body{
                    background-image: url("imagen/pepito.jpg");
                    background-size: cover;
                    
                  
                
                }
                </style>
                    </head>
                </h1>
                <br>
                               
                    
            <img width="190" height="190" src="imagen/paloma2.jpg" alt="" class="rounded-circle"/>
            </center>
                 
            <form id="formulario1" action="Login">
                
                <div class="form-group">
                <label for="exampleInputEmail1">Usuario</label>
                <input type="text" class="form-control" id="usuario" name="usuario" aria-describedby="emailHelp"
                       placeHolder="Ingresa Usuario" required ="">
                </div>
                <small id="emailHelp" class="form-text text-muted"></small>
                </div>
                <div class="form-group">
                <label for="exampleInputPassword1">Contraseña</label>
                <input type="password" class="form-control" name="pass" ">
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Recordar contraseña</label>
                </div>
                <div>
                    <center>
                        
                    <button type="submit" class="btn btn-primary" id="botonAuth" >Iniciar sesión</button>
                      </center>  
                                             
                </div>
                

            </form>
            

        </div>
    </body>
</html>
