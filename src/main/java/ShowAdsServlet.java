/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAdsServlet", urlPatterns = "/ads")
public class ShowAdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.setAttribute("ads", DaoFactory.getAdsDao().all());
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }
}
