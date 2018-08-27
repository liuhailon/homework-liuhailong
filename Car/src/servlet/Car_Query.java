package servlet;

import com.google.gson.Gson;
import dao.CarDao;
import dao.CarDao_realize;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Car_Query extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Car> cars = new CarDao_realize().carList();
        //resp.getWriter().write(new Gson().toJson(cars));
        req.setAttribute("car",cars);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
