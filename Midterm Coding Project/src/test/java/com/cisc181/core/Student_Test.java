package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> course =new ArrayList<Course>();
	static ArrayList<Semester> semester =new ArrayList<Semester>();
	static ArrayList<Section> section =new ArrayList<Section>();
	static ArrayList<Student> student =new ArrayList<Student>();
	
	@BeforeClass
	public static void setup() {
		Course CISC = (new Course(UUID.randomUUID(),"CISC181", 4, eMajor.COMPSI));
		Course PHYS = (new Course(UUID.randomUUID(),"PHYS207", 4, eMajor.PHYSICS));
		Course CHEM = (new Course(UUID.randomUUID(),"CHEM106", 4, eMajor.CHEM));
		course.add(CISC);
		course.add(PHYS);
		course.add(CHEM);
		
		Semester Fall=(new Semester(UUID.randomUUID(), new Date(), new Date()));
		Semester Spring=(new Semester(UUID.randomUUID(),new Date(), new Date()));
		semester.add(Fall);
		semester.add(Spring);
		
		Section FallCISC1=(new Section(CISC.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 10));
		Section FallCISC2=(new Section(CISC.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 20));
		Section FallPHYS1=(new Section(PHYS.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 50));
		Section FallPHYS2=(new Section(PHYS.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 55));
		Section FallCHEM1=(new Section(CHEM.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 100));
		Section FallCHEM2=(new Section(CHEM.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 200));
		Section SpringCISC1=(new Section(CISC.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 10));
		Section SpringCISC2=(new Section(CISC.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 20));
		Section SpringPHYS1=(new Section(PHYS.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 50));
		Section SpringPHYS2=(new Section(PHYS.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 55));
		Section SpringCHEM1=(new Section(CHEM.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 100));
		Section SpringCHEM2=(new Section(CHEM.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 200));
		section.add(FallCISC1);
		section.add(FallCISC2);
		section.add(FallPHYS1);
		section.add(FallPHYS2);
		section.add(FallCHEM1);
		section.add(FallCHEM2);
		section.add(SpringCISC1);
		section.add(SpringCISC2);
		section.add(SpringPHYS1);
		section.add(SpringPHYS2);
		section.add(SpringCHEM1);
		section.add(SpringCHEM2);

		Student S1=(new Student("Brad","Lee","Hoffman", new Date(),eMajor.COMPSI,"1104 Prince Edward st","(540)-834-0068","whoffman@udel.edu"));
		Student S2=(new Student("John","Felix","Cena", new Date(),eMajor.PHYSICS,"You Can't See Me dr","(898)-323-6789","ANDHISNAMEIS@johncena.com"));
		Student S3=(new Student("Nemo","the","Fish", new Date(),eMajor.NURSING,"42 Wallaby way","(540)-373-0689","clownfish@udel.edu"));
		Student S4=(new Student("Donald","John","Trump", new Date(),eMajor.BUSINESS,"1600 Pensylvannia ave","(400)-834-0538","DJT@udel.edu"));
		Student S5=(new Student("Brad","Stan","Smith", new Date(),eMajor.BUSINESS,"1000 Prince Edward st","(540)-364-0488","newphone@udel.edu"));
		Student S6=(new Student("What","Kinda","Nameisthis", new Date(),eMajor.CHEM,"32 thirty Second st","(911)-466-6789","whodis@udel.edu"));
		Student S7=(new Student("Stan","Ley","Yelnats", new Date(),eMajor.NURSING,"45 Main st","(888)-974-0064","doyoubelieve@udel.edu"));
		Student S8=(new Student("George","Jefferson","Bush", new Date(),eMajor.COMPSI,"369 Lil Jon st","(540)-888-1234","inlife@udel.edu"));
		Student S9=(new Student("Harold","Zach","McClanahan", new Date(),eMajor.PHYSICS,"1 Second st","(212)-222-4444","afterlove@udel.edu"));
		Student S10=(new Student("Tina","Nora","Workman", new Date(),eMajor.COMPSI,"200 Prince Edward st","(500)-333-0000","udel@udel.edu"));
		student.add(S1);
		student.add(S2);
		student.add(S3);
		student.add(S4);
		student.add(S5);
		student.add(S6);
		student.add(S7);
		student.add(S8);
		student.add(S9);
		student.add(S10);

		Enrollment S1A=(new Enrollment(FallCISC1.getSectionID(),S1.getStudentID()));
		Enrollment S1B=(new Enrollment(FallPHYS1.getSectionID(),S1.getStudentID()));
		Enrollment S1C=(new Enrollment(FallCHEM1.getSectionID(),S1.getStudentID()));
		S1A.setGrade(100);
		S1B.setGrade(100);
		S1C.setGrade(100);
		Enrollment S2A=(new Enrollment(FallCISC2.getSectionID(),S2.getStudentID()));
		Enrollment S2B=(new Enrollment(FallPHYS2.getSectionID(),S2.getStudentID()));
		Enrollment S2C=(new Enrollment(FallCHEM2.getSectionID(),S2.getStudentID()));
		S2A.setGrade(95);
		S2B.setGrade(97);
		S2C.setGrade(90);
		Enrollment S3A=(new Enrollment(SpringCISC1.getSectionID(),S3.getStudentID()));
		Enrollment S3B=(new Enrollment(SpringPHYS1.getSectionID(),S3.getStudentID()));
		Enrollment S3C=(new Enrollment(SpringCHEM1.getSectionID(),S3.getStudentID()));
		S3A.setGrade(92);
		S3B.setGrade(75);
		S3C.setGrade(88);
		Enrollment S4A=(new Enrollment(SpringCISC2.getSectionID(),S4.getStudentID()));
		Enrollment S4B=(new Enrollment(SpringPHYS2.getSectionID(),S4.getStudentID()));
		Enrollment S4C=(new Enrollment(SpringCHEM2.getSectionID(),S4.getStudentID()));
		S4A.setGrade(50);
		S4B.setGrade(100);
		S4C.setGrade(90);
		Enrollment S5A=(new Enrollment(FallCISC1.getSectionID(),S5.getStudentID()));
		Enrollment S5B=(new Enrollment(FallPHYS2.getSectionID(),S5.getStudentID()));
		Enrollment S5C=(new Enrollment(SpringCHEM1.getSectionID(),S5.getStudentID()));
		S5A.setGrade(100);
		S5B.setGrade(100);
		S5C.setGrade(100);
		Enrollment S6A=(new Enrollment(SpringCISC1.getSectionID(),S6.getStudentID()));
		Enrollment S6B=(new Enrollment(FallPHYS1.getSectionID(),S6.getStudentID()));
		Enrollment S6C=(new Enrollment(FallCHEM2.getSectionID(),S6.getStudentID()));
		S6A.setGrade(60);
		S6B.setGrade(100);
		S6C.setGrade(80);
		Enrollment S7A=(new Enrollment(FallCISC2.getSectionID(),S7.getStudentID()));
		Enrollment S7B=(new Enrollment(SpringPHYS2.getSectionID(),S7.getStudentID()));
		Enrollment S7C=(new Enrollment(SpringCHEM2.getSectionID(),S7.getStudentID()));
		S7A.setGrade(10);
		S7B.setGrade(60);
		S7C.setGrade(50);
		Enrollment S8A=(new Enrollment(SpringCISC2.getSectionID(),S8.getStudentID()));
		Enrollment S8B=(new Enrollment(FallPHYS1.getSectionID(),S8.getStudentID()));
		Enrollment S8C=(new Enrollment(FallCHEM1.getSectionID(),S8.getStudentID()));
		S8A.setGrade(45);
		S8B.setGrade(88);
		S8C.setGrade(100);
		Enrollment S9A=(new Enrollment(FallCISC1.getSectionID(),S9.getStudentID()));
		Enrollment S9B=(new Enrollment(FallPHYS2.getSectionID(),S9.getStudentID()));
		Enrollment S9C=(new Enrollment(FallCHEM1.getSectionID(),S9.getStudentID()));
		S9A.setGrade(65);
		S9B.setGrade(93);
		S9C.setGrade(97);
		Enrollment S10A=(new Enrollment(SpringCISC2.getSectionID(),S10.getStudentID()));
		Enrollment S10B=(new Enrollment(SpringPHYS1.getSectionID(),S10.getStudentID()));
		Enrollment S10C=(new Enrollment(SpringCHEM2.getSectionID(),S10.getStudentID()));
		S10A.setGrade(70);
		S10B.setGrade(90);
		S10C.setGrade(90);
		
		assertEquals((S1A.getGrade()+S1B.getGrade()+S1C.getGrade())/3,100,.1);
		assertEquals((S2A.getGrade()+S2B.getGrade()+S2C.getGrade())/3,94,.1);
		assertEquals((S3A.getGrade()+S3B.getGrade()+S3C.getGrade())/3,85,.1);
		assertEquals((S4A.getGrade()+S4B.getGrade()+S4C.getGrade())/3,80,.1);
		assertEquals((S5A.getGrade()+S5B.getGrade()+S5C.getGrade())/3,100,.1);
		assertEquals((S6A.getGrade()+S6B.getGrade()+S6C.getGrade())/3,80,.1);
		assertEquals((S7A.getGrade()+S7B.getGrade()+S7C.getGrade())/3,40,.1);
		assertEquals((S8A.getGrade()+S8B.getGrade()+S8C.getGrade())/3,77.6,1);
		assertEquals((S9A.getGrade()+S9B.getGrade()+S9C.getGrade())/3,85,.1);
		assertEquals((S10A.getGrade()+S10B.getGrade()+S10C.getGrade())/3,83.3,1);
		
		assertEquals((S1A.getGrade()+S5A.getGrade()+S9A.getGrade())/3,88.3,1);
		assertEquals((S3A.getGrade()+S6A.getGrade())/2,76,.1);
		assertEquals((S1B.getGrade()+S6B.getGrade()+S8B.getGrade())/3,96,.1);
		assertEquals((S3B.getGrade()+S10B.getGrade())/2,82.5,.1);
		assertEquals((S1C.getGrade()+S8C.getGrade()+S9C.getGrade())/3,99,.1);
		assertEquals((S3C.getGrade()+S5C.getGrade())/2,94,.1);
		assertEquals((S2A.getGrade()+S7A.getGrade())/2,52.5,.1);
		assertEquals((S4A.getGrade()+S8A.getGrade()+S10A.getGrade())/3,55,.1);
		assertEquals((S2B.getGrade()+S5B.getGrade()+S9B.getGrade())/3,96.6,1);
		assertEquals((S4B.getGrade()+S7B.getGrade())/2,80,.1);
		assertEquals((S2C.getGrade()+S6C.getGrade())/2,85,.1);
		assertEquals((S4C.getGrade()+S7C.getGrade()+S10C.getGrade())/3,76.6,1);
		
		S1.setMajor(eMajor.PHYSICS);
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}