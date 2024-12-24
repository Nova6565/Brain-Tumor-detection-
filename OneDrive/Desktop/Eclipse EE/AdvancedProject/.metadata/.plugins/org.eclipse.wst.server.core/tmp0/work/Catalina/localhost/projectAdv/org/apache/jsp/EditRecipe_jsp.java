/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-05-18 22:33:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import advanced.Recipe;
import advanced.User;
import java.util.ArrayList;

public final class EditRecipe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("advanced.User");
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
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("	<title>Edit Recipe</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"InputRecipe.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("@import url('https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap');\r\n");
      out.write("\r\n");
      out.write("*{\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  font-family: 'Montserrat', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("  background: #f4e6d2;\r\n");
      out.write("  padding: 0 10px;\r\n");
      out.write("}\r\n");
      out.write(".wrapper{\r\n");
      out.write("  max-width: 500px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  background: #fff;\r\n");
      out.write("  margin: 20px auto;\r\n");
      out.write("  box-shadow: 1px 1px 2px rgba(0,0,0,0.125);\r\n");
      out.write("  padding: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .title{\r\n");
      out.write("  font-size: 24px;\r\n");
      out.write("  font-weight: 700;\r\n");
      out.write("  margin-bottom: 25px;\r\n");
      out.write("  color: #be872c;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield{\r\n");
      out.write("  margin-bottom: 15px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield label{\r\n");
      out.write("   width: 200px;\r\n");
      out.write("   color: #be872c;\r\n");
      out.write("   margin-right: 10px;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .input,\r\n");
      out.write(".wrapper form .inputfield .textarea{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  border: 1px solid #d5dbd9;\r\n");
      out.write("  font-size: 15px;\r\n");
      out.write("  padding: 8px 10px;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  transition: all 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".textarea{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 125px;\r\n");
      out.write("  resize: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".terms {\r\n");
      out.write("  margin-bottom: 15px;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  flex-direction: column; \r\n");
      out.write("}\r\n");
      out.write(".checkbox-label{\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .checkbox-container {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  flex-wrap: wrap;\r\n");
      out.write("  gap: 10px; /* Adjust spacing between checkboxes */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .checkbox-label {\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .checkbox-label input[type=\"checkbox\"] {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  opacity: 0;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .checkbox-label .checkmark {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  width: 15px;\r\n");
      out.write("  height: 15px;\r\n");
      out.write("  border: 1px solid #be872c;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  margin-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .checkbox-label input[type=\"checkbox\"]:checked ~ .checkmark:after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  left: 5px;\r\n");
      out.write("  top: 1px;\r\n");
      out.write("  width: 5px;\r\n");
      out.write("  height: 10px;\r\n");
      out.write("  border: solid #be872c;\r\n");
      out.write("  border-width: 0 2px 2px 0;\r\n");
      out.write("  transform: rotate(45deg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .checkbox-label:hover .checkmark {\r\n");
      out.write("  background-color: #f0f0f0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .checkbox-label:hover input[type=\"checkbox\"] ~ .checkmark {\r\n");
      out.write("  background-color: #f0f0f0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".wrapper form .inputfield .btn{\r\n");
      out.write("  width: 100%;\r\n");
      out.write("   padding: 8px 10px;\r\n");
      out.write("  font-size: 15px;  \r\n");
      out.write("  border: 0px;\r\n");
      out.write("  background:  #be872c;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("  outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .form .inputfield .btn:hover{\r\n");
      out.write("  background: #be872c;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .form .inputfield:last-child{\r\n");
      out.write("  margin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (max-width:420px) {\r\n");
      out.write("  .wrapper .form .inputfield{\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    align-items: flex-start;\r\n");
      out.write("  }\r\n");
      out.write("  .wrapper .form .inputfield label{\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("  }\r\n");
      out.write("  .wrapper .form .inputfield.terms{\r\n");
      out.write("    flex-direction: row;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("   <div class=\"title\">\r\n");
      out.write("      Edit Your Recipe\r\n");
      out.write("   </div>\r\n");
      out.write("	");

		int id= Integer.parseInt(request.getParameter("recipeID"));
		Recipe r= db.searchRecipe(id);
	
      out.write("     \r\n");
      out.write("   <form action=\"editController.jsp\" method=\"post\">\r\n");
      out.write("   <input type=\"hidden\" name=\"id\" value=\"");
      out.print( r.getId() );
      out.write("\">\r\n");
      out.write("      ");

    out.print("<div class=\"inputfield\">");
    out.print("<label>Recipe Name</label>");
    out.print("<input type=\"text\" class=\"input\" value=\"" + r.getName() + "\" name=\"name\">");
    out.print("</div>");

    out.print("<div class=\"inputfield\">");
    out.print("<label>Instructions</label>");
    out.print("<textarea class=\"textarea\" name=\"description\">" + r.getDescription() + "</textarea>");
    out.print("</div>");

    out.print("<div class=\"inputfield\">");
    out.print("<label>Protein</label>");
    out.print("<input type=\"text\" class=\"input\" value=\"" + r.getProtein() + "\" name=\"protein\">");
    out.print("</div>");

    out.print("<div class=\"inputfield\">");
    out.print("<label>Carbohydrates</label>");
    out.print("<input type=\"text\" class=\"input\" value=\"" + r.getCarb() + "\" name=\"carb\">");
    out.print("</div>");

    out.print("<div class=\"inputfield\">");
    out.print("<label>Fats</label>");
    out.print("<input type=\"text\" class=\"input\" value=\"" + r.getFats() + "\" name=\"fats\">");
    out.print("</div>");

      out.write("\r\n");
      out.write("\r\n");
      out.write("       <label style=\"color: #be872c;\">Ingredients:</label>\r\n");
      out.write("      <div class=\"inputfield terms\">\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"apricot\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    apricot\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"apple\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    apple\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"banana\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    banana\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"baking powder\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    baking powder\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"barley\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    barley\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"basmati rice\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    basmati rice\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"bay leaf\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    bay leaf\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"black pepper\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    black pepper\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"blueberry\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    blueberry\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"bread\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    bread\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"broccoli\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    broccoli\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"brown rice\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    brown rice\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"butter\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    butter\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"cantaloupe\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    cantaloupe\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"carrot\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    carrot\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"cereal\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    cereal\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"cheese\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    cheese\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"cherry\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    cherry\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"chicken breast\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    chicken breast\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"chicken stock\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    chicken stock\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"cinnamon\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    cinnamon\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"coconut\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    coconut\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"coriander\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    coriander\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"couscous\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    couscous\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"cottage cheese\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    cottage cheese\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"cucumber\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    cucumber\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"cumin\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    cumin\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"curry\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    curry\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"dragon fruit\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    dragon fruit\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"eggs\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    eggs\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"fish\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    fish\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"garlic\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    garlic\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"ginger\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    ginger\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"grapes\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    grapes\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"greek yogurt\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    greek yogurt\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"kiwi\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    kiwi\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"lean beef steak\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    lean beef steak\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"lemon\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    lemon\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"lentils\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    lentils\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"mango\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    mango\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"milk\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    milk\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"oil\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    oil\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"olive oil\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    olive oil\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"onion\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    onion\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"orange\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    orange\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"paprika\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    paprika\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"parsley\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    parsley\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"pasta\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    pasta\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"peach\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    peach\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"pear\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    pear\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"pepper\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    pepper\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"pineapple\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    pineapple\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"plum\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    plum\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"quinoa\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    quinoa\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"raspberry\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    raspberry\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"rosemary\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    rosemary\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"salt\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    salt\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"strawberry\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    strawberry\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"toast\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    toast\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"tofu\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    tofu\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"tomato\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    tomato\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"tuna\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    tuna\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"vinegar\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    vinegar\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"water\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    water\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"watermelon\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    watermelon\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"white rice\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    white rice\r\n");
      out.write("</label>\r\n");
      out.write("<label class=\"checkbox-label\">\r\n");
      out.write("    <input type=\"checkbox\" name=\"selected\" value=\"yogurt\">\r\n");
      out.write("    <span class=\"checkmark\"></span>\r\n");
      out.write("    yogurt\r\n");
      out.write("</label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </div> \r\n");
      out.write("       <div class=\"inputfield\">\r\n");
      out.write("        <input type=\"submit\" value=\"Update Recipe\" class=\"btn\" name=\"Done\">\r\n");
      out.write("      </div>\r\n");
      out.write("   </form>\r\n");
      out.write("</div>	\r\n");
      out.write("	\r\n");
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