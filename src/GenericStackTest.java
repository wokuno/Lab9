/**
 * Test for GenericStack class
 *
 */
public class GenericStackTest {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>(2);
        System.out.println(stack1.isEmpty());  // true

        System.out.println(null == stack1.peek()); // true
        System.out.println(null == stack1.pop()); // true

        stack1.push("rouge");
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.peek()); // rouge
        System.out.println(stack1.peek()); // rouge
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.pop()); // rouge
        System.out.println(stack1.isEmpty()); // true
        System.out.println(null == stack1.pop()); // true

        stack1.push("diet");
        stack1.push("hectic");
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.peek()); // hectic
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.pop()); // hectic
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.peek()); // diet
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.pop()); // diet
        System.out.println(stack1.isEmpty()); // true

        stack1.push("rouge");
        stack1.push("diet");
        stack1.push("hectic");
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.pop()); // hectic
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.pop()); // diet
        System.out.println(stack1.isEmpty()); // false
        stack1.push("knock");
        stack1.push("very nice");
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.pop()); // very nice
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.pop()); // knock
        System.out.println(stack1.isEmpty()); // false
        System.out.println(stack1.pop()); // rouge
        System.out.println(stack1.isEmpty()); // true

        System.out.println(null == stack1.pop()); // true

        GenericStack<Integer> stack2 = new GenericStack<>(3);
        System.out.println("Stack 2");

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack2.push(7);
        System.out.println(stack2.pop()); // 7
        System.out.println(stack2.pop()); // 6
        System.out.println(stack2.pop()); // 5
        System.out.println(stack2.pop()); // 4
        System.out.println(stack2.pop()); // 3
        System.out.println(stack2.pop()); // 2
        System.out.println(stack2.pop()); // 1
        System.out.println(stack2.isEmpty()); // true


        GenericStack<Character> stack3 = new GenericStack<>(3);
        System.out.println("Stack 3");

        // use the stack to reverse a string. neat!
        String apple = "tresed rof eip elppa";
        for(int i = 0; i < apple.length(); i++) {
            stack3.push(apple.charAt(i));
        }
        String out = "";
        while(!stack3.isEmpty()) {
            out += stack3.pop();
        }
        System.out.println(out); // apple pie for desert
    }
}

/*
true
true
true
false
rouge
rouge
false
rouge
true
true
false
hectic
false
hectic
false
diet
false
diet
true
false
hectic
false
diet
false
false
very nice
false
knock
false
rouge
true
true
Stack 2
7
6
5
4
3
2
1
true
Stack 3
apple pie for desert
 */