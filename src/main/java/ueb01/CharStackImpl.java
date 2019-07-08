package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {


    private CharElement top;

    public void push (char c){
        top = new CharElement(c,top);
    }

    public char pop (){
        if (top == null)
                throw new NoSuchElementException();
        char v = top.value;
        top = top.next;
        return v;
    }

    public int size(){
        int counter = 0;
        CharElement it = top;
         while (it != null){
              counter++;
             it = it.next;
         }
         return counter;
    }
}
