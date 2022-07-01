<%@page import="java.lang.String"%>
<%@page import="beans.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calificaciones Alumno</title>
         <link rel="stylesheet" href="estiloccs.css">
    </head>
<body>
        <h1> Registro de Alumnos </h1>
        <form id="datos" action="Procesar" method="POST">
            <table>
                <thead>
                    <tr>
                        <th>Matricula</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>DDI</th>
                        <th>DWI</th>
                        <th>ECBD</th> 
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" name="tfMatricula" value="" size="11" maxlength="11"/></td>
                        <td><input type="text" name="tfNombre" value="" size="15"                  /></td>
                        <td><input type="text" name="tfApellidos" value="" size="30"               /></td>
                        <td><input type="text" name="tfDdi" value="" size="2"                      /></td>
                        <td><input type="text" name="tfDwi" value="" size="2"                      /></td>
                        <td><input type="text" name="tfEcbd" value="" size="2"                     /></td>
                        <td><input type="submit" name="btnRegistrar" value="Registrar"             /></td>  
                    </tr>
                </tbody>
            </table>
        </form>  
        <br>
        <br> 
    <footer id="footer">
    &copy;Todos los derechos reservados
    </footer>          
</body>
</html>
    

