<%-- 
    Document   : bienvenida
    Created on : 16/12/2019, 08:57:30 AM
    Author     : gdelossantos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" href="imagen/paloma.jpg" type="imagen/jpg"/>
        <title>Bienvenido al Portal NSDC</title>
        <link href="css/milogin.css" rel="stylesheet" type="text/css"/>
        <link href="css2/miLayout.css" rel="stylesheet" type="text/css"/>
        <link href="css2/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        
    </head>
    <body>
        
        <nav class="navbar navbar-expand-md navbar-dark bg-dark flex-lg-row">
            <a class="navbar-brand mr-auto" href=" ">
                <img width="50" height="50" src="imagen/paloma2.jpg" alt="" class="rounded-circle"/>
                
            </a>
            <ul class="navbar-nav flex-lg-row mr-lg-0">
                <li class="nav-item">
                    <a class="nav-link pr-2" ><i class="fa fa-search"></i></a>
                    
                </li>
                <li class="nav-item">
                    <a class="nav-link pr-2" href="https://es-la.facebook.com/" target="blank"><i class="fa fa-facebook"></i></a>
                                 
                </li>
                <li class="nav-item">
                    <a class="nav-link pr-2" href="https://google.com/" target="blank"><i class="fa fa-google"></i></a>
                 
                </li>
                <li class="nav-item">
                    <a class="nav-link pr-2" href="https://web.whatsapp.com/" target="blank"><i class="fa fa-whatsapp"></i></a>
                 
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
                    <a class="nav-link" id="nav-link-custom" href="//codeply.com/go/cxXqbnGrPx">NSDC</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Modulo1.jsp">Profesores</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Modulo2.jsp" >Administrativo</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Modulo3.jsp" >Alumnos</a>
                    </li>
                    
                </ul>
                
                <form class="form-inline my-2 my-lg-0">
                     <input class="form-control mr-sm-2" type="text" placeholder="buscar">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                </form>
                
            </div>
            
        </nav>
        
        <footer class="mt-auto fixed-bottom p-3">
            <small>Copyrigth &copy; www.idat.edu.pe</small>
            
        </footer>
        <br>
        <br>
        <br>
        
        
        <img width="1582" height="562" src="imagen/salon.jpg" alt=""/>
        
    </body>
</html>
