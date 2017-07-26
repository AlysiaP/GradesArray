import java.util.Scanner; //will allow you to read from the screen
public class GradesArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameArray = {"Jon", "Rajesh", "Elizabeth", "Julio", "Chang"};
		String[] gradeArray = new String[5];
		double[] score1Array = {72, 60, 45, 70, 89};
		double[] score2Array = {50, 70, 60, 85, 90};
		double[] score3Array = {70, 80, 90, 100, 100};
		double[] averageArray = new double[5];
		for(int i=0; i<4; i++) {
			//why 4?
			averageArray[i] = (score1Array[i] + score2Array[i]+score3Array[i])/3;
			if(averageArray[i]>90.00){
				gradeArray[i] = "A";
			}else if(averageArray[i]>80.00) {
				gradeArray[i] = "B";
			}else if(averageArray[i]>70.00){
				gradeArray[i] = "C";
			}else if(averageArray[i]>60.00){
				gradeArray[i]="D";
			}else {
				gradeArray[i]="F";
			}
			System.out.println("Name is: "+ nameArray[i] + " Grade is: " + gradeArray[i] + " Average is: " + nameArray[i]);
		}

	}

}
//end main method
