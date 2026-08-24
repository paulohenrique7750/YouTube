package Modelos.screanmacth.com;

import Operacional.screanmactch.com.Principal;

public class Audio  {
    private String Titulo;
    private int TotalDeReproducao;
    private int TotalCurtidas;
    private int Clasificacao;

    public int getTotalDeReproducao() {
        return TotalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        TotalDeReproducao = totalDeReproducao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getTotalCurtidas() {
        return TotalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        TotalCurtidas = totalCurtidas;
    }

    public int getClasificacao() {
        return Clasificacao;
    }

    public void setClasificacao(int clasificacao) {
        Clasificacao = clasificacao;
    }

    public int Curte() {
        return TotalCurtidas;
    }

    public int Reproduz() {
        return TotalDeReproducao;
    }
}
