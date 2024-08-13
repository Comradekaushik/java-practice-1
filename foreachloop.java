import java.util.ArrayList;

public class foreachloop {
    public static void main(String[] args){
        // for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		
		// String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
        animals.add("wolf");
		
		for(String i : animals) {
			System.out.println(i);
		}

        
        int[] integerarray = {1,2,3,4,5};
        for(int i : integerarray) {
			System.out.println(i);
		}

    }
    
}
