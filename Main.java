import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.print("Hasta La Victoria Siempre"); 
        System.out.println("Hasta La Victoria Siempre");
        //to move the cursor to next line we use println
        System.out.println("Hasta La Victoria Siempre");
        
        //or using \n 
        // \n for new line
        // \t for tab
        // \" for writting quotes
        /* multi line comment
         * you take care
         * of yourself
         */
        System.out.print("Hasta La Victoria Siempre \n"); 
        System.out.println("Hasta La Victoria Siempre \n");

        Scanner inputtaker = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = inputtaker.nextLine();
        System.out.println("Hello "+ name);
        System.out.println("What is your age");
        int age = inputtaker.nextInt();
        System.out.println( name + "you are "+ age +"years old");
        System.out.println("What is your favoraite food ?");
        inputtaker.nextLine();
        String favfood = inputtaker.nextLine();
        System.out.println( "your favoraite food is " +favfood +"isn't it");




        

        //Math Class
        double x = 3.14;
        double y = -10;
        double z = Math.max(x,y);
        int ab = 564;

        System.out.println( z+" is the greater number");
        double absolute = Math.abs(y);
        System.out.println( absolute+" is the absolute value of "+y);


        double squareroot = Math.sqrt(ab);
        System.out.println( squareroot+" is the  squareroot of "+ab);

        double dre = 4567.763;
        double roundeddre = Math.round(dre);
        System.out.println(roundeddre +" is the  rounded value of "+dre);

        double roundedup = Math.ceil(dre);
        System.out.println(roundedup +" is the  rounded ceiling value of "+dre);

        double flooreddown = Math.floor(dre);
        System.out.println(flooreddown +" is the  rounded floor value of "+dre);

        //generating random values
        //import java.util.Random;

        Random random = new Random();
		
		//for random no between [1 to 6]
        int xr = random.nextInt(6)+1;




		double yr = random.nextDouble();
		boolean zr = random.nextBoolean();
		
		System.out.println(xr);
        System.out.println(yr);
        System.out.println(zr);




        inputtaker.close();


    }
}