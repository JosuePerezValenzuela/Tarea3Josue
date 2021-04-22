
public class matematico
{
    private calculadorDeEcuaciones calculadorDeEcuaciones;
    public matematico(calculadorDeEcuaciones calculadorDeEcuaciones){
        this.calculadorDeEcuaciones = calculadorDeEcuaciones;
    }
    public String indicador(double num1, double num2, double num3){
        double Mayor = 0;
        double Medio = 0;
        double Menor = 0;
        if (num1>num2 && num1>num3){
           Mayor = num1;
           if (num2>num3){
               Medio = num2;
               Menor = num3;
            }
           if(num3>num2){
               Medio = num3;
               Menor = num2;
           }
        }
        if (num2>num1 && num2>num3){
         Mayor = num2;
         if (num1>num3){
             Medio = num1;
             Menor = num3;
         }
         if(num3>num1){
             Medio = num3;
             Menor = num1;
         }
        }
        if (num3>num1 && num3>num2){
          Mayor = num3;
          if (num1>num2){
              Medio = num1;
              Menor = num2;
          }
          if (num2>num1){
              Medio = num2;
              Menor = num1;
            }
        }
        return "mayor"+Mayor+"medio"+Medio+"menor"+Menor;
    }
    public double area(double base, double altura){
        double area = base * altura;
        return area;
    }
    public double distancia2Puntos (Punto punto1,Punto punto2){
        double distancia = Math.sqrt(Math.pow(punto2.getx()-punto1.getx(),2)+Math.pow(punto2.gety()-punto1.gety(),2));
        return distancia;
    }
    public String cuadrante(Punto punto1){
        String cuadrante = null; 
        if (punto1.getx()>0 && punto1.gety()>0){
         cuadrante = "1";
        }
        if (punto1.getx()<0 && punto1.gety()>0){
         cuadrante = "2";
        }
        if (punto1.getx()<0 && punto1.gety()<0){
         cuadrante = "3";
        }
        if (punto1.getx()>0 && punto1.gety()<0){
         cuadrante = "4";
        }
        return cuadrante;
    }
    public String solucion(double a,double b,double c){
       String calculo = calculadorDeEcuaciones.resultados(a, b, c);
       return "Son"+ calculo;
    }
    public String ecuacionRecta (Punto punto1, Punto punto2){
      String solucion = calculadorDeEcuaciones.ecuacionRecta(punto1, punto2);
      return "La ecuacion es"+solucion;
    } 
    public String calcularCateto (double hipo, double cate){
      double cat = calculadorDeEcuaciones.catetoFaltante(hipo, cate);
      return "El cateto es igual a "+cat;
    }
}
