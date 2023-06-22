package homework7;

public class QualificationEx2 extends TeacherEx2{

	public QualificationEx2(String course, int experienceYears, String schedule) {
		super(course, experienceYears, schedule);

	}	
	public void verify() {
		
			if (course.equals("Java") && experienceYears >3 && schedule.equals("Afternoon")){
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}	
	}
}