package controller;

//<editor-fold defaultstate="collapsed" desc="imports">
import Repository.TextBookRepository;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.inject.Inject;
import model.Textbook;
//</editor-fold>

@WebServlet("/updatetextbook")
public class UpdateTextBookController extends HttpServlet {

   @Inject
    TextBookRepository textRespository;

    //<editor-fold defaultstate="collapsed" desc="doGet">
    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {

        int textbookIsbn = Integer.parseInt(request.getParameter("isbn"));
        Textbook textbook = textRespository.getTextBook(textbookIsbn);
        request.setAttribute("textbook", textbook);
       

        //Forward to the jsp page for rendering
        request.getRequestDispatcher("updatetextbook.jsp").forward(request, response);
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="doPost">
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            //Get the form data and create a Customer Object
             //Get the form data and create a Customer Object
            Textbook textbook = new Textbook();
            textbook.setIsbn(Integer.parseInt(request.getParameter("isbn")));
            textbook.setTitle(request.getParameter("title"));
            textbook.setAuthor(request.getParameter("author"));
            textbook.setYear(Integer.parseInt(request.getParameter("year")));
            textbook.setPubliser(request.getParameter("publiser"));
            textbook.setPrice(Integer.parseInt(request.getParameter("price")));
            textbook.setImage(Boolean.parseBoolean(request.getParameter("image")));
            textbook.setStatus(request.getParameter("status"));   
            textbook.setNoOfCopies(Integer.parseInt(request.getParameter("noOfCopies")));
            textbook.setDate(request.getParameter("date"));
                    
                   
            textRespository.updateTextBook(textbook);

            //Store a confirmation message
            request.getSession().setAttribute("message", String.format("TextBook with Isbn %s was updated.", textbook.getIsbn()));
            response.sendRedirect("textbooks");
        } catch (Exception ex) {
            ex.printStackTrace(response.getWriter());
        }
    }
    //</editor-fold>
}
