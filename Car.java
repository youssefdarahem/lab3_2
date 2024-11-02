public class Car extends Vehicle {
    public void display() {
        System.out.println("this is a car");
    }

    public void run(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("The Car is running!");
        }
    }

}
