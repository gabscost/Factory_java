/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.poo2atividade;

/**
 *
 * @author Gabriel
 */
public class Apple implements FabricanteCelular{
    @Override
    public Celular controiCelular(String modelo) {
       if(modelo.equals("IphoneX")){
           return new IphoneX();
       }else{
           return null;
       }
    
}
}
