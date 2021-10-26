package com.company;

/* @author Daniel Carvalho */

public class MediaAritmetica implements ICalcMedia {
    private float p1, p2, media;

    MediaAritmetica() {
        
    }
    
    @Override
    public void CalculaMedia() {
        media = (p1 + p2) / 2;
    }
    
    public MediaAritmetica(float p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public float RetornaMedia(){
        return media;
    }
    
    public String RetornaSituacao(){
        if(media > 5){
            return "aprovado";
        }
        else{
            return "reprovado";
        }
    }
}
