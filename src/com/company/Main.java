package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Implemente aqui o código para demonstrar o design Patter Strategy");
        
        Disciplina disciplina = new Disciplina();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome da disciplina");
        String nome = sc.next();
        disciplina.setNome(nome);
        
        disciplina.setSituacao("cursando");
        
        System.out.println("Informe o valor da P1");
        Float p1 = sc.nextFloat();
        disciplina.setP1(p1);
        
        System.out.println("Informe o valor da P2");
        Float p2 = sc.nextFloat();
        disciplina.setP2(p2);
        
        System.out.println("Informe o tipo de média: 1 para aritmética e 2 para geométrica");
        int tipo = sc.nextInt();
        
        ICalcMedia calculo = null;
        
        switch(tipo){
            case 1:
                calculo = new MediaAritmetica(disciplina.getP1(), disciplina.getP2());
                //break;
            case 2:
                calculo = new MediaGeometrica(disciplina.getP1(), disciplina.getP2());
                break;
        }
        
        calculo.CalculaMedia();
        disciplina.setMedia(calculo.RetornaMedia());
        disciplina.setSituacao(calculo.RetornaSituacao());
        
        System.out.println("");
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Média: " + disciplina.getMedia() + " | Situação: " + disciplina.getSituacao());
    }
}
