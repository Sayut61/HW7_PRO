package task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/task2/Car2.txt");
        Car car = new Car("KIA", 5, 200.5);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            oos.writeObject(car);
            Car car1 = (Car) ois.readObject();
            System.out.println(car1);
            System.out.println(car == car1);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
