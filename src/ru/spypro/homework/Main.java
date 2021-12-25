package ru.spypro.homework;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
}
