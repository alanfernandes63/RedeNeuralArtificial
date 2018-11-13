/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alan
 */
public class Neuronio {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    int x[];
    double w[];
    int y;
    double e;
    final double N = 0.01;

    public Neuronio(int qtdEntradas) {
        this.x = new int[qtdEntradas];
        this.w = new double[qtdEntradas];
    }
    
    public void inicializarPesos(){
        for(int i=0;i<w.length;i++){
            w[i] = 0;
        }
    }
    public void setEntradas(int indice,int valor){
        x[indice] = valor;
    }
    
    public void calculaSaidaNeuronio(){
        int somatorio = 0;
       for(int i=0;i<w.length;i++){
           somatorio += x[i]*w[i];
       }
       ativacao(somatorio);
    }
    
    public void setErro(int yd){
        e = yd - y;
    }
    public void atalizarPeso(){
        for(int i=0;i<w.length;i++){
            w[i] = w[i] + N * e * x[i];
        }
    }
    public double atualizaErro(){
        return Math.abs(e);
    }
    public double getSaida(){
        return y;
    }
    public void ativacao(int somatorio){
        if(somatorio > 0)
            y = 1;
        else
            y = 0;
    }
     
    
    
    
}
