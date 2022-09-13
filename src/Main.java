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
        boolean isMore = false;
        char symbol = 569;
        short height = -159;
        int dog = 27897;
        byte cat = 67;

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

        System.out.println("Задача 6");
        short bananas = 5; //Бананы – 5 штук (1 банан - 80 грамм)
        int bananaWeight = bananas*80;
        short milk = 200; //Молоко – 200 мл (100 мл = 105 грамм)
        int milkWeight = milk/100*105;
        short iceCrem = 2; //Мороженое пломбир – 2 брикета по 100 грамм
        int iceCremWeight = iceCrem*100;
        short eggs = 4; //Яйца сырые – 4 яйца (1 яйцо - 70 грамм)
        int eggsWeight = eggs*70;
        int totalWeightGr = bananaWeight+milkWeight+iceCremWeight+eggsWeight;
        System.out.println("Общий вес продуктов " + totalWeightGr + " грамм");
        double totalWeightKg = totalWeightGr/1000.0;
        System.out.println("Общий вес продуктов " + totalWeightKg + " кг");

        System.out.println("Задача 7");
        double excessWeight = 7.0;
        double progress1 = 0.250;
        double progress2 = 0.5;
        double day1 = excessWeight/progress1;
        double day2 = excessWeight/progress2;
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day2%day1);

        System.out.println("Задача 8");
        float increase = 1.1f;
        byte year = 12;

        int salaryMasha = 67760;
        int salaryMashaInYear = salaryMasha*year;
        double newSalaryMasha = salaryMasha*increase;
        double newSalaryMashaInYear = newSalaryMasha*year;
        double salaryMashaDifference = newSalaryMashaInYear-salaryMashaInYear;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryMashaDifference + " рублей");

        int salaryDen = 83690;
        int salaryDenInYear = salaryDen*year;
        double newSalaryDen = salaryDen*increase;
        double newSalaryDenInYear = newSalaryDen*year;
        double salaryDenDifference = newSalaryDenInYear-salaryDenInYear;
        System.out.println("Денис теперь получает " + newSalaryDen + " рублей. Годовой доход вырос на " + salaryDenDifference + " рублей");

        int salaryKris = 76230;
        int salaryKrisInYear = salaryKris*year;
        double newSalaryKris = salaryKris*increase;
        double newSalaryKrisInYear = newSalaryKris*year;
        double salaryKrisDifference = newSalaryKrisInYear-salaryKrisInYear;
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + salaryKrisDifference + " рублей");

    }
}