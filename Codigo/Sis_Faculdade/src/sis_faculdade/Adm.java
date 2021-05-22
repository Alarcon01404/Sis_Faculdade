
package sis_faculdade;

import java.util.Scanner;

public class Adm extends Funcionario {
    int cod_adm;

    public Adm() {
        super();
    }

    public Adm(int cod_adm) {
        this.cod_adm = cod_adm;
    }

    public int getCod_adm() {
        return cod_adm;
    }

    public void setCod_adm(int cod_adm) {
        this.cod_adm = cod_adm;
    }
    public void informaDados(){
        System.out.println("Digite o codigo do adm "+getCod_adm());
        super.informaDados();
    }
    public void cadastro(){
        Scanner scan_string = new Scanner(System.in);
        Scanner scan_int = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        setNome(scan_string.nextLine());
        
        System.out.println("Digite o seu endereço: ");
        setEnd(scan_string.nextLine());  

        System.out.println("Digite o seu Email: ");
        setEmail(scan_string.nextLine());    

        System.out.println("Digite o sua Idade: ");
        setIdade(scan_string.nextInt());   

        System.out.println("Digite as hosras trabalhadas: ");
        setHorasTab(scan_string.nextInt());   

        System.out.println("Digite o cod_adm: ");
        setCod_adm(scan_string.nextInt());  
        
    
    }
        public void informaDados(){
       
        System.out.println("Codigo adm é: "+getCod_adm());
        super.informaDados();
        System.out.println("Valor ganhao por horas: "+super.calculaHolerite());
    }
}
