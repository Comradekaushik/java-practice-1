public class arrays {
    public static void main(String[] args){
        // array = used to store multiple values within a single variable
		
		String[] cars = new String[3];
		
		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
			
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

        int[] odds = new int[3];
		
		odds[0] = 15;
		odds[1] = 19;
		odds[2] = 21;
			
		for(int i=0; i<cars.length; i++) {
			System.out.println(odds[i]);
		}



        String[][] cars2d = new String[3][3];


        cars2d[0][0] = "Camaro";
        cars2d[0][1] = "Corvette";
        cars2d[0][2] = "Silverado";
        cars2d[1][0] = "Mustang";
        cars2d[1][1] = "Ranger";
        cars2d[1][2] = "F-150";
        cars2d[2][0] = "Ferrari";
        cars2d[2][1] = "Lambo";
        cars2d[2][2] = "Tesla";


    for(int i=0; i<cars.length; i++) {
        System.out.println();
        for(int j=0; j<cars2d[i].length; j++) {
            System.out.print(cars2d[i][j]+" ");
        }
        }
    }
    
}
