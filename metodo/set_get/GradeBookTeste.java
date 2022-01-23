
package metodo.set_get;

import java.util.Scanner;

public class GradeBookTeste {
    public static void main(String[] args) {
        //obejeto da classe
        Scanner input = new Scanner(System.in);
        GradeBook myGradeBook =  new GradeBook();
        
        System.out.println("Initial  course name "+myGradeBook.getCourseName());
        
        System.out.println("Please enter the name course name: ");
        String thename  = input.nextLine();
        myGradeBook.setCourseName(thename);
        System.out.println("-------------");
        myGradeBook.displayMessage();
    }
}
