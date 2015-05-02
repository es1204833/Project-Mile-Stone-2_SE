package Repository;

import model.Textbook;

import java.util.List;
import java.util.ArrayList;

import javax.ejb.Singleton;

@Singleton
public class TextBookRepository {

    private List<Textbook> textbooks;
    private int lasttextbookIsbn = 0;
    
    public TextBookRepository()
    {
        
    }
    
    public TextBookRepository(List<Textbook> textbooks , int lasttextbookIsbn) {
        this.textbooks = textbooks;
        this.lasttextbookIsbn=lasttextbookIsbn;
    }

    public List<Textbook> getTextBooks() {
        if (textbooks != null) {
            return textbooks;
        } else {
            insertTestData();
                    return textbooks;
        }
    }

    public void addTextBook(Textbook textbook) {
        if (textbooks == null) {
            textbooks = new ArrayList();
        }
        textbooks.add(textbook);
        textbook.setIsbn(++lasttextbookIsbn);
    }

    public void updateTextBook(Textbook texbook) {
        for (int i = 0; i < textbooks.size(); i++) {
            if (textbooks.get(i).getIsbn() == texbook.getIsbn()) {
                textbooks.set(i, texbook);
                break;
            }
        }
    }

    public void deleteTextBook(int bookIsbn) {
        textbooks.removeIf(c -> c.getIsbn() == bookIsbn);
    }

    public Textbook getTextBook(int isbn) {
        for (int i = 0; i < textbooks.size(); i++) {
            if (textbooks.get(i).getIsbn() == isbn) {
                return textbooks.get(i);
            }
        }
        return null;
    }

    private void insertTestData() {

        if (textbooks != null && textbooks.size() > 0) {
            return;
        }

        addTextBook(new Textbook(978, "C++ Without Fear", "Brian Overlan", 2004, "Dean & Deka ,United States", 8, false, "Avilable", 80, "12/5/2006"));
        addTextBook(new Textbook(631, "Practical C++ Programming", "Steve Oualline", 2002, "Liz Co,Norway", 32, true, "Not Avilable", 9, "12/5/2009"));
        addTextBook(new Textbook(678, "The C++ Programming Language", "Bjarne Stroustrup", 1997, "Hrij,Norway", 54, false, "Ordered", 80, "12/5/2008"));
        addTextBook(new Textbook(234, "C++ For Dummies", "Stephen R. Davis", 2000, "VanK,Lebanon", 2, true, "Avilable", 3, "12/5/2008"));
        

    }

    public static void main(String[] str) {
        TextBookRepository obj = new TextBookRepository();
        for (int i = 0; i < obj.getTextBooks().size(); i++) {
            System.out.println(obj.getTextBooks().get(i).getNoOfCopies());
        }
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList();
        status.add("Avilable");
        status.add("Not Avilable");
        status.add("Ordered");
        return status;
    }
}
