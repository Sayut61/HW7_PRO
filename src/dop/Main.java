package dop;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/dop/Car.txt");
        Car car = new Car("KIA", 5, 200.5);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(car);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
