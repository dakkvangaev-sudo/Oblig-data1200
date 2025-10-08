public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(1, false);

        // Opprett to Robot-objekter
        // med navn, f.eks. Dancatron 4000 og Spark-E

        Robot robot1 = new Robot("Dancatron", 80, 1000, "Type B");
        System.out.println(robot1.reportStatus());
        robot1.canWalkToThePark(todaysWorld);
        robot1.canDanceAtClub(todaysWorld);

        Robot robot2 = new Robot("SparkE", 10, 800, "typeA");
        System.out.println(robot2.reportStatus());
        robot2.canWalkToThePark(todaysWorld);
        robot2.canDanceAtClub(todaysWorld);

        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene

        // Sjekk om robotene kan gå til danseklubben
        // Sjekk om robotene kan gå til parken
    }
}



