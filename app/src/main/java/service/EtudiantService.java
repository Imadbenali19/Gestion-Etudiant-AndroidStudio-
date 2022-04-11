package service;

import java.util.ArrayList;
import java.util.List;

import beans.Etudiant;
import dao.Idao;

public class EtudiantService implements Idao<Etudiant> {
    private List<Etudiant> etudiants;
    private static EtudiantService instance;

    public EtudiantService() {
        etudiants=new ArrayList<Etudiant>();
    }

    public static EtudiantService getInstance() {
        if(instance == null)
            instance = new EtudiantService();
        return instance;
    }

    public int size(){
        return etudiants.size();
    }

    @Override
    public boolean create(Etudiant o) {
        return etudiants.add(o);
    }

    @Override
    public boolean update(Etudiant o) {
        for(Etudiant e:etudiants) {
            if(o.getId()==e.getId()) {
                e.setNom(o.getNom());
                e.setPrenom(o.getPrenom());
                e.setSexe(o.getSexe());
                e.setImage(o.getImage());
                e.setVille(o.getVille());
            }
        }
        return true;
    }

    @Override
    public boolean delete(Etudiant o) {
        return etudiants.remove(o);
    }



    @Override
    public Etudiant findById(int id) {
        for(Etudiant e:etudiants) {
            if(e.getId()==id)
                return e;
        }
        return null;
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiants;
    }


}
