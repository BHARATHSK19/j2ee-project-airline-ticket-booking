package org.apache.jsp._2093_005fflight;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import dbconnection.Dbconnection;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=iso-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("Template 2093 Flight\r\n");
      out.write("\r\n");
      out.write("http://www.tooplate.com/view/2093-flight\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("    \t<title>Flight - Travel and Tour</title>\r\n");
      out.write("    \r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontAwesome.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/hero-slider.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl-carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/datepicker.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tooplate-style.css\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <section class=\"banner\" id=\"top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-5\">\r\n");
      out.write("                    <div class=\"left-side\">\r\n");
      out.write("                        <div class=\"logo\">\r\n");
      out.write("                            <img src=\"img/logo.png\" alt=\"Flight Template\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"tabs-content\">\r\n");
      out.write("                            <h4>Choose Your Direction:</h4>\r\n");
      out.write("                            <ul class=\"social-links\">\r\n");
      out.write("                                <li><a href=\"signup.jsp\"><em>Signup</em></a></li>\r\n");
      out.write("                                <li><a href=\"signin.jsp\"><em>Signin </em></a></li>\r\n");
      out.write("                                <li><a href=\"forgotpassword.jsp\"><em>Forgotpassword </em></i></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"page-direction-button\">\r\n");
      out.write("                            <a href=\"contact.html\"><i class=\"fa fa-phone\"></i>Contact Us Now</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-5 col-md-offset-1\">\r\n");
      out.write("                    <section id=\"first-tab-group\" class=\"tabgroup\">\r\n");
      out.write("                        <div id=\"tab1\">\r\n");
      out.write("                            <div class=\"submit-form\">\r\n");
      out.write("                                <h4>Signup</h4>\r\n");
      out.write("                                <form id=\"form-submit\" action=\"\" method=\"get\">\r\n");
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
      out.write("    <td><input type=\"text\" name=\"t6\" id=\"t6\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Password</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input name=\"t7\" type=\"text\" id=\"t7\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"Submit\" value=\"Submit\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write(" </form>\r\n");
      out.write("\t\t\t\t\t\t\t    <div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t      \t\r\n");
      out.write("\t\t\t\t\t\t\t       \r\n");
      out.write("\t\t");


			if(request.getParameter("Submit")!=null)
				{
					try{
				 		 Connection con=Dbconnection.getConnection();
						Statement stmt=con.createStatement();
					
					 String t1=request.getParameter("t1").trim();
					 String t2=request.getParameter("t2").trim();
					 String t3=request.getParameter("t3").trim();
					 String t4=request.getParameter("t4").trim();
					 String t5=request.getParameter("t5").trim();
					 String t6=request.getParameter("t6").trim();
					 String t7=request.getParameter("t7").trim();
					
       	  
		
						int count=0;
						ResultSet rs;
						rs=stmt.executeQuery("select * from signup where Emailid="+"'"+t6+"'");

      		
						while(rs.next())
						{
						count++;
						}

				  
	  
	  
						 if(count==0)
						{
						
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
						out.println("<h1 align=center ><b>Registered successfully</b></h1>");
						//   response.sendRedirect("donerregsaveack.jsp");
						}
						
						else
						{
						
							out.println("<h1 align=center >User already Registered </h1>");
						//		   response.sendRedirect("donerregsaveinvalid.jsp");
						
						}
					}
    
				catch(Exception e)
				{
				out.println("Exception occured" +e);
				}
	}
	

      out.write("\r\n");
      out.write("\t\t\t\t\t\t          </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("             <!-- <div class=\"col-md-12\">\r\n");
      out.write("                    <ul class=\"social-icons\">\r\n");
      out.write("                        <li><a href=\"https://www.facebook.com/tooplate\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("              </div>-->\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <p>Copyright &copy; 2018 Flight Tour and Travel Company\r\n");
      out.write("                \r\n");
      out.write("                | Design: <a href=\"http://www.tooplate.com/view/2093-flight\" target=\"_parent\"><em>Flight</em></a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.2.min.js\"><\\/script>')</script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/datepicker.js\"></script>\r\n");
      out.write("    <script src=\"js/plugins.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        // navigation click actions \r\n");
      out.write("        $('.scroll-link').on('click', function(event){\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            var sectionID = $(this).attr(\"data-id\");\r\n");
      out.write("            scrollToID('#' + sectionID, 750);\r\n");
      out.write("        });\r\n");
      out.write("        // scroll to top action\r\n");
      out.write("        $('.scroll-top').on('click', function(event) {\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            $('html, body').animate({scrollTop:0}, 'slow');         \r\n");
      out.write("        });\r\n");
      out.write("        // mobile nav toggle\r\n");
      out.write("        $('#nav-toggle').on('click', function (event) {\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            $('#main-nav').toggleClass(\"open\");\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    // scroll function\r\n");
      out.write("    function scrollToID(id, speed){\r\n");
      out.write("        var offSet = 0;\r\n");
      out.write("        var targetOffset = $(id).offset().top - offSet;\r\n");
      out.write("        var mainNav = $('#main-nav');\r\n");
      out.write("        $('html,body').animate({scrollTop:targetOffset}, speed);\r\n");
      out.write("        if (mainNav.hasClass(\"open\")) {\r\n");
      out.write("            mainNav.css(\"height\", \"1px\").removeClass(\"in\").addClass(\"collapse\");\r\n");
      out.write("            mainNav.removeClass(\"open\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    if (typeof console === \"undefined\") {\r\n");
      out.write("        console = {\r\n");
      out.write("            log: function() { }\r\n");
      out.write("        };\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
