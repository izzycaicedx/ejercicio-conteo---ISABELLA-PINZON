package pk01;


public class Conteo {

 private int numero_vocales, numero_consonantes;
 private String palabra;
   
     public Conteo(){
       
        this.numero_consonantes=0; this.numero_vocales=0; 
        this.palabra=" ";
     
    }
    
     
     public void setPalabra(String palabra){
        this.palabra=palabra;
        
        }
     public int getNumeroVocal() {
        return numero_vocales;
        
        }  
     
      public int getNumeroConsonantes() {
        return numero_consonantes;
        
        }   
     
     public void calcularPalabra(){
        
     numero_vocales = 0;
        numero_consonantes = 0;
        String vocales = "aeiou";

        for (char letra : palabra.toCharArray()) {
            if (Character.isLetter(letra)) {
                if (vocales.indexOf(Character.toLowerCase(letra)) != -1) {
                    numero_vocales++;
                } else {
                    numero_consonantes++;
                }
            }
        }

  }
     
  }
