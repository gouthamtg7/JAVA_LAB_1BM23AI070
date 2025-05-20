package lab_02;

class BoxingNUnboxing {

    public static void main(String[] args) {
        //Box Box
        Integer boxedInt = Integer.valueOf(7);

        Double boxedDouble = Double.valueOf(7.0);

        Float boxedFloat = Float.valueOf(7.0f);

        Boolean boxedBoolean = Boolean.valueOf(true);

        Character boxedChar = Character.valueOf('a');

        //Unboxing

        Integer unboxedInt = boxedInt.intValue();

        Double unboxedDouble = boxedDouble.doubleValue();

        Float unboxedFloat = boxedFloat.floatValue();

        Boolean unboxedBoolean = boxedBoolean.booleanValue();

        Character unboxedChar = boxedChar.charValue();

        //Display

        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Boxed Boolean: " + boxedBoolean);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Unboxed Float: " + unboxedFloat);
    }



}
