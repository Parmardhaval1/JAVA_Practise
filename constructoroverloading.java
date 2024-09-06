public class constructoroverloading {
int a; String name; double b;
    constructoroverloading()
    {
        a=100; name="dhaval";
    }

    constructoroverloading(int x){
        a=x;
    }
    constructoroverloading(double y , String z){
            b=y; name = z;
    }
}