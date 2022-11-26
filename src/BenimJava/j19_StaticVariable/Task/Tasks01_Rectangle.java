package BenimJava.j19_StaticVariable.Task;

public class Tasks01_Rectangle {//kalıp

    /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */

    int width;
    int length=5;

    public Tasks01_Rectangle(int width, int length) {
        this.width=width;
        this.length=length;

    }
    public int cevre() {

        return (width+length)*2;
    }
    public void alan() {

        System.out.println(width*length);
    }
}


