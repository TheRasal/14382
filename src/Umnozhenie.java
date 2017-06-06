
public class Umnozhenie implements Calculator {
   private  int a;
   private  int b;

//    public Umnozhenie(String a, String b) {
//        this.a = a;
//        this.b = b;
//    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public  Integer calc(){
        return Integer.valueOf(a)*Integer.valueOf(b);
    }
}
