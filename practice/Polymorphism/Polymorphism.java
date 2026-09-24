class One{
    int a=30;
    float calc_si(float p,int t,float roi){
        float si=(p*t*roi)/100;
        return si;
    }
}
class Two extends One{
   
    float Calc_si(float p,int t,float roi){
        float si=(p*t*roi)/10;
        return si;
    }
    void access(){
        float result=calc_si(1000,2,2.45f);
        System.out.println("the result is "+ result);
    }
}
class Three extends One{

    float calc_si(float p,int t,float roi){
        float si=(p*t*roi)/1000;
        return si;
    }
    void access(){
        float result = calc_si(10000,3,3.45f);
        System.out.println("the result is"+ result);
    }
}
public class PolyMorphism {
    public static void main(String[] args){
        Two obj1 = new Two();
        obj1.access();
        Three obj2 = new Three();
        obj2.access();
    }
    
}
