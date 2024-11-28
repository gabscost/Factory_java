/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dotcom.poo2atividade;

public class POO2Atividade {

    public static void main(String[] args) {
       FabricanteSingleton singleton = new FabricanteSingleton();
       FabricanteCelular fabricanteSamsung = singleton.getInstace("samsung");
       Celular galaxy8 = fabricanteSamsung.controiCelular("Galaxy8");
       galaxy8.TiraFoto();
    }
}
