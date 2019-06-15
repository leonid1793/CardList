package com.tarea.cardlist;

public class item {
    int background;
    String  profileName;
    int porofilePhoto;
    int nbfollowers;

    public item() {

    }

    public item(int background, String profileName, int porofilePhoto, int nbfollowers) {
        this.background = background;
        this.profileName = profileName;
        this.porofilePhoto = porofilePhoto;
        this.nbfollowers = nbfollowers;
    }

    public int getBackground() {
        return background;
    }

    public String getProfileName() {
        return profileName;
    }

    public int getPorofilePhoto() {
        return porofilePhoto;
    }

    public int getNbfollowers() {
        return nbfollowers;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setPorofilePhoto(int porofilePhoto) {
        this.porofilePhoto = porofilePhoto;
    }

    public void setNbfollowers(int nbfollowers) {
        this.nbfollowers = nbfollowers;
    }
}
