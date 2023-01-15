package Lab05.Task02;

import java.util.List;
import java.util.Stack;

public class MinStack {

    int min;
    Stack<Element> AStack = new Stack<>();

    public void Push(int newElement){
        //if the stack is empty
        if(AStack.empty()){
            AStack.push(new Element(newElement, newElement));
            // set the min to the new first element
            this.min = newElement;
        }
        //stack has at least one Integer
        else if(!AStack.empty()){
            if(newElement<min){
                //newElement is the new minimum
                this.min = newElement;
                AStack.push(new Element(newElement, newElement));
            }
            else {
                //newElement is less than the minimum
                AStack.push(new Element(newElement, min));
            }

        }

    }

    public void Pop(){
        AStack.pop();
    }

    public int min(){
        Element element = AStack.peek();
        return element.min;
    }
}
