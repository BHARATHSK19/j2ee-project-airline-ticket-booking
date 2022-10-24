<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body> 
 <form id="form-submit" action="" method="post">
                                    <div class="row">
                                  <div class="col-md-6">
                                           <table width="100%" border="0">
  <tr>
    <td width="30%">User Name </td>
    <td width="6%">&nbsp;</td>
    <td width="64%"><label>
      <input name="t1" type="text" id="t1">
    </label></td>
  </tr>
  <tr>
    <td>Mobileno</td>
    <td>&nbsp;</td>
    <td><input name="t2" type="text" id="t2" maxlength="10"></td>
  </tr>
  <tr>
    <td>Gender</td>
    <td>&nbsp;</td>
    <td><label>
      <select name="t3" id="t3">
        <option value="M">M</option>
        <option value="F">F</option>
      </select>
    </label></td>
  </tr>
  <tr>
    <td>Date of Birth </td>
    <td>&nbsp;</td>
    <td><input name="t4" type="date" id="t4"></td>
  </tr>
  <tr>
    <td>Photo</td>
    <td>&nbsp;</td>
    <td><input name="t5" type="file" id="t5"></td>
  </tr>
  <tr>
    <td>Emailid</td>
    <td>&nbsp;</td>
    <td><input name="t6" type="text" id="t6"></td>
  </tr>
  <tr>
    <td>Password</td>
    <td>&nbsp;</td>
    <td><input name="t7" type="text" id="t7"></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><label></label></td>
    <td><input type="submit" name="Submit" value="Submit"></td>
  </tr>
</table>

                                       
                                  
                                </form>
							    <div align="center">
							     <%
   
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
%>
</body>
</html>
