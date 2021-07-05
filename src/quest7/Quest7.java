/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest7;

/**
 *
 * @author Usuario
 */
public class Quest7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int somaM = 0, somaF = 0, x=0, contF = 0, bigalt=0, lessalt=2000; 
        double contM = 0, mediaF=0, mediapop=0, perc=0;
        for(x=0;x<50;x++){
            System.out.println("Digite 0 para masculino e 1 para feminino.");
            int sexo = ler.nextInt();
            System.out.println("Digite a altura em cm Ex: 160");
            int altura = ler.nextInt();
            if(altura>bigalt){
                bigalt = altura;
            }
            if(altura<lessalt){
                lessalt = altura;
            }
            if (sexo == 0) {
                contM++;
                somaM += altura;
            }if (sexo == 1) {
                somaF += altura;
                contF++;
            }
        }
        System.out.println(contM);
        System.out.println(bigalt);
        System.out.println(lessalt);
        System.out.println(somaF);
        System.out.println(contF);
        System.out.println(contM);
        mediaF = (somaF / contF);
        mediapop = (somaM+somaF)/50;
        perc = 100 / 50 * contM;
        System.out.println("Maior altura: "+bigalt);
        System.out.println("Menor altura: "+lessalt);
        System.out.println("Média da altura feminina" + mediaF);
        System.out.println("Média de altura populacional" + mediapop);
         System.out.println("Percentual de homens na população " + perc+"%");
    }
    
}
