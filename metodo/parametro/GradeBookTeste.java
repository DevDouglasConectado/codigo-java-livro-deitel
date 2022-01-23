
package metodo.parametro;
import java.util.Scanner;
public class GradeBookTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //outta opção
        //java.util.Scanner input = new java.util.Scanner(System.in);
        GradeBook myGradeBook = new GradeBook();
        
        System.out.println("Please enter the course name:");
         String nameOfCourse = input.nextLine();
         System.out.println("---------------");
         
         //chama metodo displaymessage de mygradebook 
         //epassa nameofcourse como um arquico
         myGradeBook.displayMessage(nameOfCourse);
        
    }
}
