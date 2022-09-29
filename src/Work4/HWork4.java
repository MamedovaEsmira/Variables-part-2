package Work4;

public class HWork4 {
    public static void main(String[] args) {
    //Задача1
    System.out.println("Задача1");
    int plumsCount=3;
    System.out.println("Значение переменной plumsCount с типом int равно "+plumsCount);
    byte dogsCount=6;
    System.out.println("Значение переменной dogsCount с типом byte равно "+dogsCount);
    short geeseCount=7;
    System.out.println("Значение переменной geeseCount с типом short равно "+geeseCount);
    long fishCount= 89000766600L;
    System.out.println("Значение переменной fishCount с типом long равно "+fishCount);
    float pi=3.14f;
    System.out.println("Значение переменной pi с типом float равно "+pi);
    double e=2.8;
    System.out.println("Значение переменной e с типом doubl равно "+e);
     //Задача2
        System.out.println("Задача2");
        float variable1=27.12f;
        long variable2=987_678_965_549L;
        double variable3=2.786;
        boolean variable4=false;
        short variable5=569;
        int variable6=-159;
        char variable7=27897;
        byte variable8=67;
        //Задача3
        int pupilsInFirstClass=23;
        int pupilsInSecondClass=27;
        int pupilsInThirdClass=30;
        int papersCount=480;
        int PapersPerPuls=papersCount/(pupilsInFirstClass+pupilsInSecondClass+pupilsInThirdClass);
        System.out.println( "На каждого ученика рассчитано"  +PapersPerPuls+"  листов бумаги");
        //Задача4
        int bottles=16;
        int minutes =2;
        int ProduktivityPerMinute=bottles/minutes;
        int TwentyMinutes=20;
        System.out.println("За"+TwentyMinutes +" минут машина произвела бутылок" +ProduktivityPerMinute*TwentyMinutes + "штук ");
        int minutesInDay=24*60;
        System.out.println("За"+minutesInDay +"минут машина произвела бутылок" +ProduktivityPerMinute*minutesInDay + "штук ");
        int minutesInThreeDay=3*minutesInDay;
        System.out.println("За"+minutesInThreeDay +" минут машина произвела бутылок" +ProduktivityPerMinute*minutesInThreeDay + "штук ");
        int minutesInMonth=30*minutesInDay;
        System.out.println("За"+minutesInMonth +" минут машина произвела бутылок" +ProduktivityPerMinute*minutesInMonth + "штук ");
        //Задача5
        System.out.println("Задача5");
        int TotalNumberOfCans=120;
        byte whitePaint=2;
        byte BrownPaint=4;
        int NumberOfCansPerClass=TotalNumberOfCans/(whitePaint+BrownPaint);
        int TotalWhitePaint=whitePaint*NumberOfCansPerClass;
        int TotalBrownPaint= BrownPaint* NumberOfCansPerClass;
        System.out.println("В школе, где "+NumberOfCansPerClass+" классов, нужно "+TotalWhitePaint + " банок белой краски и"+TotalBrownPaint + " банок коричневой краски");
        //Задача6
        System.out.println("Задача6");
        byte bananes=5;
        int bananaWeight=bananes*80;
        double milk=200;
        double milkWeght=milk/105F;
        int IceCream=2*100;
        int eggs=4;
        int eggsWeght=eggs*70;
        double TotalWeght=bananaWeight+milkWeght+IceCream+eggsWeght;
        double TotalWeghtKg=TotalWeght/1000;
        System.out.println( "Общий вес продуктов составляет"+TotalWeghtKg+" кг");
        //Задача7
        System.out.println("Задача7");
        int LoseWeightKg=7;
        int LoseWeightGr=7*1000;
        int LoseWeightDayFirst=250;
        int  LoseWeightDaySecond =500;
        double FirstWay=LoseWeightGr/250;
        double SecondDay=LoseWeightGr/500;
        System.out.println(""+FirstWay+" дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
;       System.out.println(""+SecondDay+" дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
         //Задача8
         int MashaCurrentSalary=67760;
         int DenisCurrentSalary=83690;
         int KristinaCurrentSalary=76230;
         double MashaIncreasedSalary=MashaCurrentSalary*1.1;
         double DenisIncreasedSalary=DenisCurrentSalary*1.1F;
         double KristinaIncreasedSalary=KristinaCurrentSalary*1.1;
         double MahsaAnnualSalary=(MashaIncreasedSalary-MashaCurrentSalary)*12;
         double DenisAnnualSalary=(DenisIncreasedSalary-DenisCurrentSalary)*12;
         double KristinaAnnualSalary=(KristinaIncreasedSalary-KristinaCurrentSalary)*12;
         System.out.println( "Маша теперь получает" +MashaIncreasedSalary+" рублей. Годовой доход вырос на"+MahsaAnnualSalary+" рублей");
         System.out.printf( "Денис теперь получает" +DenisIncreasedSalary+" рублей. Годовой доход вырос на"+DenisAnnualSalary+" рублей");
         System.out.println( "Кристина теперь получает" +KristinaIncreasedSalary+" рублей. Годовой доход вырос на"+KristinaAnnualSalary+" рублей");

    }
}