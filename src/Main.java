public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<String>(2);
        magicBox.add("Первый");
        magicBox.add("Второй");
        System.out.println(magicBox.pick());
    }
}
