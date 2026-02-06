package AravindOOps;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        String name = "Aravind";
        String reversedName = reverseName(name);
        System.out.println("The reversed name is "+reversedName);
    }

    private static String reverseName(String name) {
        String revName ="";
        Stack<Character> stack = new Stack<>();

        //Adding the chars to stack
        for(int i=0;i<name.length();i++){
            stack.push(name.charAt(i));
        }

        //Removing from stack and adding to string
        while (!stack.isEmpty()){
            revName+=stack.pop();
        }

        return revName;
    }
}
/**
 * Reversing a string using stack
 * */