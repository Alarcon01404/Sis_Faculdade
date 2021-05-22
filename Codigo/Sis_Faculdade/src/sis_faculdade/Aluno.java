
package sis_faculdade;

import java.util.Scanner;

public class Aluno extends Pessoa {
    int cod_aluno;

    public Aluno() {
        super();
    }

    public Aluno(int cod_aluno, String nome, String end, String email, int idade) {
        super(nome, end, email, idade);
        this.cod_aluno = cod_aluno;
    }

    public int getCod_aluno() {
        return cod_aluno;
    }

    public void setCod_aluno(int cod_aluno) {
        this.cod_aluno = cod_aluno;
    }
    
    public void informaDados(){
        System.out.println("Digite o codigo do aluno "+getCod_aluno());
        super.informaDados();
    }
    
    public void cadastro(){
         Scanner entrada_String = new Scanner(System.in);
          Scanner entrada_int = new Scanner(System.in);
          
          System.out.println("Digite o nome do alugo");
          setNome(entrada_String.nextLine());
             System.out.println("Digite o endereço do aluno");
             setEnd(entrada_String.nextLine());
                System.out.println("Digite o email do aluno");
                setEmail(entrada_String.nextLine());
                   System.out.println("Digite a idade do aluno");
                   setIdade(entrada_int.nextInt());
                   
          
    }
    
   
}
