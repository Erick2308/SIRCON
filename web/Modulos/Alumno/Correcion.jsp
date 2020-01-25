<%-- 
    Document   : Correcion
    Created on : 24 ene. 2020, 18:26:58
    Author     : Erick Meza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
        <script src="js2/jquery.dataTables.js" type="text/javascript"></script>
        <script src="js2/dataTables.buttons.js" type="text/javascript"></script>
        <script src="js2/buttons.flash.min.js" type="text/javascript"></script>
        <script src="js2/jszip.min.js" type="text/javascript"></script>
        <script src="js2/pdfmake.min.js" type="text/javascript"></script>
        <script src="js2/buttons.html5.js" type="text/javascript"></script>
        <script src="js2/buttons.print.min.js" type="text/javascript"></script>
        <script src="js2/vfs_fonts.js" type="text/javascript"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Bienvenido al Portal NSDC</title>
        <link href="css/milogin.css" rel="stylesheet" type="text/css"/>
        <link href="css2/miLayout.css" rel="stylesheet" type="text/css"/>
        <link href="css2/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.bundle.js" type="text/javascript"></script>
        <link href="css/datatables.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/datatables.min.js" type="text/javascript"></script>
        <link rel="shortcut icon" href="imagen/paloma.jpg" type="imagen/jpg"/>
       
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark bg-dark flex-flex-row">
            <a class="navbar-brand mr-auto" href=" ">
                <img width="50" height="50" src="imagen/paloma2.jpg" alt="" class="rounded-circle"/>
            </a>
            <ul class="navbar-nav flex-row mr-lg-0">
                <li class="nav-item">
                    <a class="nav-link pr-2"><i class="fa fa-search"></i></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link pr-2"><i class="fa fa-facebook"></i></a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle mr-3 mr-lg-0" id="navbarDropdownMenuLink" data-toggle="dropdown" 
                       aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-user"></i>
                        <span class="caret"></span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" href="index.jsp">Usuario</a>
                        <a class="dropdown-item" href="index.jsp">Login</a>
                    </div>
                </li>
            </ul>
        </nav>
        <nav class="navbar navbar-expand-md navbar-light">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" id="nav-link-custom" href="//codeply.com/go/cxXqBnGrPx">IDAT</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Alumno?accion=listarTodo" >Tus Cursos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Alumno?accion=correcion" >Solictar Correccion</a>
                    </li>
                </ul>
            </div>
        </nav>
        <section  class="container" id="Registro de Notas">
            <p>Solicitar Correcion</p>
            <form action="formulario1" 
                  method="post">
                
                <div class="form-group row">
                    <label for="nombre" class="col-sm-2 col-form-label"> Curso:</label>
                    <div class="col-sm-10">
                        <select id="curso" name="curso" class="form-control"
                                required="required">
                            <option value="0">--Selecciona curso --</option>
                            <c:forEach items="${ajax1}" var="curso">
                                <option value="${curso.codCursos}" ${curso.codCurso == selectedCurso ? 'selected' : ''}>${curso.nombre}</option>
                            </c:forEach>>
                        </select>
                    </div>                                               
                </div>
                <div class="form-group row">
                    <label for="nombre" class="col-sm-2 col-form-label"> Alumno:</label>
                    <div class="col-sm-10">
                        <select id="alumno" name="alumno" class="form-control"
                                required="required">
                            <option value="0">-- Selecciona Evaluacion a corregir --</option>
                            
                        </select>
                    </div>
                </div>      
                <div class="form-group row">
                    <label for="nombre" class="col-sm-2 col-form-label">Comentario:</label>
                    <div class="col-sm-10">
                        <input type="text" name="comentario" class="form-control" id="comentario"
                               placeholder="Ingrese Comentario" />
                    </div>
                </div>
                <div align="center">
                    <button type="submit" class="btn btn-primary">Enviar</button>
                </div>
            </form>

        </section>
        <footer class="mt-auto fixed-bottom p-3">
            <small>Copyrigth &copy; www.idat.edu.pe</small>
        </footer>
    </body>
</html>
