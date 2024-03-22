package org.example;

public class Hair implements HairInter{
    private int nom = 33;
    public int getHairNumber() {
        return 222;
    }


    @Override
    public void dnishche() {
        System.out.println(" Hair Inter");
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return " Hair{" +
                "nom=" + nom +
                '}';
    }
}
