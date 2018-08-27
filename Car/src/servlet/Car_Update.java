package servlet;

import dao.CarDao_realize;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Car_Update extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarDao_realize rea = new CarDao_realize();
        String var =req.getParameter("var");
        Car car = rea.querycarByName(var);
        req.setAttribute("car",car);
        req.getRequestDispatcher("updateCar.jsp").forward(req,resp);
    }
}
