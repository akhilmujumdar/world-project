import java.util.Scanner;

public class People implements iGetReceive{

    private String animalType;
    private String animalName;
    private int age;
    private double weight;

    @Override
    public void getAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.println("What other humans live in your world");
        animalType = input.next();
    }

    @Override
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the " + returnAnimal() + " name?");
        animalName = input.next();
    }

    @Override
    public void getAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("How old is " + returnName() + "?");
        age = input.nextInt();
    }

    @Override
    public void getWeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much does " + returnName() + " weigh?");
        weight = input.nextInt();
    }

    @Override
    public String returnAnimal() {
        return animalType;
    }

    @Override
    public String returnName() {
        return animalName;
    }

    @Override
    public int returnAge() {
        return age;
    }

    @Override
    public double returnWeight() {
        return weight;
    }
}
