package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Etudiant {
    /*private int id;
    private String nom;
    private String prenom;
    private String ville;
    private String sexe;
    private String image;
    public Etudiant() {
    }
    public Etudiant(int id, String nom, String prenom, String ville, String sexe,String image) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.sexe = sexe;
        this.image=image;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }*/

    @SerializedName("0")
    @Expose
    private int _0;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("1")
    @Expose
    private String _1;
    @SerializedName("nom")
    @Expose
    private String nom;
    @SerializedName("2")
    @Expose
    private String _2;
    @SerializedName("prenom")
    @Expose
    private String prenom;
    @SerializedName("3")
    @Expose
    private String _3;
    @SerializedName("ville")
    @Expose
    private String ville;
    @SerializedName("4")
    @Expose
    private String _4;
    @SerializedName("sexe")
    @Expose
    private String sexe;
    @SerializedName("5")
    @Expose
    private String _5;
    @SerializedName("image")
    @Expose
    private String image;

    public int get0() {
        return _0;
    }

    public void set0(int _0) {
        this._0 = _0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get1() {
        return _1;
    }

    public void set1(String _1) {
        this._1 = _1;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String get2() {
        return _2;
    }

    public void set2(String _2) {
        this._2 = _2;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String get3() {
        return _3;
    }

    public void set3(String _3) {
        this._3 = _3;
    }

    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }

    public String get4() {
        return _4;
    }

    public void set4(String _4) {
        this._4 = _4;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String get5() {
        return _5;
    }


    public void set5(String _5) {
        this._5 = _5;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
