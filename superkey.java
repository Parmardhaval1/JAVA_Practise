public class superkey {
    int a = 10;
}

class boy extends superkey{
    int a = 20;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}

class test{
    public static void main(String[] args) {
        {
            boy ok = new boy();
            ok.show();
        }
    }
}

