
package sis_faculdade;

import java.util.Scanner;

public class Professor extends Funcionario {
    int cod_prof;

    public Professor() {
        super();
    }

    public Professor(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }
    public void informaDados(){
        System.out.println("Digite o codigo do professor"+getCod_prof());
        super.informaDados();
    }
    public void cadasto(){
        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);
        
        System.out.println("Digite o código do professor: ");
        setCod_prof(entradaInt.nextInt());
        
        System.out.println("Digite o nome do professor: ");
        setNome(entradaString.nextLine());
        
        System.out.println("Digite a idade do professor: ");
        setIdade(entradaInt.nextInt());
        
        System.out.println("Digite o e-mail do professor: ");
        setEmail(entradaString.nextLine());
        
        System.out.println("Digite o endereço do professor: ");
        setEnd(entradaString.nextLine());                     
        
        System.out.println("Digite quantas horas o professor trabalhou: ");
        setHorasTab(entradaInt.nextInt());
    }

    public void informaDados(){
        System.out.println("****************************************************");
        System.out.println("O código do Prossefor: "+getCod_prof());
        super.informaDados();
    }
}
