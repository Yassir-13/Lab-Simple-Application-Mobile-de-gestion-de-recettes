package com.example.pizzarecipes.classes;

public class Produit {
    private static long ID = 1;
    private long id;
    private String nom;
    private double prix;
    private int image;
    private String timing;
    private String ingred;
    private String Desc;
    private String etapes;

    public Produit(){
        this.id=ID++;
    }

    public Produit(String nom,double prix,int image,String timing,
                   String ingred, String Desc,String etapes){
        this.id = ID++;
        this.nom = nom;
        this.prix = prix;
        this.image = image;
        this.timing = timing;
        this.ingred = ingred;
        this.Desc = Desc;
        this.etapes = etapes;
    }

    public long getId() { return id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
    public int getImage() { return image; }
    public void setImage(int imageRes) { this.image = imageRes; }
    public String getTiming() { return timing; }
    public void setDuree(String timing) { this.timing = timing; }
    public String getIngredients() { return ingred; }
    public void setIngredients(String ingredients) { this.ingred = ingred; }
    public String getDescription() { return Desc; }
    public void setDescription(String description) { this.Desc = Desc; }
    public String getEtapes() { return etapes; }
    public void setEtapes(String etapes) { this.etapes = etapes; }


}
