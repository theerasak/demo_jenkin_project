package demo.jenkins;

public class Grade {

	public String convert(int score) {
		if(score >= 80) {
			return "A";
		}
		if(score >= 70) {
			return "B";
		}
		if(score >= 60) {
			return "C";
		}
		if(score >= 50){
			return "D";
		}
		return "F";
		//TODO
		//FIXME
	}

	public String isInvalidScore(int score) {

		if (score < 0) {
			return "TRUE";
		}
		else {
			return "FALSE";
		}
	}

}
