package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Djur {

    private String ID;
    @SerializedName("Name")
    private String Namn;
    private AuxData auxData;

    public class AuxData{

        private String kommentar;
        private String img;
        private String skala;

        public AuxData(String kommentar, String img, String skala){
            this.kommentar = kommentar;
            this.img = img;
            this.skala = skala;
        }


        public String getKommentar() {
            return kommentar;
        }

        public String getImg() {
            return img;
        }

        public String getSkala() {
            return skala;
        }
    }

    public String getID() {
        return ID;
    }

    public String getNamn() {
        return Namn;
    }

    public AuxData getAuxData() {
        return auxData;
    }

    public Djur(String ID, String Namn, AuxData AuxData){
        this.ID = ID;
        this.Namn = Namn;
        this.auxData = AuxData;
    }

}
