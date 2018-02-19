package com.example.monir.educationprojet.Model;

import java.util.ArrayList;

/**
 * Created by Monir on 1/4/2018.
 */

public class Model_school {
    private String schoolpdfurl;
    private String schoolname;

    public Model_school(String schoolname,String schoolpdfurl) {
        this.schoolname = schoolname;
        this.schoolpdfurl=schoolpdfurl;

    }

    public Model_school() {
    }

    public String getSchoolpdfurl() {
        return schoolpdfurl;
    }

    public void setSchoolpdfurl(String schoolpdfurl) {
        this.schoolpdfurl = schoolpdfurl;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

 public ArrayList<Model_school>getAllSchool(){

      ArrayList<Model_school>schoolList=new ArrayList<>();

      schoolList.add(new Model_school("নওয়াব হাবিবুল্লাহ মডেল স্কুল এন্ড কলেজ, উত্তরা সেক্টর ৪",

              "https://stackoverflow.com/" +
              "questions/2201917/" +
              "how-can-i-open-a-url-in-androids-web-browser-from-my-application"));


     schoolList.add(new Model_school("অক্সফোর্ড ইন্টারন্যাশনাল স্কুল ধানমন্ডি, ধানমন্ডি","https://www.androidhive" +
             ".info/2016/12/android-working-with-webview-building-a-simple-in-app-browser/"));
     schoolList.add(new Model_school("ইউরোপিয়ান ইউনিভার্সিটি অব বাংলাদেশ মোহাম্মদপুর, শ্যামলী","a"));
     schoolList.add(new Model_school("ড্যাফোডিল ইন্টারন্যাশনাল স্কুল ধানমন্ডি, ধানমন্ডি","a"));
     schoolList.add(new Model_school(" ইস্কাটন গার্ডেন উচ্চ বিদ্যালয় রমনা, রমনা","a"));
     schoolList.add(new Model_school("ডন গ্রামার স্কুল গুলশান, গুলশান ২","a"));
     schoolList.add(new Model_school("মতিঝিল সরকারি বালক উচ্চ বিদ্যালয় ঢাকা, মতিঝিল","a"));
     schoolList.add(new Model_school("ঢাকা কলেজিয়েট স্কুল কোতোয়ালী, সদরঘাট","a"));
     schoolList.add(new Model_school("হলিক্রস উচ্চ বালিকা বিদ্যালয় তেজগাঁও, ফার্মগেট","a"));
     schoolList.add(new Model_school("র্ভাড ইন্টারন্যাশনাল স্কুল মোহাম্মদপুর, আসাদ এভিনিউ","a"));
     schoolList.add(new Model_school("আদমজী ক্যান্টনমেন্ট পাবলিক স্কুল ক্যান্টনমেন্ট, ক্যান্টনমেন্ট","a"));
     schoolList.add(new Model_school("বাড্ডা উচ্চ বিদ্যালয় বাড্ডা, মধ্যবাড্ডা","a"));
     schoolList.add(new Model_school("  বাড্ডা বালিকা উচ্চ বিদ্যালয় বাড্ডা, বাড্ডা","a"));
     schoolList.add(new Model_school("ধানমন্ডি গভ:মেন্ট বয়েজ’স হাই স্কুল ধানমন্ডি, ধানমন্ডি","a"));
     schoolList.add(new Model_school(" ধানমন্ডি গভ:মেন্ট গার্লস হাই স্কুল ধানমন্ডি, ধানমন্ডি","a"));
     schoolList.add(new Model_school(" সেন্ট জোসেফ হাই স্কুল মোহাম্মদপুর, আসাদ গেট","a"));
     schoolList.add(new Model_school("ক্যামব্রিজ ইন্টারন্যাশনাল স্কুল ধানমন্ডি, ধানমন্ডি","a"));
     schoolList.add(new Model_school(" কসমিক ইন্টারন্যাশনাল স্কুল গুলশান, বনানী","a"));
     schoolList.add(new Model_school("ড্যাফোডিল ইন্টারন্যাশনাল স্কুল ধানমন্ডি, ধানমন্ডি","a"));
     schoolList.add(new Model_school("ইস্কাটন গার্ডেন উচ্চ বিদ্যালয় রমনা, রমনা","a"));
     schoolList.add(new Model_school("হলি চাইল্ড ইন্টারন্যাশনাল স্কুল উত্তরা, সেক্টর ৩","a"));
     schoolList.add(new Model_school("গুলশান ইন্টারন্যাশনাল স্কুল গুলশান, গুলশান ১","a"));
     schoolList.add(new Model_school("ওয়েস্ট ইন্ড হাই স্কুল লালবাগ, আজিমপুর","a"));
     schoolList.add(new Model_school("সানরাইজ প্রি-ক্যাডেট স্কুল এন্ড কলেজ উত্তরা, সেক্টর ০১","a"));




     return schoolList;
    }
}
