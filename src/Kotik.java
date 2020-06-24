

public class Kotik {

    private static int satiety = 3;

    public static int getSatiety() {
        return satiety;
    }

    public static void setSatiety(int satiety) {
        Kotik.satiety = satiety;
    }

    private static void play() {
        if(satiety > 0) {
            System.out.println("Котик поиграл");
            satiety--;
        } else {
            System.out.println("Котик не хочет играть, он хочет есть");
            eat(3);
        }
    }

    private static void sleep() {
        if(satiety > 0) {
            System.out.println("Котик поспал");
            satiety--;
        } else {
            System.out.println("Котик не хочет спать, он хочет есть");
            eat(3);
        }
    }

    private static void playMouse() {
        if(satiety > 0) {
            System.out.println("Котик поиграл с мышкой");
            satiety--;
        } else {
            System.out.println("Котик не хочет играть с мышкой, он хочет есть");
            eat(4);
        }
    }

    private static void jump() {
        if(satiety > 0) {
            System.out.println("Котик попрыгал");
            satiety--;
        } else {
            System.out.println("Котик не хочет прыгать, он хочет есть");
            eat(2);
        }
    }

    private static void run() {
        if(satiety > 0) {
            System.out.println("Котик побегал");
            satiety--;
        } else {
            System.out.println("Котик не хочет бегать, он хочет есть");
            eat(3);
        }
    }

    private static void toilet() {
        if(satiety > 0) {
            System.out.println("Котик сходил в туалет");
            satiety--;
        } else {
            System.out.println("Котик не хочет в туалет, он хочет есть");
            eat();
        }
    }

    private static void eat(int satiety) {
        System.out.println("Котик поел");
        Kotik.satiety =+satiety;
    }
    private static void eat(int satiety, String nameFood) {
        System.out.println("Котик поел " + nameFood);
        Kotik.satiety =+satiety;
    }
    private static void eat() {
        eat(3, "Рыбку");


    }

    private static void liveAnotherDay() throws InterruptedException {
        for (int i = 0; i < 24; i++) {
            Thread.sleep(500);
            int action = (int)(Math.random() * 6) + 1;
            switch(action) {
                case(1):
                    play();
                    break;
                case(2):
                    sleep();
                    break;
                case(3):
                    playMouse();
                    break;
                case(4):
                    jump();
                    break;
                case(5):
                    run();
                    break;
                case(6):
                    toilet();
                    break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        liveAnotherDay();
    }

}
