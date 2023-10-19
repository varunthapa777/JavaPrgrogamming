package LangPkg;

enum Course{

        BCA("Varun","Block A"),BCOM("Anjali","Block B"),BBA("Harshita","Pharmacy Block"),BTECH("Saurav","Admin Block");

        String student;
        String building;
        private Course(String student, String building){

            this.student = student;
            this.building = building;
        }

        public void display(){

            System.out.println("Student : "+student);
            System.out.println("Class in : "+ building);
        }
}

public class EnumDemo {
    
    public static void main(String[] args) {
        
        Course c = Course.BCA;

        c.display();
        

    }
}
