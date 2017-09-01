package br.edu.ifpb.pdm;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by rusem on 29/08/2017.
 */


public class Local implements Serializable{
    private String endereco;
    private String localizacao;
    private String tipo;
    private Bitmap image;

    public Local(){}
    public Local(String endereco, String localizacao, String tipo){
        this.endereco = endereco;
        this.localizacao = localizacao;
        this.tipo = tipo;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setImage(Bitmap image){
        this.image = image;
    }
    public Bitmap getImage(){
        return this.image;
    }

    public String toString(){
        return this.endereco + "\n" + this.localizacao;
    }
}
