package com.skillnext1;

import com.skillnext1.StudentDAO;
import com.skillnext1.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StudentServlet extends HttpServlet {
	 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Student Servlet is WORKING</h2>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String Sem = req.getParameter("Sem");
        String dept = req.getParameter("dept");

        Student stu = new Student();
        stu.setName(name);
        stu.setSem(Sem);
        stu.setdept(dept);

        StudentDAO.save(stu);

        res.sendRedirect("success.jsp");
    }
}
