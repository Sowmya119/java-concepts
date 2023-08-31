class Strings
{
    public static void main(String args[])
    {
        String word = new String("Java Programming");
        word = "Learning " + word;
        String s1 = "java";
        String s2 = "java";

        System.out.println(word);
        System.out.println(s1 == s2);

// String is a class

// Value cannot be changed.
    // If altered a new object is created in the heap memory and the new address is mapped to the variable in the stack memory.
    // The old object becomes eligible for garbage collection

// If same value is assigned to two variables only one object is created in the heap memory. ----> String Constant Pool
    //The same address is mapped to both the variables (references) in the stack memory.

// Mutable and Immutable Strings
    // Mutable Strings ---> StringBuffer and StringBuilder

        StringBuilder name = new StringBuilder("Programming");

        System.out.println(name.capacity());
        System.out.println(name.length());
        System.out.println(name.append(" Java"));

        String str = name.toString();
        System.out.println(str);

    }
}