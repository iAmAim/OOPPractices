package com.aim.oop;

public class JavaCourse extends AbstractCourse
{
		public JavaCourse()
		{
			this.courseDuration = 2;
			this.courseName = "Java Fundamentals";
				
		}

		@Override
		public void createCourseMaterial() {
			
			System.out.println( courseName + " course material Created");
		}

		@Override
		public void createSchedule() {
			
			System.out.println( courseName + " course schedule Created");
		}

}
