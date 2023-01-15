package Lab06.Task01;

import java.util.Stack;

public class GenericMaxStack<E extends Comparable<E>> {

    Stack<GenericType> AStack = new Stack<GenericType>();

    E max;


    public void Push(E newElement){
        //if the stack is empty
        if(AStack.empty()){
            AStack.push(new GenericType(newElement, newElement));
            // set the max to the new first element
            this.max = newElement;
        }
        //stack has at least one member
        else if(!AStack.empty()){
            if(newElement.compareTo(max) > 0){
                //newElement is the new maximum
                this.max = newElement;
                AStack.push(new GenericType(newElement, newElement));
            }
            else {
                //newElement is less than the maximum
                AStack.push(new GenericType(newElement, max));
            }
        }
    }


    public void Pop(){
        AStack.pop();
    }


    public E getMax(){
        GenericType element = AStack.peek();
        return (E) element.max;
    }




}
