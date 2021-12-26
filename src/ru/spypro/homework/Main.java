package ru.spypro.homework;

public class Main {

    public static void main(String[] args) {
	// write your code here


    }
    public static void exerciseOne(){
        byte numberOne = 3;
        short numberTwo = -3;
        int numberThree = 5;
        long numberFour = 96;
        float numberFive = 3.14f;
        double numberSix = -52;
        char numberSeven = 4;
        boolean numberEight = true;
    }
    public static void exerciseTwo(){
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;

        float weightBoxer = boxerOne + boxerTwo;
        System.out.println(weightBoxer);

        var differentWeight = boxerTwo - boxerOne;
        System.out.println(differentWeight);

    }
    public static void exerciseThree(){
        int amountBanana = 80;
        var weightBananas = amountBanana *5;

        int amountMilk = 105;
        float weightMilk =(200f/100f)*amountMilk;

        int amountIceCream = 100;
        var iceCreamWeight = amountIceCream *2;

        int amountEgg = 70;
        var weightEgg = amountEgg *4;

        var recipe = weightBananas + weightMilk + weightEgg + iceCreamWeight;
        System.out.println(recipe/1000);
    }
    public static void exerciseFour(){
        int goalWeight = 7*1000;
        int weightGoalOne = 250;
        int weightGoalOTwo = 500;

        /*float goalOne = (float) (weightGoalOne/goalWeight);*/
        var goalOne =  (goalWeight/weightGoalOne);

        System.out.println("Количество дней, если худеть по 250гр: " + goalOne);

        /*float goalTwo = (float)(weightGoalOTwo/goalWeight) ;*/
        var goalTwo = (goalWeight/weightGoalOTwo) ;
        System.out.println("Количество дней, если худеть по 500гр: " +goalTwo);

        var averageDay = (goalOne + goalTwo) /2;
        System.out.println("Среднее количество дней нужное, чтобы похудеть на 7кг: " + averageDay);

    }
    public static void exerciseFive(){
        int misha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;

        var bonusMisha = (misha * 10)/100;
        var salaryNewMisha = bonusMisha + misha;
        var salaryYearOldMisha = misha *12;
        var salaryYearNewMisha = salaryNewMisha * 12;
        var salaryYearMisha = salaryYearNewMisha - salaryYearOldMisha;

        var bonusDenis = (denis * 10)/100;
        var salaryNewDenis = bonusDenis + denis;
        var salaryYearOldDenis = denis *12;
        var salaryYearNewDenis = salaryNewDenis * 12;
        var salaryYearDenis = salaryYearNewDenis - salaryYearOldDenis;

        var bonusKristina = ((kristina * 10)/100);
        var salaryNewKristina = bonusKristina + kristina;
        var salaryYearOldKristina = kristina *12;
        var salaryYearNewKristina = salaryNewKristina * 12;
        var salaryYearKristina = salaryYearNewKristina - salaryYearOldKristina;

        System.out.println("Миша теперь получает " + salaryNewMisha + " рублей." + "Годовой доход вырос на " + salaryYearMisha + " рублей." );
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей" + "Годовой доход вырос на " + salaryYearDenis + " рублей." );
        System.out.println("Кристина теперь получает " + salaryNewKristina + " рублей" + "Годовой доход вырос на " + salaryYearKristina + " рублей." );


    }

}
