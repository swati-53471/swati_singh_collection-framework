package epam.assignment.collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Test {
	
	public static final Logger logger=LogManager.getLogger(Test.class);

  public static void main(String[] args) 
	    {
	        CustomList<String> list = new CustomList();
	 
	        
	        list.add("e");
	        list.add("p");
	        list.add("a");
	        list.add("m");
	        logger.info(list);
	         
	        list.remove(2);
	        logger.info(list);
	        logger.info( list.fetch(2) );
	        logger.info( list.fetch(1) );
	        logger.info(list.size());
	    }
	}

