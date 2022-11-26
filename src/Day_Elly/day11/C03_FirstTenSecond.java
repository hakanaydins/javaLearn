package Day_Elly.day11;

import java.time.LocalDateTime;

public class C03_FirstTenSecond {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        System.out.println("time = " + time);
        if(time.getSecond() <=10)
            System.out.println("ilk 10 sn icinde");
        else
            System.out.println("ilk 10 sn disinda");



    }
}
