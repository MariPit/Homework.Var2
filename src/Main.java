public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int i = 1085429766;
        byte b = 93;
        short s = -27953;
        long l = 854428782L;
        float f = -953.5f;
        double d = 387.7;

        System.out.println("Значение переменной i с типом int равно " + i );
        System.out.println("Значение переменной b с типом byte равно " + b );
        System.out.println("Значение переменной s с типом short равно " + s );
        System.out.println("Значение переменной l с типом long равно " + l );
        System.out.println("Значение переменной f с типом float равно " + f );
        System.out.println("Значение переменной d с типом double равно " + d );

        System.out.println("Задача 2");//Задача 2
        float boat = 27.12f;
        long way = 987678965549L;
        double whiskey = 2.786;
        boolean isMore = whiskey > 5;
        char symbol = 569;
        short height = -159;
        int dog = 27897;
        byte cat = 67;
        System.out.println(symbol); //проверка значения
        System.out.println(isMore); //проверка значения

        System.out.println("Задача 3");
        byte studentsL = 23; //у Людмилы Павловны 23 ученика
        byte studentsE = 27; //у Анны Сергеевны 27 учеников
        byte studentsA = 30; //у Екатерины Андреевны 30 учеников
        int allStudents = studentsL+studentsE+studentsA;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/allStudents + " листов бумаги");

    }
}