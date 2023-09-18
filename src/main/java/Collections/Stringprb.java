package Collections;

public class Stringprb {
    public static void main(String[] args) {
        String str= "wwwaabdddww";
        for (int i=0;i<str.length()-1;i++){
            char current= str.charAt(i);
            char next= str.charAt(i+1);
            int count=1;
            if(current==next){
                count = count+1;

            } else {
                System.out.println(current+" "+ count);
                count =1;
            }
        }
    }
}
