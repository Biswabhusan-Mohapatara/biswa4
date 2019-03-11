package com.actiTime.genericlib;

public class Any {
	
		
		 
		    String rollNo = null;  
		    String name = null;  
		      
		    public Any(String rollNo, String name)  
		    {  
		        this.rollNo = rollNo;  
		        this.name = name;  
		    }  
		      
		    public static void main(String [] args)  
		    {  
		    	Any t1 = new Any("1", "A") ;  
		    	Any t2 = new Any("1", "A") ;  
		          
		        System.out.println( t1.equals(t2));  
		    }  
		  
	
}

