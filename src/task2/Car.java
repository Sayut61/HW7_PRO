package task2;

import java.io.Serializable;

public class Car implements Serializable {
    public String mark;
    public int age;
    public double speed;

    public Car(String mark, int age, double speed) {
        this.mark = mark;
        this.age = age;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "car{" +
                "mark='" + mark + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                '}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
