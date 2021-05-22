
package sis_faculdade;

import java.util.Scanner;

public class Sis_Faculdade {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.cadastro();
          a1.informaDados();
        Adm adm1 = new Adm ();
        adm1.cadastro();
        adm1.informaDados();
        Professor p1 = new Professor();
        p1.cadastro();
        p1.informaDados();
    }
    
}
