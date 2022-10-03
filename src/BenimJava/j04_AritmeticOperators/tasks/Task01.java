package BenimJava.j04_AritmeticOperators.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//5
        x += x;//10
        --x;//9
        x = 7 + x;//16
        x *= x;//256
        x -= 3;//253

            System.out.println(" x = " + x);
        
        int a = 3;
        double d = 4.5;

        d+=a;//4.5+3=7.5
        a+=d;//3+7.5=10.5 değil integer olduğu için tamsayı olur 10
        d-=a;//7.5-10=-2.5
        a-=d;//10-=12.5 değil integer olduğundan 12 olur

        System.out.println(" d = " + ++d );// d değerini 1 artırır d=-1.5 print eder
        System.out.println(" a = " + a-- );// a değerini 12 print eder, değeri 1 eksilir a=11 olur.
        
        

	}

}
