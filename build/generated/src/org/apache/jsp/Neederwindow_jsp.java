package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class Neederwindow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <style>\n");
      out.write("        \n");
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
      out.write("\n");
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
      out.write("input[type=text], input[type=password],Select, textarea {\n");
      out.write("    \n");
      out.write("    padding: 0px;\n");
      out.write("    border: 3px solid #ccc;\n");
      out.write("    border-radius: 2px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-top: 6px;\n");
      out.write("    margin-bottom: 16px;\n");
      out.write("    resize: horizontal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("             \n");
      out.write("        \n");
      out.write("    \n");
      out.write("<TITLE>Company Page</TITLE>\n");
      out.write("</HEAD>\n");
      out.write("<Body Bgcolor = \"#C0C0C0\" text=\"#ffffcc\">\n");
      out.write("  ");

int a=Integer.parseInt((String) session.getAttribute("flag"));
String cc=(String) session.getAttribute("code");
String n=(String) session.getAttribute("nm");
String ar[]=new String[]{"Sonipat","Panipat","Samalkha","Gaunaur","Rai"};
  String ar1[]=new String[]{"Driver","Plumber","Electrician","Carpenter","Driver"};
      out.write("\n");
      out.write("    \n");
      out.write("    <div id=\"header\">\n");
      out.write("        <div class=\"left\">&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src=\"mgnrega.gif\" width=\"600\" height=\"50\" alt=\"c6\"/></div>\n");
      out.write("        <div class=\"right\">\n");
      out.write("            \n");
      out.write("                &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("                \n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"dropbtn\">UserId:&nbsp");
      out.print( cc );
      out.write("</BUTTON>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"#page-top\">Home</a>\n");
      out.write("                        </div>\n");
      out.write("                </div> &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp \n");
      out.write("                \n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"dropbtn\">Name:&nbsp");
      out.print( n );
      out.write("</BUTTON>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"NeederProfile.jsp\">Profile</a>\n");
      out.write("                        <a href=\"ChangePass.jsp\">Change Pass</a>\n");
      out.write("                        <a href=\"Logout.jsp\">Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                </div> &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("         <div style=\"background-image:url('k.jpg');background-size:100% 100%;\" >\n");
      out.write("          <br/>\n");
      out.write("<CENTER>\n");
      out.write(" <img src=\"Cpage.jpg\"></Center>\n");
      out.write(" <Center>\n");
      out.write(" <br/>\n");
      out.write("<A HREF = \"Contactus.html\"> Contact us </A>\n");
      out.write("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("<A HREF = \"Logout.jsp\"> Logout </A>\n");
      out.write("          <br><br>\n");
      out.write("<form action=\"Neederwindow.jsp\">\n");
      out.write("<h1>Location:</h1>\n");
      out.write("<Select Name =\"add\" > \n");

for(int j=0;j<ar.length;j++)
{
String s=request.getParameter("add");    
if(s==ar[j])
{
    System.out.println(ar[j]);

      out.write("\n");
      out.write("<option value = ");
      out.print( ar[j]);
      out.write(" Selected > ");
      out.print( ar[j]);
      out.write('\n');
    
}
else
{

      out.write("\n");
      out.write("<option value = ");
      out.print( ar[j]);
      out.write(" > ");
      out.print( ar[j]);
      out.write('\n');

}    
}

      out.write("    \n");
      out.write("</Select>\n");
      out.write("<h1>Job:</h1>\n");
      out.write("<Select Name =\"skill\" > \n");
      out.write("<option value = \"Carpenter\"> Carpenter &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("<option value = \"Plumber\" Selected> Plumber\n");
      out.write("<option value = \"Electrician\"> Electrician\n");
      out.write("<option value = \"Driver\"> Driver\n");
      out.write("<option value = \"Painter\"> Painter\n");
      out.write("</Select><br><br>\n");
      out.write("<Input Type = \"submit\" Value=\"Search\">\n");
      out.write("</form>\n");
      out.write("     \n");
      out.write("<FONT COLOR=\"red\" Size = +1> Candidate List according to Your Requirements  </FONT>\n");
      out.write("<Br><br>\n");
      out.write("<TABLE id=\"mytable\">\n");
      out.write("   <TR>\n");
      out.write("   <TH BGCOLOR=\"orange\">Labour id</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Name</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Pay</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Per</TH>\n");
      out.write("   <TH BGCOLOR=\"orange\">Phone no.</TH>\n");
      out.write("   </TR>\n");
      out.write("   ");

      Connection con;
ResultSet rs =null;
Statement stmt;
Vector items= new Vector( );
String it[]=new String[1000];
int i=0;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:ab","","");
stmt = con.createStatement( );
   if(a==0)
   {
rs = stmt.executeQuery("SELECT * FROM Labour where location='Sonipat' And skills='Plumber'");
while(rs.next())
{
    it[i]=rs.getString("Userid");
    i++;
   
      out.write("\n");
      out.write("   <TR>\n");
      out.write("  <TD>");
      out.print( it[i-1] );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString("name") );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString("pay") );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString("per") );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString("pno") );
      out.write("</TD>\n");
      out.write("  </TR>\n");
      out.write("   ");
    
   }
session.setAttribute("flag","1");
   }
   else
   {
String loc=request.getParameter("add");
String job=request.getParameter("skill");
rs = stmt.executeQuery("SELECT * FROM Labour where location=\'"+loc+"\' And skills=\'"+job+"\'");
while(rs.next())
{
    it[i]=rs.getString("Userid");
    i++;
   
      out.write("\n");
      out.write("   <TR>\n");
      out.write("  <TD>");
      out.print( it[i-1]  );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString("name") );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString("pay") );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString("per") );
      out.write("</TD>\n");
      out.write("  <TD>");
      out.print( rs.getString("pno") );
      out.write("</TD>\n");
      out.write("  </TR>\n");
      out.write("   ");
    
   }
   }
  
      out.write("\n");
      out.write("  </TABLE>\n");
      out.write("  </CENTER>\n");
      out.write("<BR><BR>\n");
      out.write("  <FORM METHOD=Post ACTION=\"Compute\">\n");
      out.write("&nbsp&nbsp&nbsp&nbsp  Select Labour id You want to Appoint:\n");
      out.write("<Select Name = cb>\n");

for(int c=0; c<=i-1; c++)
{
String ss=it[c]+"";

      out.write("\n");
      out.write("<Option Value = ");
      out.print( ss );
      out.write("  > ");
      out.print( ss );
      out.write('\n');

}

      out.write("\n");
      out.write("</Select>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("&nbsp&nbsp&nbsp&nbsp Enter No. of Days\n");
      out.write("<Input Type='text' Name = 'nod'>\n");
      out.write("<BR><Br>&nbsp&nbsp&nbsp&nbsp Date of Join \n");
      out.write("<Input Type='Text' Name = 'doj' Value = \"\"> \n");
      out.write("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write(" <INPUT TYPE=\"Submit\" VALUE=\"Submit\">\n");
      out.write("  </form>\n");
      out.write("</CENTER>\n");
      out.write("<marquee><font size =6 color = brown ><i>Specify Appointment information</i></font></marquee><br/>\n");
      out.write("</DIV>\n");
      out.write("</BODY>\n");
      out.write("\n");
      out.write("  <div id=\"footer\">\n");
      out.write("Copyright ©MGNREGA\n");
      out.write("</div>\n");
      out.write("\n");
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
