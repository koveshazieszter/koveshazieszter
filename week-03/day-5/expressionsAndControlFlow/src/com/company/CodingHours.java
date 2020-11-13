package com.company;

public class CodingHours {
    public static void main(String[] args)
    {
        int learningHoursPerDays = 6;
        int weeksOfSemester = 17;
        int codingDaysPerWeek = 5;
        int semesterCodingForTheStudent = (weeksOfSemester * codingDaysPerWeek)*learningHoursPerDays;

        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol

        System.out.println(semesterCodingForTheStudent);
        System.out.println();
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra

        int averageWeeklyWorkingTime=52;
        int  percentageOfTheSemesterTheStudentSpendsCoding = (int) (semesterCodingForTheStudent/(averageWeeklyWorkingTime*(weeksOfSemester*0.01)));
        System.out.println(percentageOfTheSemesterTheStudentSpendsCoding + "%");







    }
}
