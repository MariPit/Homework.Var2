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

        System.out.println("Задача 2");
        float boat = 27.12f;
        long way = 987678965549L;
        double whiskey = 2.786;
        boolean isMore = whiskey >= 5.3;
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

        System.out.println("Задача 4");
        int bottleIn2Min = 16; //Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты
        int bottleIn1Min = bottleIn2Min/2;
        System.out.println("За 20 минут машина произвела бутылок " + bottleIn1Min*20 + " штук");
        int hourInDay = 24;
        int minInHour = 60;
        int minInDay = hourInDay*minInHour;
        System.out.println("За сутки машина произвела бутылок " + bottleIn1Min*minInDay + " штук");
        int minIn3Day = minInDay*3;
        System.out.println("За 3 дня машина произвела бутылок " + bottleIn1Min*minIn3Day + " штук");
        int minInMonth = minInDay*30; // месяц=30 дней
        System.out.println("За месяц машина произвела бутылок " + bottleIn1Min*minInMonth + " штук");

        System.out.println("Задача 5");
        int cansOfPaint = 120;
        int forOneClassWhite = 2;
        int forOneClassBroun = 4;
        int classesAtSchool = cansOfPaint/(forOneClassWhite+forOneClassBroun);
        int white = classesAtSchool*forOneClassWhite;
        int brown = classesAtSchool*forOneClassBroun;
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

    }
}