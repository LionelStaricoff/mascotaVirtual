
package ar.com.codoacodo.mavenproject2;




import java.time.LocalTime;
import java.util.Scanner;


/**
 *
 * @author ellaion
 */
public class MascotaVirtual {
 private   String name;
 private int nivel=0;
 private String estado;
 private LocalTime tiempoEstado;

 
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalTime getTiempoEstado() {
        return tiempoEstado;
    }

    public void setTiempoEstado(LocalTime tiempoEstado) {
        this.tiempoEstado = tiempoEstado;
    }

    public String getName() {
        return name;
    }


   
    
                 
        public void setName(String name){
            this.name = name;
        }
        

        // compara el tiempo en espera con el actual si es >= 80 hs.
        final public boolean tiempoMaximoAburrida() {
            // inicializo una variable con el tiempo actual.
            LocalTime tiempoActual = LocalTime.now();
            // icializo otra variable para comparar y le sumo el ultimo tiempo
            //+ en que cambio de estado mas 80 minutos.
           LocalTime tiempo = this.getTiempoEstado().plusHours(80);
           // comparo la variable con el tiempo para ver si pasaron los 80 minutos
           //+desde que esta sin hacer nada
        return tiempo.isAfter( tiempoActual );
        }
        
    public void menu() {
        Scanner sc = new Scanner (System.in);
     int opcion;
     estadoRandom();
     
        
        do {
            System.out.println("############################################");
            System.out.println("# que deceas hacer:                        #");
            System.out.println("# para saber el nivel pulse 1              #");
            System.out.println("# para comer pulse 2                       #"); 
            System.out.println("# para jugar pulse 3                       #");
            System.out.println("# para saber si puede jugar? pulse 4       #");
            System.out.println("# para saber si esta aburrida? pulse 5     #");
            System.out.println("# para saber si esta hambrienta pulse 6    #");
            System.out.println("# para saber si  esta contenta? pulse 7    #");
            System.out.println("# para saber si  esta triste? pulse 8      #");
            System.out.println("# simulando que paso 80 minutos... pulse 9 #");
            System.out.println("# para terminar de jugar pulse 0           #");
            System.out.println("############################################");
            System.out.print("opciòn: ");
             opcion = sc.nextInt();
            
            
             switch (opcion) {
                    case 0:
                        System.out.println("Gracias por usar la mascota virtual");
                break;
            case 1:
                System.out.println("EL nivel es: "+ this.getNivel());
                break;
                case 2:
                 comer();
                break;
                case 3:
                 jugar();
                break;
                 case 4:
                 puedeJugar();
                break;
                 case 5:
                 estaAburrida();
                break;
                case 6:
                 estaHambrienta();
                break;
                case 7:
                 estaContenta();
                break;
                case 8:
                 estaTriste();
                break;
                 case 9:
                 simularTiempo();
                break;
            default:
                  System.out.println("opsion incorrecta, vuelva a intentarlo!!");   
             
             }
             
             
             
    } while (opcion !=0);
 
 
  
 
 
  
    } 

    private void comer() {
//    implementacion triste: llora y su nivel baja a 0 si come o si juega si la condicion 
// + del tiempo se cumple

if (this.tiempoMaximoAburrida() ){

if(estaHambrienta() ) this.setEstado("contenta"); 
if(estaContenta() ) this.setNivel(this.getNivel() +1 ); 
if(estaAburrida() ) this.setEstado("contenta");
if(estaTriste() ){
    this.setNivel(0 );
    System.out.println("llora");
}
}else  { System.out.println("aun no han pasado 80 minutos de aburrimiento");
    
    }
}

    public void jugar() {
      
    
if(puedeJugar() ){
    
if(getEstado().equals("contenta") )this.setNivel(this.getNivel()+2 );
if(estaAburrida() )this.setEstado("contenta" );
if(getEstado().equals("triste") ){
    this.setNivel(0 );
    System.out.println("llora");
}

}else {
    System.out.println("no puede jugar porque esta hambrienta");
}
    }

   public boolean puedeJugar() {
        boolean retorno= false;
   if(!"hambrienta".equals(getEstado() )   ){
       retorno= true;
    }
     return retorno;
     
    }

    public void estadoRandom() {
      int numeroRandom = (int)(Math.random()*4+1);
    
      
      switch(numeroRandom){
          case 1:
              this.setEstado("contenta");
              break;
          case 2:
              this.setEstado("aburrida");
              break;
          case 3:
              this.setEstado("hambrienta");
              break;  
          default:
              this.setEstado("triste");
      }
    }

    public boolean estaAburrida() {
          boolean retorno= false;
   if("aburrida".equals(getEstado() )   ){
       retorno= true;
    }
     return retorno;
    }

     public boolean estaHambrienta() {
           boolean retorno= false;
   if("hambrienta".equals(getEstado() )   ){
       retorno= true;
    }
     return retorno;
    
    }

     public boolean estaContenta() {
           boolean retorno= false;
   if("contenta".equals(getEstado() )   ){
       retorno= true;
    }
     return retorno;
   
    }

    public boolean estaTriste() {
           boolean retorno= false;
   if("triste".equals(getEstado() )   ){
       retorno= true;
    }
     return retorno;
    }

   public void simularTiempo() {
      this.setTiempoEstado(this.getTiempoEstado().plusHours(80));
    
    }


    
    
    
}
