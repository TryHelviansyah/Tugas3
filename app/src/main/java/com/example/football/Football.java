package com.example.football;

public class Football {
    String nameTeam, detailTeam;
    int imageTeam, championTeam;

    public int getImageTeam() {
        return imageTeam;
    }

    public void setImageTeam(int imageTeam) {
        this.imageTeam = imageTeam;
    }

    public Football(String nameTeam, String detailTeam, int imageTeam, int championTeam) {
        this.nameTeam = nameTeam;
        this.detailTeam = detailTeam;
        this.imageTeam = imageTeam;
        this.championTeam = championTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public String getDetailTeam() {
        return detailTeam;
    }

    public void setDetailTeam(String detailTeam) {
        this.detailTeam = detailTeam;
    }

    public int getChampionTeam() {
        return championTeam;
    }

    public void setChampionTeam(int championTeam) {
        this.championTeam = championTeam;
    }
}
