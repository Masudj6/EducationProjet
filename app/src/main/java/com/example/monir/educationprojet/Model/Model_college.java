package com.example.monir.educationprojet.Model;

import java.util.ArrayList;

/**
 * Created by Monir on 1/4/2018.
 */

public class Model_college  {
    private String college_name;

    public Model_college() {
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public Model_college(String college_name) {
        this.college_name = college_name;
    }

    public  ArrayList<Model_college>getAllCollege(){

     ArrayList<Model_college>collegeslist=new ArrayList<>();
     collegeslist.add(new Model_college("রাজউক উত্তরা মডেল কলেজ, উত্তরা, ঢাকা"));
     collegeslist.add(new Model_college("আবদুল কাদির মোল্লা সিটি কলেজ, নরসিংদী"));
     collegeslist.add(new Model_college("আদমজী ক্যান্টনমেন্ট কলেজ, ঢাকা"));
     collegeslist.add(new Model_college("ন্যাশনাল আইডিয়াল কলেজ, খিলগাঁও, ঢাকা"));
     collegeslist.add(new Model_college("ভিকারুননিসা নূন কলেজ, রমনা, ঢাকা"));
     collegeslist.add(new Model_college("নটর ডেম কলেজ, মতিঝিল, ঢাকা"));
     collegeslist.add(new Model_college("শামসুল হক খান স্কুল অ্যান্ড কলেজ, ডেমরা, ঢাকা"));
     collegeslist.add(new Model_college("মাইলস্টোন কলেজ, উত্তরা, ঢাকা"));
     collegeslist.add(new Model_college(" ড. মাহবুবুর রহমান মোল্লা কলেজ, ডেমরা, ঢাকা"));
     collegeslist.add(new Model_college("কিংস কলেজ, গুলশান, ঢাকা"));
     collegeslist.add(new Model_college("ক্যামব্রিয়ান কলেজ, গুলশান, ঢাকা"));
     collegeslist.add(new Model_college("রাজশাহী কলেজ, বাউলিয়া, রাজশাহী"));
     collegeslist.add(new Model_college("পাবনা ক্যাডেট কলেজ, পাবনা"));
     collegeslist.add(new Model_college("রাজশাহী ক্যাডেট কলেজ, চারঘাট, রাজশাহী"));
     collegeslist.add(new Model_college("আর্মড পুলিশ ব্যাটালিয়ন পাবলিক স্কুল অ্যান্ড কলেজ, বগুড়া"));
     collegeslist.add(new Model_college("কুমিল্লা ক্যাডেট কলেজ"));
     collegeslist.add(new Model_college("ফেনী গার্লস ক্যাডেট কলেজ"));
     collegeslist.add(new Model_college("ইস্পাহানি পাবলিক স্কুল অ্যান্ড কলেজ, কুমিল্লা"));
     collegeslist.add(new Model_college(" হাজীগঞ্জ মডেল কলেজ, চাঁদপুর"));
     collegeslist.add(new Model_college("কুমিল্লা ভিক্টোরিয়া গভ. কলেজ"));
     collegeslist.add(new Model_college(" কুমিল্লা শিক্ষা বোর্ড মডেল কলেজ"));
     collegeslist.add(new Model_college("সরকারি হাজী মুহম্মদ মুহসীন কলেজ, চট্টগ্রাম"));
     collegeslist.add(new Model_college("ইস্পাহানি পাবলিক স্কুল অ্যান্ড কলেজ, চট্টগ্রাম"));
     collegeslist.add(new Model_college(" চট্টগ্রাম সরকারি গার্লস কলেজ"));

     return collegeslist;
    }


}
