package hw7;

import java.io.*;

public class Q4 {
    public static void main(String[] args) throws Exception {
        // Specify the directory path
        File dir = new File("./src/hw7/data");

        // Check if the directory exists, create it if not
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Directory created: data");
        }

        File file = new File("./src/hw7/data/Object.ser");

        Animal[] animals = {
                new Dog("Dog1"),
                new Dog("Dog2"),
                new Cat("Cat1"),
                new Cat("Cat2")
        };

        // 輸出
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0; i < animals.length; i++)
            oos.writeObject(animals[i]);
        System.out.println("資料輸出完畢");
        oos.close();
        fos.close();
    }
}

abstract class Animal {
    private String name;

    abstract public void speak();
}

class Dog extends Animal implements Serializable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("This is Dog " + name + " speaking.");
    }
}

class Cat extends Animal implements Serializable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("This is Cat " + name + " speaking!");
    }

}