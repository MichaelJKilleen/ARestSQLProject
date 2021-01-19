package com.bottomfeedersoftware;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

@WebServlet(urlPatterns = "/*")
public class BFRestServlet extends HttpServletDispatcher {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Override
  public void init(ServletConfig servletConfig) throws ServletException {
    // TODO Auto-generated method stub
    super.init(servletConfig);
  }

   
}
