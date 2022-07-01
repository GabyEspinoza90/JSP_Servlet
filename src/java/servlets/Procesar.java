package servlets;

import beans.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class Procesar extends HttpServlet 
    {
    
    Alumno alum[]=new Alumno[10];
    int cont=0;
    
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8"); 
        {
       
            if(request.getParameter("btnRegistrar")!=null)
            {
                alum[cont]=new Alumno();
                PrintWriter out= response.getWriter();    
                
                
                alum[cont].setMatricula(request.getParameter("tfMatricula"));
                alum[cont].setNombre(request.getParameter("tfNombre"));
                alum[cont].setApellidos(request.getParameter("tfApellidos"));
                alum[cont].setDdi(Integer.parseInt(request.getParameter("tfDdi")));
                alum[cont].setDwi(Integer.parseInt(request.getParameter("tfDwi")));
                alum[cont].setEcbd(Integer.parseInt(request.getParameter("tfEcbd")));
                alum[cont].calcularProm();
                
                 cont++;
                
           out.println("<link rel=\"stylesheet\" type=\"text/css\" HREF=\"estiloccs.css\">" 
                      +"<h1>Tabla de Alumnos</h1>"
                      +"<table>"
                      + "<thead>"
                      + "<tr>"
                      + "<th>MATRICULA</th>"
                      + "<th>NOMBRE COMPLETO</th>"
                      + "<th>DDI</th>"
                      + "<th>DWI</th>"
                      + "<th>ECBD</th>"
                      + "<th>PROM</th>"
                      +"<th><button onClick=\"window.location.href='index.jsp';\">  \n" 
                      +"REGISTRAR OTRO ALUMNO  \n" 
                      +"</button></th>"
                      + "</tr>"
                      + "</thead>");
                    
          for (int i=0;i<cont;i++)
          {
            
            out.println("<tbody>"
                        +"<tr>"
                        +"<td>"
                        + alum[i].getMatricula()
                        +"</td>"
                                
                        +"<td>"
                        +alum[i].getNombre()+"&nbsp;"+ alum[i].getApellidos()
                        +"</td>"
                                
                        +"<td>"
                        + alum[i].getDdi()
                        +"</td>"
                                
                        +"<td>"
                        + alum[i].getDwi()
                        +"</td>"
                                
                        +"<td>"
                        + alum[i].getEcbd()  
                        +"</td>"
                                
                        +"<td>"
                        + alum[i].calcularProm()
                        +"</td>"
                                
                        +"<td>"
                        +"</td>"
                                
                        +"</tr>" 
                        +"</tbody>");
            
        }

     }   
            
        
    }
    
}

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }

}


