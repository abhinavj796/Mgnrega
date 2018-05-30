package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class DisplayRecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("  .dropbtn {\n");
      out.write("    background-color: #0059b3;\n");
      out.write("    color: white;\n");
      out.write("    padding: 7px;\n");
      out.write("    font-size: 15px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {\n");
      out.write("    background-color: #0080ff;\n");
      out.write("\n");
      out.write("}\n");
      out.write("input[type=submit] {\n");
      out.write("     width: 12%;\n");
      out.write("    background-color: #00cccc;\n");
      out.write("    color: white;\n");
      out.write("    padding: 4px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: #009999;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  \n");
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
      out.write("}        \n");
      out.write("        \n");
      out.write("#header {\n");
      out.write("    background-color:#0073e6;\n");
      out.write("    color:white;\n");
      out.write("    padding:15px;\n");
      out.write("    height:50px;\n");
      out.write("}    \n");
      out.write(" .right {\n");
      out.write("    position: absolute;\n");
      out.write("    right: 0px;\n");
      out.write("    width: 700px;\n");
      out.write("    padding:23px;\n");
      out.write("   text-align:center;\n");
      out.write("}\n");
      out.write(".left {\n");
      out.write("    float:left;\n");
      out.write("    position: absolute;\n");
      out.write("    left: 0px;\n");
      out.write("    width: 700px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("   #footer {\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("    clear:both;\n");
      out.write("    text-align:center;\n");
      out.write("   padding:5px;\t \t \n");
      out.write("}\n");
      out.write("    </style>   \n");
      out.write("    \n");
      out.write("<TITLE>Candidate Detail</TITLE>\n");
      out.write("</HEAD>\n");
      out.write("\n");
      out.write("<Body Bgcolor = \"#C0C0C0\" Text ='#666699'>\n");
      out.write("    \n");
      out.write("  <div id=\"header\">\n");
      out.write("    <div class=\"left\">&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src=\"mgnrega.gif\" width=\"600\" height=\"50\" alt=\"c6\"/></div>\n");
      out.write("        <div class=\"right\">\n");
      out.write("            \n");
      out.write("                &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"dropbtn\">UserId:&nbsp Mgnrega Admin</BUTTON>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"index.html\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                </div> &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("           <div style=\"background-image:url('acd.jpg');background-size:100% 100%;\" >\n");
      out.write("            <br/> \n");
      out.write("    \n");
      out.write("<CENTER><img src=\"ab.jpg\">\n");
      out.write("<BR>\n");
      out.write("     <CENTER><H1>MGNREGA JOB WORK CLASSIFICATION </H1>\n");
      out.write("     <BR><BR> \n");

     Connection con;
ResultSet rs =null;
Statement stmt;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:ab","","");
stmt = con.createStatement();
    String r=request.getParameter("OPTION");
    r="labour";
if(r.equals("labour"))
{

      out.write("\n");
      out.write("<FONT COLOR=\"red\"> <H2> List of Labour Avaliable</H2></FONT>\n");
      out.write("   <TABLE id=\"mytable\">\n");
      out.write("   <TR>\n");
      out.write("   <TH BGCOLOR=\"orange\">Userid</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Name</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Location</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Pno</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Skills</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Pay</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Per</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Username</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Password</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">FavPlayer</TH>\n");
      out.write("   </TR>\n");
      out.write("   ");

rs = stmt.executeQuery("SELECT * FROM Labour ");
while(rs.next())
{


      out.write("\n");
      out.write("  <TR>\n");
      out.write("  <TD>");
      out.print( rs.getString(1) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(2) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(3) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(4) );
      out.write("</TD>\n");
      out.write("\n");
      out.write("  <TD>");
      out.print( rs.getString(5) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(6) );
      out.write("</TD>  \n");
      out.write("   <TD>");
      out.print( rs.getString(7) );
      out.write("</TD>\n");
      out.write("   <TD>");
      out.print( rs.getString(8) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(9) );
      out.write("</TD>\n");
      out.write("   <TD>");
      out.print( rs.getString(10) );
      out.write("</TD>\n");
      out.write("</TR>\n");
      out.write("  ");

  }}
if(r.equals("labour"))
{

      out.write("\n");
      out.write("<FONT COLOR=\"red\"> <H2> List of Labour Avaliable</H2></FONT>\n");
      out.write("   <TABLE id=\"mytable\">\n");
      out.write("   <TR>\n");
      out.write("   <TH BGCOLOR=\"orange\">Userid</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Name</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Location</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Ciry</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Pno</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Username</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Password</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">FavPlayer</TH>\n");
      out.write("   </TR>\n");
      out.write("   ");

rs = stmt.executeQuery("SELECT * FROM Needer ");
while(rs.next())
{


      out.write("\n");
      out.write("  <TR>\n");
      out.write("  <TD>");
      out.print( rs.getString(1) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(2) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(3) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(4) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(5) );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString(6) );
      out.write("</TD>  \n");
      out.write("   <TD>");
      out.print( rs.getString(7) );
      out.write("</TD>\n");
      out.write("   <TD>");
      out.print( rs.getString(8) );
      out.write("</TD>\n");
      out.write("</TR>\n");
      out.write("  ");

  }}

  
      out.write("\n");
      out.write("  </TABLE>\n");
      out.write("<BR><BR>\n");
      out.write("<Form Method = POST Action = \"AdminHome.html\" >\n");
      out.write("<Input Type = 'Submit' Value = 'Back' >\n");
      out.write("</Form>\n");
      out.write("     </CENTER></div> \n");
      out.write("<div id=\"footer\">\n");
      out.write("Copyright ©ORS_corp.inc\n");
      out.write("</div>    \n");
      out.write("</BODY>\n");
      out.write("</HTML>\n");
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
