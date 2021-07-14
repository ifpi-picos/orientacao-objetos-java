package com.example.associations;

public class App {

    public static void main(String[] args) {
        Curso ads = new Curso("ADS");

        Curso mat = new Curso("Matematica");

        Professor jesiel = new Professor("Jesiel");
        Professor rubens = new Professor("Rubens");

        ads.adicionaDisciplina(new Disciplina("Web", 70, jesiel));
        ads.adicionaDisciplina(new Disciplina("TCC I", 95, jesiel));

        mat.adicionaDisciplina(new Disciplina("TCC", 60, rubens));

        System.out.println("Curso: " + ads.getNome());

        System.out.println("#### disciplinas de ADS");
        for (Disciplina d : ads.getDisciplinas()) {
            System.out.println(d.getNome() + " ch: " + d.ch);
        }

    }
}
