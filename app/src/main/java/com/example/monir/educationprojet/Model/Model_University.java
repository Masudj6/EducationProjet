package com.example.monir.educationprojet.Model;

import com.example.monir.educationprojet.R;

import java.util.ArrayList;

/**
 * Created by Monir on 1/3/2018.
 */

public class Model_University {


    public Model_University() {
    }

    private String university_Name;
    private int university_Image;

    public Model_University(String university_Name, int university_Image) {
        this.university_Name = university_Name;
        this.university_Image = university_Image;
    }

    public String getUniversity_Name() {
        return university_Name;
    }

    public void setUniversity_Name(String university_Name) {
        this.university_Name = university_Name;
    }

    public int getUniversity_Image() {
        return university_Image;
    }

    public void setUniversity_Image(int university_Image) {
        this.university_Image = university_Image;
    }


public ArrayList<Model_University>getAllUniversity(){
        ArrayList<Model_University>universities=new ArrayList<>();


    universities.add(new Model_University("ঢাকা বিশ্ববিদ্যালয়",R.drawable.dhaka));
    universities.add(new Model_University("ইসলামী বিশ্ববিদ্যালয়",R.drawable.islamic));
    universities.add(new Model_University("কুমিল্লা বিশ্ববিদ্যালয়",R.drawable.cu));
    universities.add(new Model_University("খুলনা প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.khul));
    universities.add(new Model_University("খুলনা বিশ্ববিদ্যালয়",R.drawable.kuet));
    universities.add(new Model_University("চট্টগ্রাম প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.cuet));
    universities.add(new Model_University("চট্টগ্রাম বিশ্ববিদ্যালয়",R.drawable.chttogram));
    universities.add(new Model_University("জগন্নাথ বিশ্ববিদ্যালয়",R.drawable.ju));
    universities.add(new Model_University("জাতীয় কবি কাজী নজরুল ইসলাম বিশ্ববিদ্যালয়",R.drawable.knu));
    universities.add(new Model_University("জাহাঙ্গীরনগর বিশ্ববিদ্যালয়",R.drawable.ja));
    universities.add(new Model_University("ঢাকা প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.buet));
    universities.add(new Model_University("নোয়াখালী বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.nstu));
    universities.add(new Model_University("পটুয়াখালী বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.potuakhali));
    universities.add(new Model_University("পাবনা বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.psu));
    universities.add(new Model_University("বঙ্গবন্ধু শেখ মুজিবুর রহমান কৃষি বিশ্ববিদ্যালয়",R.drawable.krisiu));
    universities.add(new Model_University("বঙ্গবন্ধু শেখ মুজিবুর রহমান বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.bongobiggno));
    universities.add(new Model_University("বরিশাল বিশ্ববিদ্যালয়",R.drawable.brishal));
    universities.add(new Model_University("বাংলাদেশ ইউনিভার্সিটি অব প্রফেশনালস",R.drawable.bup));
    universities.add(new Model_University("বাংলাদেশ কৃষি বিশ্ববিদ্যালয়",R.drawable.krisiu));
    universities.add(new Model_University("বাংলাদেশ প্রকৌশল বিশ্ববিদ্যালয়",R.drawable.buet));
    universities.add(new Model_University("বেগম রোকেয়া বিশ্ববিদ্যালয়",R.drawable.rokeya));
    universities.add(new Model_University("বাংলাদেশ টেক্সটাইল বিশ্ববিদ্যালয়",R.drawable.btextile));
    universities.add(new Model_University("মাওলানা ভাসানী বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.vasani));
    universities.add(new Model_University("যশোর বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.ju));
    universities.add(new Model_University("রাজশাহী বিশ্ববিদ্যালয়",R.drawable.rajssahi));
    universities.add(new Model_University("রাজশাহী প্রকৌশল ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.ruet));
    universities.add(new Model_University("রাঙ্গামাটি বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.ruet));
    universities.add(new Model_University("শাহজালাল বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.sust));
    universities.add(new Model_University("শেরে বাংলা কৃষি বিশ্ববিদ্যালয়",R.drawable.skrisiu));
    universities.add(new Model_University("সিলেট কৃষি বিশ্ববিদ্যালয়",R.drawable.skrisiu));
    universities.add(new Model_University("হাজী মোহাম্মদ দানেশ বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়",R.drawable.hstu));
    return universities;


}

}
