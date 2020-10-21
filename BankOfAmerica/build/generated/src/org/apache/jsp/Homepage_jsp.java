package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("body {background-color: whitesmoke;}\n");
      out.write("h1   {color: white; font-size: x-large; }\n");
      out.write("p    {color: red;}\n");
      out.write("\n");
      out.write("#wrapper {position: fixed;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    }   \n");
      out.write("#header{height:100px; background-color: firebrick; padding:0px;}\n");
      out.write("#logo {width:150px; height: 100px; background-color: yellow; background-image: \"\\\\C:\\Users\\SACHIN AGRAWAL\\Desktop\\boa.png\"; }\n");
      out.write("#navbar {height:50px; background-color: lightskyblue; margin-top:10px;}\n");
      out.write("#container {border: solid red; margin-top: 10px;}\n");
      out.write("#left-panel{width:25%; height:600px; background-color: orange;}\n");
      out.write("#right-panel { }\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"header\" > <h1> BANK OF AMERICA </h1>\n");
      out.write("            <div id =\"logo\"> </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id =\"navbar\"> <h3> Home  EFEJF  EFEUFU </h3></div>\n");
      out.write("            \n");
      out.write("            <div id=\"container\">\n");
      out.write("                <div id=\"left-panel\">\n");
      out.write("                 <div id =\"right-section\">\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    <div id =\"footer\"></div>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("    </body>   \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
