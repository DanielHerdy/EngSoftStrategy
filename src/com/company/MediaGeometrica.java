package com.company;

/* @author Daniel Carvalho */

public class MediaGeometrica implements ICalcMedia {
    private float p1, p2, media;

    MediaGeometrica() {
        
    }
    
    @Override
    public void CalculaMedia() {
        media = (float) Math.sqrt((p1 * p2));
    }
    
    public MediaGeometrica(float p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public float RetornaMedia(){
        return media;
    }
    
    public String RetornaSituacao(){
        if(media > 7){
            return "aprovado";
        }
        else{
            return "reprovado";
        }
    }
}