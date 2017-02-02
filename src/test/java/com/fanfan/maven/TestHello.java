package com.fanfan.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class TestHello {
	 @Test  
     public void testHello(){       
          Hello h = new Hello();  
          String result=h.sayHello("fanfan");
          System.out.println(result);
          Assert.assertEquals("hello :fanfan", result);
//          assertEquals("hello :fanfan",h.sayHello("fanfan")); 
     }  

}
