package BenimJava.J26_Inheritance.Task02;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.my_method();
    }
    int  num= 10;
    public  void my_method(){
        goster();//SubClass call
        super.goster();//superClass call
        System.out.println("subClss num :"+num);
        System.out.println("SuperClss num :"+super.num);
    }

    @Override
    public void goster() {
        System.out.println("Bu method subClass  görüntülenme methodudur. ");
    }
}


