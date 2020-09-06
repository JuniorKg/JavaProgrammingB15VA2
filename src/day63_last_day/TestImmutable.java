package day63_last_day;

public class TestImmutable {
    public static void main(String[] args) {
        //new object of Immutable class
        ImmutableClass imObj = new ImmutableClass("java");
        System.out.println(imObj.toString());
        System.out.println(imObj.getComment());
        //imObj.setComment("hello java");

        String str = "java";

        imObj = new ImmutableClass("Hello java"); //new object

        MutableClass mtb = new MutableClass("BYE BYE MURADIL");
        mtb.setComment("Hello Java ");
        System.out.println(mtb.getComment());
        mtb.append("Code java!").append(" Talk Java").append(" Bye Java");
        System.out.println(mtb.getComment());

    }
}
