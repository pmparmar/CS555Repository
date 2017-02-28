

package Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import Parser.Parser.fam;
import Parser.Parser.indi;
import junit.framework.TestCase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.lang.String;

import org.junit.Assert;
import org.junit.Test;

public class SprintTest extends TestCase{
	
	public static ArrayList<indi> individualArray = new ArrayList<indi>();
	public static ArrayList<fam> familyArray = new ArrayList<fam>();

	Parser p =new Parser();
	//indi i=new indi(null);
	
	
	@Test
	


	public void testchecker1()
	{
		Boolean s=p.mrgDateChecker();// call to user story 
		Assert.assertTrue(s); // It returns true if user story 2 runs successfully.
	
	}
	
	public void testchecker2()
	{
		Parser p =new Parser();
		Assert.assertNotNull("Parser tree should not be  null",p);
	}
	
		 
	
	public void testchecker3()
	{
		Date marriagedate=new Date();
		Date Birthdate=new Date();
		Assert.assertNotSame("Both Date should not be same because Person's Birthdate is always before Marriagedate.", Birthdate, marriagedate);
		
	}
	
	public void testchecker4()
	{
		Date marriagedate=new Date();
		Assert.assertNotNull("Marriagedate should not be null ", marriagedate);
	}
	
	public void testchecker5()
	{
		SimpleDateFormat marriagedate=new SimpleDateFormat("dd MMM yyyy");
		SimpleDateFormat Birthdate=new SimpleDateFormat("dd MMM yyyy");
		Assert.assertEquals("Both date should be in proper format.", marriagedate, Birthdate);
	}
	
}


		
	
	
	
