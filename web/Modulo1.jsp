<%-- 
    Document   : Modulo1
    Created on : 17/12/2019, 09:45:05 AM
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
        </nav>
        <nav class="navbar navbar-expand-md navbar-light">
                    
        </nav>
        <section id="seccion1">
            <div>
                <table id="ejemplo1" class="display nowrap" style="width: 100%">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Cede</th>
                            <th>Curso</th>
                            
                        </tr>
                    </thead>
                    
                    <tbody>
                        <tr>
                            <td>00001</td>
                            <td>Jorge Torres Lara</td>
                            <td>La Molina</td>
                            <td>Matematica</td>
                            
                        </tr>
                        <tr>
                            <td>00002</td>
                            <td>Juan Sachez Luna</td>
                            <td>Surco</td>
                            <td>Ingles</td>
                            
                        </tr>
                        <tr>
                            <td>00003</td>
                            <td>Ana Caceres Torres</td>
                            <td>Lima</td>
                            <td>Fisica</td>
                            
                        </tr>
                        <tr>
                            <td>00004</td>
                            <td>Luis Castro Reyna</td>
                            <td>Chorrillos</td>
                            <td>Quimica</td>
                            
                        </tr>
                        <tr>
                            <td>00005</td>
                            <td>Susana Santos Castro</td>
                            <td>Lince</td>
                            <td>Biologia</td>
                            
                                      
                            
                        </tr>
                    </tfoot>
                </table>
            </div>
        </section> 
        <footer class="mt-auto fixed-bottom p-3">
            <small>Copyrigth &copy; www.idat.edu.pe</small>
        </footer>
    </body>
</html>
