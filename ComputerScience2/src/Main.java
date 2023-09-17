public class Main {
    public static void main(String[] args) {
        animal human = new human();
        animal horse = new horse();
        animal fish = new fish();
        animal ant = new ant();
        animal ladyBug = new ladyBug();
        System.out.println("a human has " + human.getLegs() + " legs");
        System.out.println("a horse has " + horse.getLegs() + " legs");
        System.out.println("a fish has " + fish.getLegs() + " legs");
        System.out.println("an ant has " + ant.getLegs() + " legs");
        System.out.println("a ladybug has " + ladyBug.getLegs() + " legs");

    }
}