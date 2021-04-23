/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rizz4
 */
public class ArithmethicCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setAttribute("message", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmethiccalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String message = "";
            String firstInput = request.getParameter("value_1");
            String secondInput = request.getParameter("value_2");
            String operation = request.getParameter("operation");
            int first,second,result;
            
            request.setAttribute("value_1", firstInput);
            request.setAttribute("value_2", secondInput);
            

            
            try {
                    first = Integer.parseInt(firstInput);
                    second = Integer.parseInt(secondInput);

                        switch(operation){
                            
                            case "+":
                            result = first+second;    
                            message = "Result: " + result;
                            break;
                            
                            case "-":
                            result = first - second;
                            message = "Result: " + result;
                            break;
                            
                            case "*":
                            result = first * second;
                            message = "Result: " + result;
                            break;
                            
                            case "%":
                                if(first != 0 && second != 0){
                                    result = first % second;
                                    message = "Result: " + result;
                                } else {
                                    message = "Invalid";
                                }             
                            break;
                            
                        }
                    
           
            } catch (NumberFormatException e) {
             message = "Invalid";
            }
        
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmethiccalculator.jsp").forward(request, response);
    }

}
