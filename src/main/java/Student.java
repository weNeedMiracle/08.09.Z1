public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    public void getScholarship(){
        if(averageMark == 5.0)
            System.out.println("Сумма степндии 10.000 руб.");
        else
            System.out.println("Сумма степндии 8.000 руб.");
    }
}