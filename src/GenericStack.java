/*  Meghana Woodruff    wood143
    William Okuno       okuno006
    lab 9
 */
public class GenericStack<Elem extends Object> {

    private Elem[] elems;
    private int size = -1;

    public GenericStack(int initMax) {
        this.elems = (Elem[]) new Object[initMax];
    }

    public boolean isEmpty(){
        if (this.size == -1){
            return true;
        }
        return false;
    }

    public void push(Elem elem){
        if(this.size == this.elems.length - 1){
            Elem[] newStack = (Elem[]) new Object[this.elems.length * 2];
            for (int i = 0; i < this.elems.length; i++){
                newStack[i] = this.elems[i];
            }
            this.elems = newStack;
        }
        this.size++;
        this.elems[size] = elem;

    }

    public Elem peek(){
        if (this.isEmpty()){
            return null;
        }
        return this.elems[size];
    }

    public Elem pop(){
        if (this.isEmpty()){
            return null;
        }
        Elem entry = this.elems[this.size];
        this.size--;
        return entry;
    }
}
