package com.example.monir.educationprojet.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.monir.educationprojet.R;

public class Pdf_Activity extends AppCompatActivity {
   // private PDFView pdfView;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_);
        webView = (WebView) findViewById(R.id.webviews);


       // pdfView=findViewById(R.id.pdfView);


        Intent intent=getIntent();

        String name = intent.getStringExtra("pdfUrl");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(name);
        //webView.loadUrl(name);

        //pdf view er jonno..........
       // pdfView.fromAsset(name+".pdf").load();

        //web view er jonno............
//        Intent jone=new Intent(Intent.ACTION_VIEW, Uri.parse(name));
//
//        startActivity(intent);

    }
}
