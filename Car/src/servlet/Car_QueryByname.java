package servlet;

import dao.CarDao_realize;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Car_QueryByname extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String var = req.getParameter("var");
        CarDao_realize rea = new CarDao_realize();
        Car car = rea.querycarByName(var);
        List<Car> cars=new ArrayList<Car>();
        cars.add(car);
        req.setAttribute("car",cars);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
