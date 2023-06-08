package test.BookPractises; 

import BookPractises.ex06_31;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* ex06_31 Tester. 
* 
* @author <Authors name> 
* @since <pre>ÎåÔÂ 28, 2019</pre> 
* @version 1.0 
*/ 
public class ex06_31Test { 

/**
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: isVa1id(long number) 
* 
*/ 
@Test
public void testIsVa1id() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ex06_31.getClass().getMethod("isVa1id", long.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: sumOfDoubleEvenPlace(long number) 
* 
*/ 
@Test
public void testSumOfDoubleEvenPlace() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ex06_31.getClass().getMethod("sumOfDoubleEvenPlace", long.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: getDigit(int number) 
* 
*/ 
@Test
public void testGetDigit() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ex06_31.getClass().getMethod("getDigit", int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: sumOfOddPlace(long number) 
* 
*/ 
@Test
public void testSumOfOddPlace() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ex06_31.getClass().getMethod("sumOfOddPlace", long.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: prefixMatched(long number, int d) 
* 
*/ 
@Test
public void testPrefixMatched() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = ex06_31.getClass().getMethod("prefixMatched", long.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: getSize(long d) 
* 
*/ 
@Test
public void testGetSize() throws Exception { 
//TODO: Test goes here...
    ex06_31 test = new ex06_31();
    assertEquals(9,test.getSize(1234567890));
/*
try {
   Method method = ex06_31.getClass().getMethod("getSize", long.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
* 
* Method: getPrefix(long number, int k) 
* 
*/ 
@Test
public void testGetPrefix() throws Exception { 
//TODO: Test goes here...
    ex06_31 test = new ex06_31();
    assertEquals(98,test.getPrefix(987654321012345L,2));
/* 
try { 
   Method method = ex06_31.getClass().getMethod("getPrefix", long.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
