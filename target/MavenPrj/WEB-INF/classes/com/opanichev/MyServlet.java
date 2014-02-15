package com.opanichev;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Oleg on 15.02.14.
 */
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.print("<html><body>");
        out.print("<h1>Hello, "+request.getParameter("user")+"!</h1>");
        out.print("</body></html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.print("<html><body>");
        out.print("<h1>Request server at: "+request.getServletPath()+"</h1>");
        out.print("<img src=\"http://d24w6bsrhbeh9d.cloudfront.net/photo/a3Y8rbr_460sa.gif\">");
        out.print("</body></html>");
    }
}
