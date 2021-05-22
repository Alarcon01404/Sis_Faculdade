
package sis_faculdade;

public class Funcionario extends Pessoa {
   private int valorhora;
   private int horastra;
   private boolean corpodocente;

    public Funcionario() {
    }

    public Funcionario(int valorhora, int horastra, boolean corpodocente, String nome, String end, String email, int idade) {
        super(nome, end, email, idade);
        this.valorhora = valorhora;
        this.horastra = horastra;
        this.corpodocente = corpodocente;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public int getHorastra() {
        return horastra;
    }

    public void setHorastra(int horastra) {
        this.horastra = horastra;
    }

    public boolean isCorpodocente() {
        return corpodocente;
    }

    public void setCorpodocente(boolean corpodocente) {
        this.corpodocente = corpodocente;
    }
    
    public int calculaHolerite(){
       
        return valorhora*horastra;
    }
     public void informaDados(){
        super.informaDados();
        System.out.println("Hora trabalhado: "+getHorasTab());
        System.out.println("Corpo docente: "+getCorpoDocente());
    }
}
