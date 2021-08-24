package exercicio7;

import java.util.Scanner;
/*
 Faça uma classe que solicite login e senha, simulando o acesso a um sistema. 
 Considere que os conteúdos de login e senha originais são iguais a “java8”. 
 O usuário deverá fornecer login e senha e você irá compará-los com os conteúdos originais. 
 O usuário tem três chances para digitar corretamente os dados de login e senha. 
 Para cada tentativa incorreta deve aparecer uma mensagem alertando o erro e apresentando a quantidade de 
 tentativas que ainda restam.
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nTentativas = 3;
        int nTentativasUsadas = 0;
        String tentativas;
        String login;
        String senha;
        boolean logou = false;
        while(nTentativas != 0 && logou == false) {
            if(nTentativas < 3) {
                tentativas = nTentativas == 1 ? "tentativa" : "tentativas";
                System.out.printf("VocÃª ainda tem %d %s", nTentativas, tentativas);
            }
            System.out.println("\nDigite o login: ");
            login = teclado.next();
            System.out.println("\nDigite a senha: ");
            senha = teclado.next();
            if(login.equals("java8") && senha.equals("java8")) {
                logou = true;
                nTentativasUsadas++;
                nTentativas--;
            }else {
                nTentativasUsadas++;
                nTentativas--;
            }
        }
        if(logou) {
            System.out.println("Você esta logado");
            System.out.printf("Você se logou na %dº tentativa", nTentativasUsadas);
        }else {
            System.out.println("Você não esta logado, e esgotou as 3 chances de realizar login");
        }

    }

}
