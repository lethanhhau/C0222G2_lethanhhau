import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("calculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Integer.parseInt(request.getParameter("first-operand"));
        float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
        String operator = request.getParameter("operator");
        float result = 0.0f;
        try {
            result = operatorNumber(firstOperand, secondOperand, operator);
        } catch (ArithmeticException e) {
            request.setAttribute("alert", "Second Operand is not 0");
        } catch (Exception e) {
            request.setAttribute("alert", "Second Operand is not 0");
        }
        request.setAttribute("first", firstOperand);
        request.setAttribute("second", secondOperand);
        request.setAttribute("result",result);
        request.setAttribute("operator", operator);
        request.getRequestDispatcher("calculator.jsp").forward(request, response);
    }

    private float operatorNumber(float firstOperand, float secondOperand, String operator) {
        float result = 0.0F;
        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand == 0) {
                    throw new ArithmeticException("By zero");
                } else {
                    result = firstOperand / secondOperand;
                }
        }
        return result;
    }
}
