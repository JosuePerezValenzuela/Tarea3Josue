
public class calculadorDeEcuaciones
{
    private double a;
    private double b;
    private double c;
    public String resultados(double a,double b,double c)
    {
       double calculo1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
       double calculo2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
       return ","+calculo1+","+calculo2;
    }
    public String ecuacionRecta (Punto punto1, Punto punto2){
      double a = (punto2.gety()-punto1.gety())/(punto2.getx()-punto1.getx());
      double ecuacionRecta1 = (a*(-1*punto1.getx()))+ punto1.gety();
      return "y="+a+"x+"+ecuacionRecta1; 
    }
    public double catetoFaltante (double hipo, double cate){
      double catetoFaltante = Math.sqrt((hipo*hipo)-(cate*cate));
      return catetoFaltante;
    }
}
