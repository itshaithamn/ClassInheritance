
public class Inheritance{
    public static void main(String[] args) {
        Animals.Zebra myZebra = new Animals().new Zebra();
        myZebra.isZebra();
        Animals.Zebra.run();
        System.out.println("====================");
        Animals.Fish myFish = new Animals().new Fish();
        Animals.Fish.canEat();
        myFish.isFish();
        
        
    }
}

class Animals{
    public int age; 
    public String gender;
    
    static void mate(){
        System.out.println("I need a male and female to mate");
    }

    static void mammal(){
        System.out.println("I am a mamal.");
    }
    class Fish{
        static int sizeInFeet = 2;
        static void canEat(){
            System.out.println("I can eat anything that is less than: " + sizeInFeet + "feet");
            mate();
        }
        public void isFish(){
            System.out.println("I can not run.");
            System.out.println("I am not a mammal.");
            System.out.println("I am a fish.");
        }
    }
    
    class Zebra{
        boolean iswild = true;
        
        static void run(){
            System.out.println("I can run very fast.");
        }

        public int isZebra(){
            mammal();
            mate();
            System.out.println("The fact that I am a wild zebra is: " + iswild + ".");
            return 0;
        }

        
    }
}

