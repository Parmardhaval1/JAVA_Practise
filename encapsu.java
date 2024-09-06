public class encapsu {
    private int value;

    public void setvalue(int x)
    {
        value = x;
    }
    public int getvalue()
    {
        return value;
    }
}

class lation{
    public static void main(String[] args) {
        encapsu e = new encapsu();
        e.setvalue(100);
        System.out.println("a.getvalue()");
    }
}