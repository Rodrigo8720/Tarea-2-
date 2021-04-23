public class Matematico
{
     public String MayorMedioMenor(double num1 , double num2 , double num3) {   
        double Mayor = 0;
        double Medio = 0;
        double Menor = 0;
       
        if (num1 > num2 && num1 > num3){
           Mayor  = num1;
           if (num2 > num3){
               Medio  = num2;
               Menor  = num3;
            }
           if (num3 > num2){
               Medio  = num3;
               Menor  = num2;
           }
        }
        if (num2 > num1 && num2 > num3){
           Mayor  = num2;
           if (num1 > num3){
             Medio  = num1;
             Menor  = num3;
           }
           if (num3 > num1){
             Medio  = num3;
             Menor  = num1;
           }
        }
        if (num3 > num1 && num3 > num2){
           Mayor  = num3;
           if (num1 > num2) {
              Medio  = num1;
              Menor  = num2;
           }
           if (num2 > num1){
              Medio  = num2;
              Menor  = num1;
           }
        }
        return  " el numero mayor es " + Mayor + " el del medio es " + Medio + " y el menor es " + Menor ;
    }
    public double CalcularArea(double base , double altura) {
        
        double area = base * altura;
        
        return area;
    }
    public  double  distancia(double x1, double x2, double y1,double y2){
       double distancia;
       
       distancia = Math.sqrt(Math.pow(x1 - x2, 2 ) + Math.pow(y1 - y2, 2));
      
       return distancia;
   }
    public String cuadrante(double x, double y){
        String cuadrante;
        
        if((x >= 0) && (y >= 0)){
            cuadrante =  " Su punto se encuentra en el primer cuadrante " ;
        } else {
            if ((x < 0 ) && (y >= 0)){
                cuadrante =  " Su punto esta en el segundo cuadrante " ;
            }else{
                if ((x < 0 ) && (y < 0 )){
                    cuadrante =  " Su punto esta en tercer cuadrante " ;
                }else{
                    cuadrante =  " Su punto esta en el cuarto cuadrante " ;
                }
            }
        }
       
     return cuadrante;
    }
}
    


 
