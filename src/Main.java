public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<Integer>(2);
        magicBox.add(2);
        magicBox.add(3);
        System.out.println(magicBox.pick());
    }
}
