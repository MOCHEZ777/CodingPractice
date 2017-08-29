/*
    Class versus instance excercise day 4 at hackerrank.com
    @version: 1.0
    @author: mochez777
*/
import java.util.Scanner;

class Person{
    //private global variables whose values persist throughout constructor and class methods.
    private int age;
    private String msg;


    public Person(int initialAge) {
        //check person's age and if not valid let user know if not set age to initialAge
        if(initialAge > 0){age = initialAge;} else{age = 0; System.out.println("Age is not valid, setting age to 0.");} 
    }

    public void amIOld() {
        //find out how old the person is. This assumes person's age is valid after it has already been checked by constructor.
        if(age >= 0 && age < 13) {msg="You are young.";}
        else if(age >= 13 && age < 18) {msg="You are a teenager.";}
        else {msg = "You are old.";}
        System.out.println(msg);   
    }

    public void yearPasses() {
        // Increment this person's age every time the function is called.
        age++;
    }

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int y = input.nextInt();  
            
            for(int x = 0; x < y; x++){
                int age = input.nextInt();
                Person thisPerson = new Person(age);
                thisPerson.amIOld();
                for(int j  = 0; j < 3; j++){
                    thisPerson.yearPasses();
                }
                thisPerson.amIOld();
                System.out.println();
            }
            input.close();
    }                                               
}