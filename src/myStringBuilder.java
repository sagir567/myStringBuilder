import java.io.Serializable;
import java.util.Stack ;

public class myStringBuilder  {

    private Stack<String> s1 = new Stack<String>();
    private StringBuilder str;

    public myStringBuilder(){
        this.str = new StringBuilder();

    }
    public myStringBuilder(String s){

        this.str = new StringBuilder(s);
    }

    public StringBuilder append(String s){
        s1.add(this.str.toString());
        this.str.append(s);
        return this.str;
    }




    public String toString(){
        return this.str.toString();
    }

    public StringBuilder delete(int start, int end){
        s1.add(this.str.toString());
        this.str= str.delete(start,end);
        return this.str;
    }

    public StringBuilder insert(int offset, String str){
        s1.add(this.str.toString());
        this.str.insert(offset,str);
        return this.str;
    }

    public  StringBuilder replace(int start, int end,String str){
        s1.add(this.str.toString());
        this.str.replace(start,end,str);
        return this.str;
    }

    public void reverse(){
        this.str.reverse();

    }
    public StringBuilder undo(){
        this.str = new StringBuilder(s1.pop());
        return this.str;
    }












}
