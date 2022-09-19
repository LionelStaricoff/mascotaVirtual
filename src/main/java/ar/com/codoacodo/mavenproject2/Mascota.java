
package ar.com.codoacodo.mavenproject2;

/**
 *
 * @author ellaion
 */
public class Mascota {
    
    int nivel=0, aburrida=0;
     boolean hambrienta = true, contenta, triste;
    // si esta triste no come , no juega y su nivel baja a 0;
    // si lo felicitan deja de estar triste, si lo retan se pone triste;
     /*
     public Mascota(){
           Mascota mascota1 = new Mascota();
        System.out.println("hola, soy una mascota");
        System.out.println("Estado inicial");
        mascota1.imprime();
        
           mascota1.puedeJugar();
        System.out.println("jugando sin comer");
        mascota1.imprime();
        
        mascota1.comer();
        System.out.println("comiendo");
        mascota1.imprime();
        
        mascota1.puedeJugar();
        System.out.println("jugando");
        mascota1.imprime();
     }
     
     */
     
  void  comer(){
  if (!triste){
     if (hambrienta)this.contenta = true;
     if (contenta)this.nivel++;  
     if (aburrida > 80) this.contenta = true;
      
  }  else {
      this.nivel=0;
  } 
    }
    
 
   void puedeJugar(){
       if (!triste){
       if( hambrienta){
        if (contenta)this.nivel+=2;
        if (aburrida > 0) this.contenta = true;
   } else {
      this.nivel=0;
  } 
   }
   }
    
    final void imprime(){
        System.out.println("nivel: "+ this.nivel+ " aburrida: "+ this.aburrida
        +  " hambrienta:"+this.hambrienta
        + " contenta: "+this.contenta+ " triste "+this.triste);
    }
    
    void felicitan(){
        this.triste = false;
    }
 void retan(){
        this.triste = true;
    }
    }
