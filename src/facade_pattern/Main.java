package facade_pattern;

public class Main {
    public static void main(String[] args) {
        HardSystem hardSystem = new HardSystem();
        HardSystemFasade hardSystemFasade = new HardSystemFasade();
        hardSystemFasade.fasadeMethod1(hardSystem);
    }
}