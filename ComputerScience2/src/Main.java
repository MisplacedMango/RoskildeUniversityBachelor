public class Main {
    public static void main(String[] args) {
        animal h = new human();
        animal ho = new horse();
        animal f = new fish();
        Insect a = new ant();
        System.out.println(h.getLegs());
        System.out.println(ho.getLegs());
        System.out.println(f.getLegs());
        System.out.println(a.getLegs());

    }
}