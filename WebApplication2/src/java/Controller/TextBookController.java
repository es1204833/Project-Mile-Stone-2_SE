package Controller;

//<editor-fold defaultstate="collapsed" desc="imports">
import Repository.TextBookRepository;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.inject.Inject;
import model.Textbook;
//</editor-fold>

@WebServlet("/textbooks")
public class TextBookController extends HttpServlet {

  
     @Inject
    TextBookRepository textRespository;

       //<editor-fold defaultstate="collapsed" desc="doGet">
    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Textbook> textBooks = textRespository.getTextBooks();
        request.setAttribute("textBookList", textBooks);

        //Forward to view
        request.getRequestDispatcher("textbook.jsp").forward(request, response);
    }

    
    //</editor-fold>

        @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
            doGet(request, response);
    }
}
    
  
