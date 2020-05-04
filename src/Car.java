

import java.util.Random;

public class Car implements Runnable {
    private String name;


    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;

        long startTime = System.currentTimeMillis();

        while (runDistance < Main.DISTANCE) {
            try {

                //get random speed
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                //create graphic

                String graphic = "|";
                int percentTravel = (runDistance * 100) / Main.DISTANCE;

                for (int i = 0; i < Main.DISTANCE; i += Main.step) {
                    if (percentTravel > i + Main.step) {
                        graphic += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.step) {
                        graphic += "o";
                    } else graphic += "-";
                }
                graphic += "|";
                System.out.println("car " + this.name + " : " + graphic + " " + Math.min(Main.DISTANCE, runDistance) + " Km ");
                System.out.println("-----------");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("car " + this.name + " broken");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " finish in " + (endTime - startTime) / 1000 + " s");
        System.out.println("-------------------");
    }
}
