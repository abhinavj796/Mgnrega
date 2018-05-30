package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class WorkersList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myInput {\n");
      out.write("  background-image: url('/css/searchicon.png');\n");
      out.write("  background-position: 10px 10px;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 16px;\n");
      out.write("  padding: 12px 20px 12px 40px;\n");
      out.write("  border: 10px solid #ddd;\n");
      out.write("  margin-bottom: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 5px solid #ddd;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable th, #myTable td {\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable tr {\n");
      out.write("  border-bottom: 3px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable tr.header, #myTable tr:hover {\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("h1{\n");
      out.write("color:black;\n");
      out.write("background-color:lightcoral;\n");
      out.write("padding:5px;\n");
      out.write("text-align:center;\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("color:black;\n");
      out.write("text-align:center;\n");
      out.write("font-size:110%\n");
      out.write("}\n");
      out.write("footer {\n");
      out.write("    padding: 1em;\n");
      out.write("    color: white;\n");
      out.write("    background-color: black;\n");
      out.write("    clear: left;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"aliceblue\">\n");
      out.write("\n");
      out.write("<center><h1>LIST OF THE AVAILABLE WORKERS</h1><center>\n");
      out.write("<center><img src=\"clglist.jpg\" alt=\"clglist\"></center>\n");
      out.write("<p>Search by the state name to filter the colleges and then click on the college name to check the college details.</p><br>\t\n");
      out.write("<input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search by city/town name..\" title=\"Type in a name\">\n");
      out.write("\n");
      out.write("<table id=\"myTable\">\n");
      out.write("  <tr class=\"header\">\n");
      out.write("    <th style=\"width:23%;\">Name</th>\n");
      out.write("    <th style=\"width:23%;\">Type of Work</th>\n");
      out.write("    <th style=\"width:23%;\">City/Town</th>\n");
      out.write("    <th style=\"width:23%;\">Mobile No.</th>\n");
      out.write("    <th style=\"width:23%;\">See Contact Details</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("   ");

      Connection con;
ResultSet rs =null;
Statement stmt;
Vector items= new Vector( );
String it[]=new String[1000];
int i=0;
String url=new String();
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:ab","","");
stmt = con.createStatement();
   
rs = stmt.executeQuery("SELECT * FROM Labour ");
while(rs.next())
{

   
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td>");
      out.print(rs.getString(1));
      out.write("</a></td>\n");
      out.write("    <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("    <td><form action=\"WorkerDetails\">  <input type='hidden' name=\"email\" value=\"");
      out.print(rs.getString(2));
      out.write("\"/><br/>  <input type=\"submit\" value=\"Click Here\"/>  </form></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  ");

}
  
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function myFunction() {\n");
      out.write("  var input, filter, table, tr, td, i;\n");
      out.write("  input = document.getElementById(\"myInput\");\n");
      out.write("  filter = input.value.toUpperCase();\n");
      out.write("  table = document.getElementById(\"myTable\");\n");
      out.write("  tr = table.getElementsByTagName(\"tr\");\n");
      out.write("  for (i = 0; i < tr.length; i++) {\n");
      out.write("    td = tr[i].getElementsByTagName(\"td\")[2];\n");
      out.write("    if (td) {\n");
      out.write("      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("        tr[i].style.display = \"\";\n");
      out.write("      } else {\n");
      out.write("        tr[i].style.display = \"none\";\n");
      out.write("      }\n");
      out.write("    }       \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<footer>Copyright &copy; The Career makers.com</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
