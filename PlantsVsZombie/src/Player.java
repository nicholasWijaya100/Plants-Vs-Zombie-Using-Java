/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nichw
 */
public class Player {
    private String username;
    private String password;
    private String nama_asli;
    private int umur;
    private int highscore;
    private int jumlahSun = 150;

    public Player(String username, String password, String nama_asli, int umur, int highscore) {
        this.username = username;
        this.password = password;
        this.nama_asli = nama_asli;
        this.umur = umur;
        this.highscore = highscore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama_asli() {
        return nama_asli;
    }

    public void setNama_asli(String nama_asli) {
        this.nama_asli = nama_asli;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    public int getJumlahSun() {
        return jumlahSun;
    }

    public void setJumlahSun(int jumlahSun) {
        this.jumlahSun = jumlahSun;
    }
}
