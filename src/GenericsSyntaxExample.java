/**
 * This file is included to try to help demonstrate some of the generics syntax. I know we only covered that Monday
 * so I'm hoping this will help you process it. In-and-of-itself this file does nothing, it simply serves to demonstrate
 * the syntax.
 *
 * @param <TypeVariable> -- this is a bad name for the type variable, most people just use T or Elem, or things like that.
 */
public class GenericsSyntaxExample<TypeVariable> {
    private TypeVariable singleVariable;
    private TypeVariable[] arrayVariable;

    public TypeVariable functionThatReturnsATypeVariable() {
        return singleVariable;
    }

    public void functionThatTakesATypeVariableParameter(TypeVariable param) {
        arrayVariable[0] = param;
    }

    private void functionThatCreatesAnArray() {
        // pointing this out in particular because its surprising
        // gotta make an Object array and then use a typecast to turn it into the TypeVariable array.
        arrayVariable = (TypeVariable[]) new Object[10];
    }

    private void someFinalNotes() {
        // you are only allowed to call functions on TypeVariable objects that are defined on the Object data type,
        // this does include tostring
        singleVariable.toString();
        // and equals
        singleVariable.equals(arrayVariable[0]);
        // Not sure you need that knowledge for this lab, but hey: it's good info.
    }

    public static void main(String[] args) {
        // creating different versions of GenericSyntaxExample to show off the syntax for constructing these objects.
        GenericsSyntaxExample<String> stringExaple = new GenericsSyntaxExample<>();
        String test = stringExaple.functionThatReturnsATypeVariable(); // Java knows the return value will be string
        stringExaple.functionThatTakesATypeVariableParameter("tacos!"); // Java knows the function takes a String


        // this example uses javas wrapper classes, primitives like "int" cannot be type parameters, so java has object
        // versions of each primitive type. For most primitive types, the wrapper class is simply the primitive type,
        // but with the name capitalized. The only exceptions are int => Integer and char => Character.
        GenericsSyntaxExample<Integer> intExample = new GenericsSyntaxExample<>();
        int test2 = intExample.functionThatReturnsATypeVariable(); // Java knows the return value will be Integer (which can convert to int)
        intExample.functionThatTakesATypeVariableParameter(14); // Java knows that this function takes Integers (which can be an int, java will just convert it)

        // If you don't have the angle braces <> part, your code will compile, but be wrong. If you don't fill in a type
        // java fills in Object for you, making the functions take Objects and return Objects, which is not right
    }
}
