package Operacional.screanmactch.com;
import Modelos.screanmacth.com.Audio;
import Modelos.screanmacth.com.Musica;
import Modelos.screanmacth.com.PodCast;

public class Principal {
    private static Sistema sistema;

    public static  void main(String[] args) {


        Musica minhasmusica1 = new Musica();
        minhasmusica1.setTitulo("Porão");
        minhasmusica1.setArtista("Marcos Almeida");
        minhasmusica1.setAlbum("Calado");

        for (int i = 0; i < 1000; i++) {
            minhasmusica1.Reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhasmusica1.Curte();
        }

        Musica minhasmusica2 = new Musica();
        minhasmusica2.setTitulo("viceral ");
        minhasmusica2.setArtista("Jose jr");
        minhasmusica2.setAlbum("veneza");

        for (int i = 0; i < 1000; i++) {
            minhasmusica2.Reproduz();
        }

        for (int i = 0; i < 50; i++) {

        }

        for (int i = 0; i < 10000; i++) {
            minhasmusica2.Curte();


        }

        PodCast podCast1 = new PodCast();
        podCast1.setTitulo(" PodPah ");
        podCast1.setApresentador("Igão e Mítico ");

        for (int i = 0; i < 2; i++) {
            podCast1.Reproduz();
        }

        for (int i = 0; i < 50; i++) {

        }

        for ( int i = 0; i < 10000; i++) {
            podCast1.Curte();
        }

        PodCast podCast2 = new PodCast();


        Sistema sistema1 = new Sistema();

        sistema1.menu(minhasmusica1, minhasmusica2, podCast1 , podCast2);

    }
    }

