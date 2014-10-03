package com.aim.oop;

public class CsharpCourse extends AbstractCourse{
	
		public CsharpCourse()
		{
			this.courseDuration = 2;
			this.courseName = "C# Fundamentals";
				
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
