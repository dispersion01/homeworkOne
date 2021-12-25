package ru.spypro.homework;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
