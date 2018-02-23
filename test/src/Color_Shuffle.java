import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;



public class Color_Shuffle {
    public final static Integer PEEKMAX = 5;
    static int lastNum;




    //シャッフル処理
    public static Integer getNext(){
        int i;
        do {
            Random rand = new Random();
            i = rand.nextInt(PEEKMAX);
        }while(i == lastNum );
        lastNum = i;
        return i;
    }




    public static void main(String[] args){


        ArrayList<String> msg = new ArrayList<String>();
        msg.add("Red");
        msg.add("Green");
        msg.add("Blue");
        msg.add("Yellow");
        msg.add("Pink");

        System.out.println("-----シャッフル前--------");

        for(String color:msg){
            System.out.println(color);
        }



        Collections.shuffle(msg);
        System.out.println("-----シャッフル後--------");

        for(String color : msg){
           System.out.println(msg.get(getNext()));
        }

    }


}
