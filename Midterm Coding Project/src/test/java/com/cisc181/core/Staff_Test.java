package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> staff =new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
		staff.add(new Staff("John","Jacob","JingleheimerSchmidt",new Date(),"134 His Name Rd","(540)-333-444","IsMyNameToo@gmail.com","MWF 2-3",1,5000,new Date(),eTitle.MR));
		staff.add(new Staff("Michael","Jeffrey","Jordan",new Date(),"23 Chicago St","(919)-232-2323","CutTheBull@gmail.com","TR 4-5",2,3000,new Date(),eTitle.MR));
		staff.add(new Staff("Serena","Jameka","Williams",new Date(),"15 Service St","(123)-345-8484","NotVenus@gmail.com","MWF 11-12",3,6000,new Date(),eTitle.MS));
		staff.add(new Staff("Hillary","Rodham","Clinton",new Date(),"123 United States Rd","(540)-123-4567","haha_very_funny@leakedemail.com","MTR 2-3",4,2000,new Date(),eTitle.MRS));
		staff.add(new Staff("Walter","Bradley","Hoffman",new Date(),"104 Prince Edward St","(540)-834-6900","whoffman@udel.edu","MWF 3-4",5,4000,new Date(),eTitle.MR));
	}
	
	@Test
	public void testSalary(){
		
		double total=0;
		
		for (Staff i: staff){
			total+=i.getSalary();
	}
		
		double average= total/5;
		assertEquals(4000,average,.1);
	}


	@Test
	public void testDOB() throws PersonException{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 1);
		Staff staff = new Staff(eTitle.MR);
		staff.setDOB(calendar.getTime());
	}
	
	@Test
	public void testPhone() throws PersonException{
		Staff staff = new Staff(eTitle.MR);
		staff.setPhone("173823");
	}
}
	
