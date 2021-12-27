package ru.spypro.homework;

public class Main {

    public static void main(String[] args) {
	// write your code here
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();

    }
    public static void exerciseOne(){
        byte numberOne = 3;
        short numberTwo = -3;
        int numberThree = 5;
        long numberFour = 96L;
        float numberFive = 3.14f;
        double numberSix = -52;
        char numberSeven = 4;
        boolean numberEight = true;
    }
    public static void exerciseTwo(){

            float boxerFirstWeigh = 78.2f;
            float boxerSecondWeigh = 82.7f;

            float totalWeightBoxer = boxerFirstWeigh + boxerSecondWeigh;
            System.out.println("Общий вес двух бойцов: " + totalWeightBoxer);

            var differentWeight = boxerSecondWeigh - boxerFirstWeigh;
            System.out.println("Разница между весами бойцов: " + differentWeight);



    }
    public static void exerciseThree(){
        int grInKg = 1000;

        int amountBanana = 80;
        var weightBananas = amountBanana *5;

        int milkWeightPer100Ml = 105;
        float weightMilk =(200f/100f)*milkWeightPer100Ml;

        int amountIceCream = 100;
        int iceCreamWeight = amountIceCream *2;

        int amountEgg = 70;
        int weightEgg = amountEgg *4;

        float recipe = weightBananas + weightMilk + weightEgg + iceCreamWeight;
        System.out.println("Вес коктейля в кг: " + recipe/grInKg);
        System.out.println("Вес коктейля в гр: " + (recipe));
    }
    public static void exerciseFour(){
        /*int goalWeight = 7;
        double weightGoalOne = 250*0.001;
        double weightGoalOTwo = 500*0.001;


        int goalOne = (int) (goalWeight/weightGoalOne);

        System.out.println("Количество дней, если худеть по 250гр: " + goalOne);


       int goalTwo = (int) (goalWeight/weightGoalOTwo);
        System.out.println("Количество дней, если худеть по 500гр: " +goalTwo);

        int averageDay = (goalOne + goalTwo) /2;
        System.out.println("Среднее количество дней нужное, чтобы похудеть на 7кг: " + averageDay);*/
        int goalWeight = 7;
        int grInKg = 1000;
        int goalWeightInGr = goalWeight * grInKg;
        int weightGoalOne = 250;
        int weightGoalOTwo = 500;


        int goalOne =  ( goalWeightInGr/weightGoalOne);

        System.out.println("Количество дней, если худеть по 250гр: " + goalOne);


        int goalTwo =  ( goalWeightInGr/weightGoalOTwo);
        System.out.println("Количество дней, если худеть по 500гр: " +goalTwo);

        int averageDay = (goalOne + goalTwo) /2;
        System.out.println("Среднее количество дней нужное, чтобы похудеть на 7кг: " + averageDay);

    }
    public static void exerciseFive(){
        int mishaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int percent = 10;
        float salaryPercent = percent / 100f;

        var bonusMisha = mishaSalary * salaryPercent;
        var salaryNewMisha = bonusMisha + mishaSalary;
        var salaryYearOldMisha = mishaSalary *12;
        var salaryYearNewMisha = salaryNewMisha * 12;
        int salaryYearMisha = (int) (salaryYearNewMisha - salaryYearOldMisha);

        var bonusDenis = denisSalary * salaryPercent;
        var salaryNewDenis = bonusDenis + denisSalary;
        var salaryYearOldDenis = denisSalary *12;
        var salaryYearNewDenis = salaryNewDenis * 12;
        int salaryYearDenis = (int) (salaryYearNewDenis - salaryYearOldDenis);

        var bonusKristina = kristinaSalary * salaryPercent;
        var salaryNewKristina = bonusKristina + kristinaSalary;
        var salaryYearOldKristina = kristinaSalary *12;
        var salaryYearNewKristina = salaryNewKristina * 12;
        int salaryYearKristina = (int) (salaryYearNewKristina - salaryYearOldKristina);

        System.out.println("Миша теперь получает " + salaryNewMisha + " рублей." + "Годовой доход вырос на " + salaryYearMisha + " рублей." );
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей" + "Годовой доход вырос на " + salaryYearDenis + " рублей." );
        System.out.println("Кристина теперь получает " + salaryNewKristina + " рублей" + "Годовой доход вырос на " + salaryYearKristina + " рублей." );


    }

}
