/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-05-15 22:33:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import advanced.Recipe;
import java.util.ArrayList;

public final class Recommendation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("advanced.Recipe");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    	");
      advanced.Database db = null;
      synchronized (application) {
        db = (advanced.Database) _jspx_page_context.getAttribute("db", jakarta.servlet.jsp.PageContext.APPLICATION_SCOPE);
        if (db == null){
          db = new advanced.Database();
          _jspx_page_context.setAttribute("db", db, jakarta.servlet.jsp.PageContext.APPLICATION_SCOPE);
          out.write('\r');
          out.write('\n');
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Recipe Recommendations</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .hidden {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("        #details {\r\n");
      out.write("            background-color: #f4e6d2;\r\n");
      out.write("            color: #be872c;\r\n");
      out.write("        }\r\n");
      out.write("        .favorite-btn {\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            color: grey; /* Default color */\r\n");
      out.write("            border: none; /* Remove border for a cleaner look */\r\n");
      out.write("            background: none; /* Remove background */\r\n");
      out.write("        }\r\n");
      out.write("        .favorite-btn.active {\r\n");
      out.write("            color: red; /* Color when the icon is active */\r\n");
      out.write("        }\r\n");
      out.write("        .btn-custom {\r\n");
      out.write("            color: #be872c; /* Golden text */\r\n");
      out.write("            background-color: #f4e6d2; /* Light peach background */\r\n");
      out.write("            border-color: #be872c; /* Golden border */\r\n");
      out.write("        }\r\n");
      out.write("        .card-header {\r\n");
      out.write("            background-color: #be872c; /* Golden background */\r\n");
      out.write("            color: white; /* White text */\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background: #f9f3ea;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        .content {\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("        th, td {\r\n");
      out.write("            padding: 12px 15px;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            border-bottom: 1px solid #ddd;\r\n");
      out.write("        }\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #f4e6d2;\r\n");
      out.write("            color: #be872c;\r\n");
      out.write("        }\r\n");
      out.write("        tr:nth-child(even) { background-color: #f9f3ea; }\r\n");
      out.write("        tr:hover { background-color: #f4e6d2; }\r\n");
      out.write("        form { margin-top: 20px; }\r\n");
      out.write("        button, .toggleButton {\r\n");
      out.write("            padding: 8px 16px;\r\n");
      out.write("            background-color: #f4e6d2;\r\n");
      out.write("            color: #be872c;\r\n");
      out.write("            border: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("        }\r\n");
      out.write("        button:hover, .toggleButton:hover { background-color: #f4e6d2; }\r\n");
      out.write("        .hidden { display: none; }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        function toggleDetails(id) {\r\n");
      out.write("            var element = document.getElementById(\"details\" + id);\r\n");
      out.write("            element.style.display = element.style.display === \"none\" ? \"block\" : \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("                    <a href='Homaepage.jsp'>home</a>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <h1>Recipe Recommendations</h1>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Instructions</th>\r\n");
      out.write("                <th>Recipe ID</th>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                <th>Calories</th>\r\n");
      out.write("                <th>Protein</th>\r\n");
      out.write("                <th>Fats</th>\r\n");
      out.write("                <th>Carbohydrates</th>\r\n");
      out.write("            </tr> \r\n");
      out.write("            <a href ='Calories.jsp'><button name=\"sort\" value=\"calories\">Sort by Calories</button></a>\r\n");
      out.write("            <a href ='Carb.jsp'> <button name=\"sort\" value=\"protein\">Sort by Carbohydrates</button></a>\r\n");
      out.write("            <a href ='Protein.jsp'> <button name=\"sort\" value=\"carbohydrates\">Sort by protein</button></a>\r\n");
      out.write("         ");

	        ArrayList<Recipe> recipes=db.AllRecipes();
				for(Recipe r:recipes){
			 		r.calcCalories();
	        		out.print("<tr>");
	                out.print("<td><button class='toggleButton' onclick='toggleDetails("+r.getId()+ ")'>view more</button></td>");
	                out.print("<td>" + r.getId() + "</td>");
	                out.print("<td>" + r.getName() + "</td>");
	                out.print("<td>" + r.getCalories() + "</td>");
	                out.print("<td>" + r.getProtein() + "</td>");
	                out.print("<td>" + r.getFats() + "</td>");
	                out.print("<td>" + r.getCarb() + "</td>");
	                out.print("</tr>");
	                
	                out.print("<tr id='details" + r.getId()+ "' class='hidden'>");
	                out.print("<td colspan='7'>");
	                out.print("<strong>Ingredients:</strong> " + db.printIng(r) + "<br>");
	                out.print("<strong>Instructions:</strong> " + r.getDescription());
	                out.print("</td>");
	                out.print("<td>");
            	    out.print("<br><a href=\"FavRecipe.jsp?recipeID=" + r.getId() + "\"><button id=\"favoriteButton\" class=\"btn btn-custom favorite-btn\" type=\"button\" onclick=\"toggleFavorite(this)\">♥</button></a>");
            	    out.print("</td>");
	                out.print("</tr>");

	        	}
				//request.getRequestDispatcher("Recommendation.jsp").include(request, response);
			    
			
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}