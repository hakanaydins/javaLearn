package Projeler.homeworkLesson;

import java.util.ArrayList;

public class student {
    String studentName;
    int maxCredit=10;

    public student() {
        this.studentName = studentName;

    }



    ArrayList<lesson>derslist=new ArrayList<>();
    public int toplamkredi(){
        int toplm=0;
        for (lesson toplamkredi:derslist) {
            toplm += toplamkredi.lessoncredit;
        }return toplm;
    }

}
