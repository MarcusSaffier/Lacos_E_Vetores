
package vetorsabadoletivo;


public class Pessoas {
    
    int canal;
    int idade;
    String nome;
    boolean controle;
    boolean hdmi;
    
    void vetor(){
    
    
   Pessoas[] tamanho = new Pessoas[2];
   
   Pessoas u1 = new Pessoas();
   tamanho[0] = u1;
   
   Pessoas u2 = new Pessoas ();
   tamanho[1] = u2;
   
   
   for (int n=0; n<1; n++){
       System.out.println(this.nome+" de idade igual a: "+this.idade+ " está assistindo ao canal: "+this.canal);
       
       if(controle==true){
           System.out.println("Este controle está com bateria.");
       }else{
           System.out.println("O controle está sem bateria.");
       }
       
       if(hdmi==true){
           System.out.println("Você está habilidado para assistir tv a cabo.");
       }else{
           System.out.println("Você não poderá assistier TV a cabo.");
       }
       
       if(idade>=18){
           System.out.println("Você é maior de idade.");
       }else{
           System.out.println("Você é menor de idade.");
       }
       
   }
   
   
   
   
   
    
    
    
}
    
    
    
}
