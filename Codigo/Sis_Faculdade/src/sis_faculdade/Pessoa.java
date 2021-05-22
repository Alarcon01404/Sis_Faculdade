
package sis_faculdade;

public class Pessoa {
   private String nome;
    private String end;
   private String email;
   private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String end, String email, int idade) {
        this.nome = nome;
        this.end = end;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void informaDados(){
        System.out.println("Digite o nome "+getNome());
         System.out.println("Digite o email "+getEmail());
          System.out.println("Digite o endereço "+getEnd());
           System.out.println("Digite a idade "+getIdade());
    }
    public void validaIdade(){
        if (idade >=0) && (idade < 100) {
           this.idade = idade;
        } else {
            System.out.println("idade invalida");
        }
    }
}
