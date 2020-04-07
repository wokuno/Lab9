/*  Meghana Woodruff    wood143
    William Okuno       okuno006
    lab 9
 */
public class BraceChecker {

    public static boolean checkBraces(String input) {
        GenericStack<String> stack = new GenericStack<>(10);
        for (int i = 0; i < input.length(); i++){
            if ((input.charAt(i) == '(') || (input.charAt(i) == '[') || (input.charAt(i) == '{')){
                stack.push(Character.toString(input.charAt(i)));
            }
            else if (input.charAt(i) == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                else if (stack.peek().equals("(")) {
                    stack.pop();
                }
                else if ((stack.peek().equals("{")) || (stack.peek().equals("["))){
                    return false;
                }

            }
            else if (input.charAt(i) == ']'){
                if (stack.isEmpty()){
                    return false;
                }
                else if (stack.peek().equals("[")) {
                    stack.pop();
                }
                else if ((stack.peek().equals("(")) || (stack.peek().equals("{"))){
                    return false;
                }

            }
            else if (input.charAt(i) == '}'){
                if (stack.isEmpty()){
                    return false;
                }
                else if (stack.peek().equals("{")) {
                    stack.pop();
                }
                else if ((stack.peek().equals("(")) || (stack.peek().equals("["))){
                    return false;
                }

            }

        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
