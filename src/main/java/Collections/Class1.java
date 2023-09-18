package Collections;

import javax.lang.model.element.Name;

public class Class1 <T>{
    private  T name;
    public  Class1(T Name){
        this.name=Name;
    }
    public T getName(){

        return name;
    }
    public boolean equals(Class1 ref){
     return this.name.equals(ref.getName());
    }
    public int  hashcode(){

        String s= (String)this.name;

        return s.length()*20;
    }

}
