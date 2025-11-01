package Stacks;

import java.util.*;


public class intro_stack {
public static void main(String[] args){
    Stack<Integer> st = new Stack<>();

    st.push(50);
    System.out.println(st +" the size is equal to:" + st.size() +" the last element is" +st.peek());

    st.push(20);

    System.out.println(st +" the size is equal to:" + st.size() +" the last element is" +st.peek());
    st.push(30);

    System.out.println(st +" the size is equal to:" + st.size() +" the last element is" +st.peek());
    st.pop();


    System.out.println(st +" the size is equal to:" + st.size() +" the last element is" +st.peek());

}

}
