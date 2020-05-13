package String;

public class Workout1 {

	public static void main(String[] args) {
		
		String text = "You have no choice other than following me!";
		
		int count = 0;
		
		for (int i = 0; i <text.length(); i++) {
			
			if (text.charAt(i)=='o') {
			
				count = count +1;
			}
			
			
		}
        
		System.out.println(count);
	}

}
