package services;

import model.Filme;

public class GradeFilmesProxy implements IgradeFilmes {
    @Override
    public void getFilme(String nomeFilme, int ipUser, int ipFilme, String filmeBanco) {
        if (filmeBanco != null && filmeBanco.equals(nomeFilme) && ipFilme == ipUser) {
            String pais = "";
            if (ipUser >= 0 && ipUser <= 49) {
                pais = "Argentina";
            } else if (ipUser >= 50 && ipUser <= 99) {
                pais = "Brasil";
            } else if (ipUser >= 100 && ipUser <= 149) {
                pais = "Colômbia";
            } else {
                System.out.println("País não identificado pelo endereço IP do usuário");
                return;
            }

            String filmePais = "";
            if (ipFilme >= 0 && ipFilme <= 49) {
                filmePais = "Argentina";
            } else if (ipFilme >= 50 && ipFilme <= 99) {
                filmePais = "Brasil";
            } else if (ipFilme >= 100 && ipFilme <= 149) {
                filmePais = "Colômbia";
            } else {
                System.out.println("País não identificado pelo endereço IP do filme");
                return;
            }

            if (pais.equals(filmePais)) {
                GradeDeFilmes filmes = new GradeDeFilmes();
                filmes.getFilme(nomeFilme, ipUser, ipFilme, filmeBanco);
                System.out.println("Este filme está disponível em seu país!");
            } else {
                System.out.println("Filme não disponível no seu país");
            }
        } else {
            System.out.println("Filme não encontrado");
        }
    }
}
