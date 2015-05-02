/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import model.Textbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TextBookRepositoryTest {
    
    public TextBookRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTextBooks method, of class TextBookRepository.
     */
   	TextBookRepository TBR1 = new TextBookRepository(null , 1111);

	@Test
	public void testGetTextBooks() {
		assertEquals(null,TBR1.getTextBooks());
	}

	@Test
	public void testGetTextBook() {
		assertEquals(null,TBR1.getTextBook(0));
	}
	
	@Test
	public void testInsertTestData() {
		assertEquals(null,TBR1.getTextBook(0));
	}

	@Test
	public void testGetStatus() {
		assertEquals("available",TBR1.getStatus());
	}
	
	@Test
	public void testAddTextBook() {
		TBR1.addTextBook(new Textbook(978, "C++ Without Fear", "Brian Overlan",
				2004, "Dean & Deka ,United States", 8, false, "Avilable", 80,
				"12/5/2006"));
		assertEquals(new Textbook(978, "C++ Without Fear", "Brian Overlan",
				2004, "Dean & Deka ,United States", 8, false, "Avilable", 80,"12/5/2006"),TBR1.addTextBook(null));
	}

	@Test
	public void testUpdateTextBook() {
		TBR1.addTextBook(new Textbook(978, "C++ Without Fear", "Brian Overlan",
				2004, "Dean & Deka ,United States", 8, false, "Avilable", 80,
				"12/5/2006"));
		assertEquals(new Textbook(978, "C++ Without Fear", "Brian Overlan",
				2004, "Dean & Deka ,United States", 8, false, "Avilable", 80,"12/5/2006"),TBR1.updateTextBook(null));
	}

	@Test
	public void testDeleteTextBook() {
		TBR1.deleteTextBook(978);
		assertEquals(978,TBR1.deleteTextBook(0));
	}

}
