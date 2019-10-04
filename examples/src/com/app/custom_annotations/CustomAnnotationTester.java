package com.app.custom_annotations;

@CustomAnnotationTestInfo(
		createdBy = "QuestGlobal",
		meetingClient = "GE"
		)
public class CustomAnnotationTester {
	
	
	public static void callEnable() {
		@CustomAnnotationTest(true)
		if(true) 
			System.out.println("Call executed");
	}
	
	public static void main(String[] args) {
		CustomAnnotationTester.callEnable();
		
		
		@CustomAnnotationTest(true)
		if(true)
			System.out.println("Custom Test Call executed");
	}

}
