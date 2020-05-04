public class Main {
    public static final int DISTANCE=150;
    public static final int step=2;


    public static void main(String[] args) {
        Car car1=new Car("honda");
        Car car2=new Car("vinfast");
        Car car3=new Car("mescedes");

        Thread thread1=new Thread(car1);
        Thread thread2=new Thread(car2);
        Thread thread3=new Thread(car3);
        System.out.println("distance 150km");

        thread1.start();


    }
}
