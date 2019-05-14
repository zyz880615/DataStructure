package com.stack.two;

import com.stack.two.StackX;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
    }

    public String doRev() {
        int stackSize = input.length();             // get max stack size
        StackX theStack = new StackX(stackSize);    // make stack

        for (int j = 0; j < stackSize; j++){
            char ch = input.charAt(j);              // get a char from input
            theStack.push(ch);
        }

        output = "";
        while ( !theStack.isEmpty()){
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
}
