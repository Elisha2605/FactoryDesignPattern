package com.Alvin;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        Boolean run = false;
        while (run.equals(false)) {

            System.out.println("What type of ship? (U / R / B)");

            if (userInput.hasNextLine()) {
                String typeOfship = userInput.nextLine();
                theEnemy = enemyShipFactory.makeEnemyShip(typeOfship);
            }

            if (theEnemy != null) {
                doStuffEnemy(theEnemy);
            } else {
                System.out.println("Enter a U, R, or B next time");
            }

        }

       /* EnemyShip theEnemy = null;

        EnemyShip ufoShip = new UFOEnemyShip();

        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = "";

        System.out.println("What type of ship? (U / R)");

        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        if(enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();

        }else if(enemyShipOption.equals("R")){
            theEnemy = new RocketEnemyShip();
        }
*/
        //doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
