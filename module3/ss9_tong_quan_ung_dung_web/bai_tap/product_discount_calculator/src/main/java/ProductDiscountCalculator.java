import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", urlPatterns = "/Discount")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription =request.getParameter("productDescription");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));

        float DiscountAmount = (float) (listPrice * discountPercent * 0.01);
        float DiscountPrice = listPrice - DiscountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>product Description: " + productDescription + "</h1>");
        writer.println("<h1>list Price: " + listPrice + "</h1>");
        writer.println("<h1>discount Percent: " + discountPercent + "</h1>");
        writer.println("<h1>Discount Amount: " + DiscountAmount + "</h1>");
        writer.println("<h1>Discount Price: " + DiscountPrice + "</h1>");
        writer.println("</html>");
    }
}