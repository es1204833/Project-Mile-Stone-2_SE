/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Textbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author engy
 */
public class TextbookTest {
    
		Textbook t1 = new Textbook(1234,"Starting Out with C++","Tony Gaddis",2005,"Heather McNally",200,true,"available",100,"02-05-2015");
		
		
		@Test
		public void testToString() {
			testGetIsbn();
			testGetTitle();
			testGetAuthor();
			testGetYear();
			testGetPubliser();
			testGetPrice();
			testGetImage();
			testGetStatus();
			testGetNoOfCopies();
			testGetDate();

		}

		@Test
		public void testGetIsbn() {
			assertEquals(1234, t1.getIsbn(),0);
		}

		@Test
		public void testGetTitle() {
			assertEquals("Starting Out with C++",t1.getTitle());
		}
		
		@Test
		public void testGetAuthor() {
			assertEquals("Tony Gaddis", t1.getAuthor());
		}

		@Test
		public void testGetPubliser() {
			assertEquals("Heather McNally", t1.getPubliser());
		}

		@Test
		public void testGetYear() {
			assertEquals(2005, t1.getYear(),0);
		}
		
		@Test
		public void testGetPrice() {
			assertEquals(200, t1.getPrice(),0);
		}
		
		@Test
		public void testGetImage() {
			assertEquals(true, t1.isImage());
		}
		
		@Test
		public void testGetStatus() {
			assertEquals("available", t1.getStatus());
		}
		
		@Test
		public void testGetNoOfCopies() {
			assertEquals(100, t1.getNoOfCopies(),0);
		}
		
		@Test
		public void testGetDate() {
			assertEquals("02-05-2015", t1.getDate());
		}

	

	}
