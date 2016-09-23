package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	public static MyInteger num1;
	public static MyInteger num2;
	public static MyInteger num3;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	num1= new MyInteger(10);
	num2= new MyInteger(7);
	num3= new MyInteger(3);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1()
	{
		assertTrue(num1.isEven());
		assertFalse(num2.isEven());
	
	}
	
	@Test
	public void test2()
	{
		assertTrue(num2.isOdd());
		assertFalse(num1.isOdd());
	}
	
	@Test
	public void test3()
	{
		assertTrue(num3.isPrime());
		assertFalse(num1.isPrime());
	}
	
	@Test
	public void test4()
	{
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(5));
	}
	
	@Test
	public void test5()
	{
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(4));
	}
	
	@Test
	public void test6()
	{
		assertTrue(MyInteger.isPrime(3));
		assertFalse(MyInteger.isPrime(6));
	}
	@Test
	public void test7()
	{
		assertTrue(MyInteger.isEven(num1));
		assertFalse(MyInteger.isEven(num2));
	}
	@Test
	public void test8()
	{
		assertTrue(MyInteger.isOdd(num2));
		assertFalse(MyInteger.isOdd(num1));
	}
	@Test
	public void test9()
	{
		assertTrue(MyInteger.isPrime(num3));
		assertFalse(MyInteger.isPrime(num1));
	}
	@Test
	public void test10()
	{
		assertTrue(num1.equals(10));
		assertFalse(num1.equals(9));
	}
	@Test
	public void test11()
	{
		assertTrue(num1.equals(num1));
		assertFalse(num1.equals(num3));
	}
	
}



