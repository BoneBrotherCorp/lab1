package lab1.test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.handler.ArgumentMissingException;
import lab1.handler.NoSuchBeverageException;
import lab1.handler.NoSuchIngredientException;
import lab1.handler.NoSuchSizeException;
import lab1.util.Parser;


public class ParserTest {
	Parser p;
	ArrayList<String> s0;
	String[] s1;
	String[] s2;
	String[] s3;
	@Before
	public void setUp() throws Exception {
		p = new Parser();
		s0=new ArrayList<String>();
		s0.add("1");
		s0.add("decaf");
		s0.add("small");
		s0.add("ginger");
		s1=new String[]{"1","decaf","small","ginger;","2","mocha","medium","milk"};
		s2=new String[]{"1","decaf","small","ginger",";2","mocha","medium","milk"};
		s3=new String[]{"1","decaf","small","ginger",";","2","mocha","medium","milk"};
	}

	@Test(timeout = 1000)
	public void testParserOrder() throws InstantiationException, IllegalAccessException, NoSuchBeverageException, NoSuchSizeException, ArgumentMissingException, IndexOutOfBoundsException, NoSuchMethodException, InvocationTargetException, NoSuchIngredientException {
		try {
			Assert.assertEquals(1.5, p.parseOrder(s0), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(timeout = 1000)
	public void testParserOrderLists() throws InstantiationException, IllegalAccessException, NoSuchBeverageException, NoSuchSizeException, ArgumentMissingException, IndexOutOfBoundsException, NoSuchMethodException, InvocationTargetException, NoSuchIngredientException {
		try {
			Assert.assertEquals(6.1, p.parseOrderLists(s1), 0);
			Assert.assertEquals(6.1, p.parseOrderLists(s2), 0);
			Assert.assertEquals(6.1, p.parseOrderLists(s3), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
