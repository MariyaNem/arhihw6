package facade_pattern;

public class HardSystemFasade implements IHardSystemFasade{
    @Override
    public void fasadeMethod1(HardSystem hardSystem) {
        hardSystem.method1();
        hardSystem.method23();
    }

    @Override
    public void fasadeMethod2(HardSystem hardSystem) {
        hardSystem.method2();
    }
}