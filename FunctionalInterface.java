// functional interface is an interface with exactly one method
    // also called as SAM (Single Abstract Method)
    // lambda expressions are used only for functional interfaces
    // lambda expressions greatly reduce the code while creating interface objects using anonymous inner classes

interface A
{
    void show();
}

interface B
{
    void show(int i, double j);
}

interface C
{
    void show(int i);
}

interface D
{
    int cube(int i);
}

public class FunctionalInterface
{
    public static void main(String args[])
    {
        A obj1 = () -> System.out.println("in A show");
        obj1.show();

        B obj2 = (i, j) -> System.out.println(i+j);
        obj2.show(2, 3);

        C obj3 = i -> System.out.println(i*i);
        obj3.show(5);

        D obj4 = i -> i*i*i;    // 'return' is skipped as it is a single statement
        System.out.println(obj4.cube(5));

        D obj5 = i ->
        {
            int j = 5;
            return (i*i*i) - j;
        };
        System.out.println(obj5.cube(5));
    }
}

// Lambda expression:

// part to be removed:
    // start -- new A() {public void show
    // end -- };

// after the round brackets, the symbol -> has to be added to denote a lambda expression
// in case of a single statement, the other set of curly braces can also be removed

// not required to mention the data type while passing the parameters
// in case of only one parameter, the round brackets can also be skipped

// the word 'return' is also not required in case of a single statement