
package Clases;

/**
 *
 * @author Lj
 */
public class Operaciones {
   public float suma(float num1, float num2){
      float suma;
      suma=num1+num2;
      return suma;
      } 
   public float multi(float num1,float num2){
       float multi;
       multi=num1*num2;
       return multi;
   }
public float resta(float num1,float num2){
       float resta;
       resta=num1-num2;
       return resta;
   }
public float division(float num1,float num2){
       float divi;
       divi=num1/num2;
       return divi;
   }
public float raiz(float num1,float num2){
       float raiz1;
       raiz1=(float) Math.sqrt(num1);
       return raiz1;
   }
public float potencia(float num1,float num2){
       float pot;
       pot=(float) Math.pow(num1, num2);
       return pot;
   }
public float funsionseno(float num1,float num2){
       float sen;
       sen=(float) Math.sin(num1);
       return sen;
   }
public float funsioncoseno(float num1,float num2){
       float cos;
       cos=(float) Math.cos(num1);
       return cos;
   }
public float raizcubica(float num1,float num2){
       float raizc;
       raizc=(float) Math.cbrt(num1);
       return raizc;
   }
public float mayor(float num1,float num2){
       float may;
    if (num1 > num2) {
            may=num1;
        } else if (num1 < num2) {
            may=num2;
        } else {
            may=num1;
        }
return may;
   }
}
