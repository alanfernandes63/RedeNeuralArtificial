/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author alan
 */
public class Rede {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    /**
     * @param args the command line arguments
     */
    
    int qtdAtributos;
    int qtdPadroes;
    Neuronio mcp;
    int[][] padroes = {{0,0},{0,1},{1,0},{1,1}};
    int[]desejada = {0,0,1,1};
    Scanner entrada = new Scanner(System.in);
         
    public static void main(String[] args) {
        // TODO code application logic here
        
         Rede rede = new Rede();
         rede.treinarRede();
         
         
    }
    
    public void iniciarRede(){
        qtdAtributos = padroes[0].length;
        qtdPadroes = desejada.length;
        mcp = new Neuronio(qtdAtributos);
    }
    public void treinarRede(){
        double erros = 0;
        do{
            erros = 0;
            for(int i=0;i<padroes[0].length;i++){
                
                /*mcp.calculaSaidaNeuronio();
                erros = mcp.atualizaErro();
                System.out.println(erros);*/
            }
            System.out.println("Erros totais: " + erros);
        }while(erros != 0);
    }
    public void testarRede(){
        
    }

    
}
