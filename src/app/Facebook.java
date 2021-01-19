package app;

public class Facebook {
    public String cadena1(int parametro){

            if (parametro%3==0){
                String s ="Face";
                return s;
            }else if (parametro%5==0){
                String s ="Book";
                return s;
            }else if (parametro%15==0){
                String s ="Facebook";
                return s;
            }else {
                String s = String.valueOf(parametro);
                return s;
            }
    }
    public String cadena(int [] valores){

        for(int i=0; i<valores.length; i++){

        cadena1(valores[i]) = 

         }    

    }
}
