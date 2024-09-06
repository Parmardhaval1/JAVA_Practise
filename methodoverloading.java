public class methodoverloading {
    void add(){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        int c = x+y;
        System.out.println(c);
    }
    void add(int f,double g)
    {
        double c = f+g;
        System.out.println(c);

    }
    public static void main(String[] args) {
        methodoverloading md = new methodoverloading();
        md.add();
        md.add(10,25);
        md.add(25,12.5);
    }
}
