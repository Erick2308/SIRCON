<%-- 
    Document   : Modulo3
    Created on : 17/01/2020, 03:59:20 PM
    Author     : gdelossantos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <script>
            $(document).ready(function (){
                $('#ejemplo1').DataTable({
                    dom: 'Bfrtip',
                    buttons: [
                       'copy', 'csv','excel','pdf','print' 
                    ],
                    language :{
                    "decimal":        "",
                    "emptyTable":     "datos no disponibles en la tabla",
                    "info":           "Mostrando _START_ a _END_ de _TOTAL_ registros",
                    "infoEmpty":      "Mostrando 0 a 0 10 0 registros",
                    "infoFiltered":   "(filtrado de _MAX_ registros totales)",
                    "infoPostFix":    "",
                    "thousands":      ",",
                    "lengthMenu":     "Mostrando _MENU_ registros",
                    "loadingRecords": "Cargando...",
                    "processing":     "Procesando...",
                    "search":         "Buscar:",
                    "zeroRecords":    "No se encontraron registros para la busqueda",
                    "paginate": {
                    "first":      "Primero",
                    "last":       "Ultimo",
                    "next":       "Siguiente",
                    "previous":   "Anterior"
                    },
                    "aria": {
                    "sortAscending":  ": activar para ordenar ascendente",
                    "sortDescending": ": activar para ordenar descendente"
                    }
                }
            });
        });
            
        </script>
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark bg-dark flex-lg-row">
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
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="text" placeholder="Buscar">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                </form>
            </div>
        </nav>
        <footer class="mt-auto fixed-bottom p-3">
            <small>Copyrigth &copy; www.idat.edu.pe</small>
        </footer>
    </body>
</html>
