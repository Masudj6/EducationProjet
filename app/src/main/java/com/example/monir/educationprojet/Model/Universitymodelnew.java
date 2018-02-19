package com.example.monir.educationprojet.Model;

/**
 * Created by Monir on 1/11/2018.
 */

public class Universitymodelnew {
    private  String universityUnit;
    private  String pdfUrl;

    public Universitymodelnew(String universityUnit, String pdfUrl) {
        this.universityUnit = universityUnit;
        this.pdfUrl = pdfUrl;
    }

    public String getUniversityUnit() {
        return universityUnit;
    }

    public void setUniversityUnit(String universityUnit) {
        this.universityUnit = universityUnit;
    }

    public String getPDFName() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
