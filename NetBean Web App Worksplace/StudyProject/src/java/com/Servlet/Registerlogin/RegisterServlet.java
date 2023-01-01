/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.Servlet.Registerlogin;

import com.study.dao.UserTableDao;
import com.study.helper.ConnectionProvider;
import com.study.entity.UserTable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author ASUS
 */
@MultipartConfig
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //Fetch The register form data
            String check = request.getParameter("ucheck");
            String password = request.getParameter("upass");
            //String repassword = request.getParameter("rupass");
            String about = request.getParameter("uabout");
            if (check == null) {
                out.print("please accept term and condition");
            } else {
                String name = request.getParameter("uname");
                String email = request.getParameter("uemail");
                String gender = request.getParameter("gender");
                Part part =request.getPart("uimage");
                String image = part.getSubmittedFileName();
                //Create a user objects and set it
                UserTable user = new UserTable(name, email, password, gender, about, image);
                //Create a user dao objects
                UserTableDao udao = new UserTableDao(ConnectionProvider.getConnection());
                if (udao.saveUser(user)) {
                    out.print("done");
                    InputStream is = part.getInputStream();
                    byte[] data = new byte[is.available()];
                    String path = request.getRealPath("/img/ProfilePicture")+File.separator+image;
                    try (FileOutputStream fos = new FileOutputStream(path)) {
                        fos.write(data);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                } else {
                    out.print("error");
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
