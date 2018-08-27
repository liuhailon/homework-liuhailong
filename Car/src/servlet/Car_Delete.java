package servlet;

import dao.CarDao_realize;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Car_Delete extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String var = req.getParameter("var");
        int id=Integer.parseInt(var);
        resp.getWriter().write(var);
        CarDao_realize realize = new CarDao_realize();
        realize.deleteCarById(id);
        req.getRequestDispatcher("Car_Query").forward(req,resp);
    }

}
