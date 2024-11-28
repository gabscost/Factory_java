/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.poo2atividade;

/**
 *
 * @author Gabriel
 */
public class ChannelFactory {
   public static Channel create(String type) {
       if(type.equals("TCP")){
           return new TCPChannel();
       }else{
           return new DCPChannel();
       }
    }
}
