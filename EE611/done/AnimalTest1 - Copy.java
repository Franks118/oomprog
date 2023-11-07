import java.util.*;
public class AnimalTest1{
    public static void main(String[] args) {
        Animal elephant = new Animal(65, 13000, 'm', "Jumbo", "elephant");
         Animal elephant2 = new Animal(56, 14000, 'f', "Grumbo", "elephant");
          Animal elephant3 = new Animal(67, 16000, 'n', "Grombu", "elephant");
           Animal elephant4 = new Animal(68, 15000, 's', "Himbo", "elephant");
        elephant.printValues();
        System.out.println("-------------------------");
        elephant2.printValues();
        System.out.println("-------------------------");
        elephant3.printValues();
        System.out.println("-------------------------");
        elephant4.printValues();
          System.out.println("-------------------------");
        Pet dog = new Pet(11, 20, 's', "Fifi", "dog", "indoors", false);
        Pet dog2 = new Pet(12, 23, 'm', "kaki", "dog", "indoors", true);
         Pet dog3 = new Pet(13, 26, 'f', "hapi", "dog", "outdoors", false);
          Pet dog4 = new Pet(17, 27, 'n', "brownie", "dog", "indoors", true);
        dog.printValues();
        System.out.println("-------------------------");
        dog2.printValues();
        System.out.println("-------------------------");
        dog3.printValues();
        System.out.println("-------------------------");
        dog4.printValues();
        
    }
}


class Animal {
    private int lifeExpectancy;
    private int weight;
    private char gender;
    private String name;
    public String type;

    public Animal(int lifeExpectancy, int weight, char gender, String name, String type) {
        this.lifeExpectancy = lifeExpectancy;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
        this.type = type;
    }

    public void printValues() {
        System.out.print("A ");
        printGender();
        System.out.println(" " + type + " named " + name +
                " should live to be " + lifeExpectancy + " years and weigh " + weight + " pounds.");
    }

    private void printGender() {
        switch (gender) {
            case 'm':
                System.out.print("male");
                break;
            case 'f':
                System.out.print("female");
                break;
            case 'n':
                System.out.print("neutered male");
                break;
            case 's':
                System.out.print("spayed female");
                break;
            default:
                System.out.print("unknown gender");
                break;
        }
    }
}

class Pet extends Animal {
    private String home;
    private boolean bites;

    public Pet(int lifeExpectancy, int weight, char gender, String name, String type, String home, boolean bites) {
        super(lifeExpectancy, weight, gender, name, type);
        this.home = home;
        this.bites = bites;
    }

    public void printValues() {
        super.printValues();
        System.out.print("Your " + type + " lives " + home + " and ");
        printBites();
        System.out.println(".");
 
    }

    private void printBites() {
        if (bites) {
       
            System.out.print("bites");
        } else {
         
            System.out.print("does not bite");
        }
    }
}

