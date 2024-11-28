/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.poo2atividade;

/**
 *
 * @author Gabriel
 */
public class FabricanteSingleton {
  private Apple apple;
  private Samsung samsung;
  
  public FabricanteCelular getInstace(String fabricante){
      if(fabricante.equals("apple")){
          if(apple==null){
              apple = new Apple();
          }
          return apple;
      }
      else{
          if(samsung==null){
              samsung = new Samsung();
          }
          return samsung;
      }
     
 
  }
   
   
   
   
   
   /* 
     public FabricanteCelular Apple;
   public FabricanteCelular Samsung;
   
   private static FabricanteSingleton instancia;
    private FabricanteSingleton(){
        
    }
   public static FabricanteSingleton getInstance(){
       if(instancia ==null){
           instancia = new FabricanteSingleton();
       }
       return instancia;
   }*/
 
}
