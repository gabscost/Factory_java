/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.poo2atividade;

/**
 *
 * @author Gabriel
 */
public class Samsung implements FabricanteCelular{

    @Override
    public Celular controiCelular(String modelo) {
       if(modelo.equals("Galaxy8")){
           return new Galaxy8();
       }else{
           return null;
       }
    
}
}