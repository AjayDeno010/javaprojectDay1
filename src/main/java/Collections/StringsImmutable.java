package Collections;

public class StringsImmutable {
    public static void main(String[] args) {


        //Strings are immutable because when we create string it will be stored in string intentpool
        //if we made any changes string will get impact so that strings are immutable
        //we do have the string mutable for that we need to use the stringbuilder
        StringBuilder s = new StringBuilder("Ajay");
        s.append(" "+"Deno");
        System.out.println(s);

        String ak="AjayBro";
        ak.concat("bro cool");
        System.out.println(ak);
    }
}
