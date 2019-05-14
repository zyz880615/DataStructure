package com.stack.three;

public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();             // get max stack size
        StackX theStackX = new StackX(stackSize);   // make stack

        for (int j = 0; j < stackSize; j++){
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStackX.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStackX.isEmpty()){
                        char chx = theStackX.pop();
                        if ( (ch=='}' && chx != '{') ||
                             (ch==']' && chx != '[') ||
                             (ch==')' && chx != '(')){
                            System.out.println("Error: " + ch + " at " + j);
                        }
                    }else {
                        System.out.println("Error: " + ch + " at " + j);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!theStackX.isEmpty()){
            System.out.println("Error: missing right delimiter");
        }
    }
}
