
package metodo.set_get;

public class GradeBook {
   private String courseName;
   
   public void setCourseName(String name){
       courseName = name;
   }
    //metodo para recuperar o nome do curso
    public String getCourseName() {
        return courseName;
    }
   public void displayMessage(){
       System.out.println("Bem vindo ao GrandeBook for "+getCourseName());
   }
   
}
