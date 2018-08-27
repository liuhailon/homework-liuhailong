package servlet;

import dao.CarDao_realize;
import entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Car_UpdateCar extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarDao_realize realize = new CarDao_realize();
        int carId =Integer.parseInt(req.getParameter("carId"));
        String carName = req.getParameter("carName");
        String carDate = req.getParameter("carDate");
        double carPrice =Double.parseDouble(req.getParameter("carPrice"));
        String carType = req.getParameter("carType");
        realize.updateCar(new Car(carId,carName,carDate,carPrice,carType));
        req.getRequestDispatcher("Car_Query").forward(req,resp);
    }
}
