
import java.util.Stack;

class VALIDPARENTHESESeasy {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if( stack.isEmpty() ||
                (c==')' && stack.peek() !='(') || 
                (c=='}' && stack.peek() !='{') || 
                (c==']' && stack.peek() !='[')){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        VALIDPARENTHESESeasy solution=new VALIDPARENTHESESeasy();
        String s="()";
        System.out.println(solution.isValid(s));
    }
}