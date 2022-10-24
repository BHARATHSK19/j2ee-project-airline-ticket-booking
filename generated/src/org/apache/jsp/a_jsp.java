package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class a_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body> \r\n");
      out.write(" <form id=\"form-submit\" action=\"\" method=\"post\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                  <div class=\"col-md-6\">\r\n");
      out.write("                                           <table width=\"100%\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"30%\">User Name </td>\r\n");
      out.write("    <td width=\"6%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"64%\"><label>\r\n");
      out.write("      <input name=\"t1\" type=\"text\" id=\"t1\">\r\n");
      out.write("    </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Mobileno</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input name=\"t2\" type=\"text\" id=\"t2\" maxlength=\"10\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Gender</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><label>\r\n");
      out.write("      <select name=\"t3\" id=\"t3\">\r\n");
      out.write("        <option value=\"M\">M</option>\r\n");
      out.write("        <option value=\"F\">F</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </label></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Date of Birth </td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input name=\"t4\" type=\"date\" id=\"t4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Photo</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input name=\"t5\" type=\"file\" id=\"t5\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Emailid</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input name=\"t6\" type=\"text\" id=\"t6\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Password</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input name=\"t7\" type=\"text\" id=\"t7\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><label></label></td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"Submit\" value=\"Submit\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("                                       \r\n");
      out.write("                                  \r\n");
      out.write("                                </form>\r\n");
      out.write("\t\t\t\t\t\t\t    <div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t     ");

   
	if(request.getParameter("Submit")!=null)
			{
		try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/airline2021","root","mysql"); 
				

       	 		 String t1=request.getParameter("t1").trim();
				 String t2=request.getParameter("t2").trim();
				 String t3=request.getParameter("t3").trim();
				 String t4=request.getParameter("t4").trim();
				 String t5=request.getParameter("t5").trim();
				 String t6=request.getParameter("t6").trim();
				 String t7=request.getParameter("t7").trim();
				
		 
		
	

        	PreparedStatement pstmt=con.prepareStatement("insert into signup values(?,?,?,?,?,?,?)");   
        	pstmt.setString(1,t1);
            pstmt.setString(2,t2);
            pstmt.setString(3,t3);
            pstmt.setString(4,t4);
            pstmt.setString(5,t5);
            pstmt.setString(6,t6);
            pstmt.setString(7,t7);
			
			
			
             pstmt.executeUpdate(); 
             pstmt.close();  
             con.close(); 
			 out.println("<h1 align=center ><b>Applied successfully</b></h1>");
         		 
			}
	

   		 
		 
    catch(Exception e)
    {
      out.println("Exception occured" +e);
    }
	}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
