package servlet;

import dao.CarDao_realize;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Car_Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("ok");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int carId =Integer.parseInt(req.getParameter("carId"));
        String carName = req.getParameter("carName");
        String carDate = req.getParameter("carDate");
        double carPrice =Double.parseDouble(req.getParameter("carPrice"));
        String carType = req.getParameter("carType");
        CarDao_realize realize=new CarDao_realize();
        List<Car> cars = realize.carList();
        cars.add(new Car(carId,carName,carDate,carPrice,carType));
        req.getRequestDispatcher("Car_Query").forward(req,resp);
    }
}
