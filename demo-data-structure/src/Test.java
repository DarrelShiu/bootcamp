package src;


public class Test extends TestAbtract {

    @Override
    public int sum() {
        return 3;
    }
    public static void main(String[] args) {
        
        TestAbtract abc = new TestAbtract();
        System.out.println(abc.sum());
        Test def = new Test();
        System.out.println(def.sum());
        
    }
        
}
