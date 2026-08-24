package Operacional.screanmactch.com;
import Modelos.screanmacth.com.Audio;
import Modelos.screanmacth.com.Musica;
import Modelos.screanmacth.com.PodCast;

import java.util.Scanner;

public class Sistema extends Principal {

    private String gmail = "paulohenrique@gmail.com";
    private String senha = "271005";
    Scanner ler = new Scanner(System.in);
    int escolha = 1;
    int opcao1;
    int opcao2;


    public int getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(int opcao2) {
        this.opcao2 = opcao2;
    }

    public Sistema() {
        this.gmail = gmail;
        this.senha = senha;

        System.out.println("Digite o seu gmail: ");
        this.gmail = ler.next();

        System.out.println("Digite o seu senha: ");
        this.senha = ler.next();


        System.out.println("=============================");
        System.out.println(" SEJA BEM VINDO AO YOU TUBE ! ");
        System.out.println("=============================");
    }

        public boolean fazerLogin (String gmailDigitado, String senhaDigitado){
            if (this.gmail.equals(gmailDigitado) && this.senha.equals(senhaDigitado)) {
                return true;
            }
            return false;
        }

    public void menu(Musica musica1, Musica musica2, PodCast podCast1, PodCast podCast2) {
        switch (escolha) {
            case 1: // O usuário escolheu Ouvir Música
                System.out.println("Qual opção de música você quer (1 ou 2)? ");
                opcao1 = ler.nextInt();

                if (opcao1 == 1) {
                    System.out.println("Tocando: " + musica1.getTitulo());
                    musica1.Reproduz();
                } else if (opcao1 == 2) {
                    System.out.println("Tocando: " + musica2.getTitulo());
                    musica2.Reproduz();
                }
                break;

            case 2: // O usuário escolheu Ouvir Podcast
                System.out.println("Qual opção de PodCast você quer (1 ou 2)? ");
                opcao1 = ler.nextInt();

                if (opcao1 == 1) {
                    System.out.println("Tocando: " + podCast1.getTitulo());
                    podCast1.Reproduz();
                } else if (opcao1 == 2) {
                    System.out.println("Tocando: " + podCast2.getTitulo());
                    podCast2.Reproduz();
                }
                break;
        }
    }
}

