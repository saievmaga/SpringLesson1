package com.saiev.Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().printf("<html><body>");
        for (int i = 1; i < 11; i++) {
            Products products = new Products(i, " Product number: ", i + 100);
            resp.getWriter().printf("<h1>" + "ID product: " + products.id + " Name product: "
                    + products.title + i + " Price product: " + products.cost + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
    }


    static class Products {
        int id;
        String title;
        int cost;

        public Products(int id, String title, int cost) {
            this.id = id;
            this.title = title;
            this.cost = cost;
        }
    }
}
