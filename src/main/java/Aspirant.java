public class Aspirant extends Student{
    String nameSW;

    @Override
    public void getScholarship() {
        if(averageMark == 5.0)
            System.out.println("Сумма степндии 20.000 руб.");
        else
            System.out.println("Сумма степндии 18.000 руб.");
    }
}