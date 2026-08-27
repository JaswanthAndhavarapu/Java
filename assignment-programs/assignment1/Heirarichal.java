class T{
    int x;
    void sum(String name){
        System.out.println("the name of person is :"+name);
    }
}
class W extends T{
    float y=23.45f;
    void name(int r){
        System.out.println("the value of r is:"+r);
    }
}
class Q extends T{
    void add(){
        System.out.println("this is heirarichal inheritance");
    }
}

public class Heirarichal {
    public static void main(String[] args) {
        Q q=new Q();
        W w=new W();
        q.add();
        w.name(34);
        q.sum("manodhara");
    }
}
