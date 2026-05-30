package MODULE7;


public class TypeCastingExample {
    public static void main(String[] args) {

        // Double to Int (Narrowing Casting)
        double d = 25.89;
        int i = (int) d;

        System.out.println("Original Double Value: " + d);
        System.out.println("After Casting to Int: " + i);

        // Int to Double (Widening Casting)
        int num = 50;
        double d2 = (double) num;

        System.out.println("Original Int Value: " + num);
        System.out.println("After Casting to Double: " + d2);
    }
}