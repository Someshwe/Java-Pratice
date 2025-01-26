class room{
    double le;
    double we;
    void getData(double a,double b){
        le=a;
        we=b;
    }
}
public class er{
    public static void main(String[] args) {
        double area;
        room rm=new room();
        rm.le=13;
        rm.we=6;
        area=rm.le*rm.we;
        System.out.println(area);
    }
}
