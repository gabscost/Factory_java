/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.poo2atividade;

/**
 *
 * @author Gabriel
 */
public class IphoneX implements Celular{
     @Override
    public void FazLigacao() {
      System.out.println(" Iphone Fazendo ligacao");
    }

    @Override
    public void TiraFoto() {
        System.out.println("Iphone Tirando foto");
    }
}
