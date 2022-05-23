package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Djur {

    private String id;
    @SerializedName("name")
    private String namn;
    private Auxdata auxdata;

    public class Auxdata{

        private String kommentar;
        private String img;
        private String skala;

        public Auxdata(String kommentar, String img, String skala){
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
        return id;
    }

    public String getNamn() {
        return namn;
    }

    public Auxdata getAuxData() {
        return auxdata;
    }

    public Djur(String id, String namn, Auxdata auxdata){
        this.id = id;
        this.namn = namn;
        this.auxdata = auxdata;
    }

}
