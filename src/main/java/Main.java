public class Main {
    public static void main(String[] args) {
        Student StudSil = new Aspirant();
        StudSil.firstName = "Игорь";
        StudSil.lastName = "Кошкин";
        StudSil.averageMark = 5.0;
        StudSil.group = "RBO-552";
        Student s1 = new Student();
        s1.firstName = "Кирилл";
        s1.lastName = "Махров";
        s1.averageMark = 4.32;
        s1.group = "RKT 222";
        Aspirant a1 = new Aspirant();
        a1.firstName = "Сергей";
        a1.lastName = "Головушкин";
        a1.averageMark = 5.0;
        a1.group = "SCH 123";
        a1.nameSW = "PRSW";
        Student[] mas = {s1, a1};
        for(int i = 0; i<mas.length; i++){
            mas[i].getScholarship();
        }
    }
}
