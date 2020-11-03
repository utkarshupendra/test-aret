import syntax.AreteansTest;

public class TestHW {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SDE sde = new SDE("Utkarsh", 26, 10000.0f);
        System.out.println(sde);
        sde.promote(10);
        System.out.println(sde);
        sde.evict();
        System.out.println(sde);
        AreteansTest test = new AreteansTest();
        test.printDummy();
        test.printSequence(3);
        System.out.println(test.findLargerNum(123,321));
    }
}
