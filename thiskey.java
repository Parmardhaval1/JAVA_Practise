public class thiskey {
    int a;

    thiskey(int a)
    {
        this .a =a;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        thiskey tk = new thiskey(100);
        tk.show();
    }
}
