package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spnWebsite;
    WebView wvDisplay;

    //ArrayList<String> alWeb;
    //ArrayAdapter<String> aaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnWebsite = findViewById(R.id.SpinnerPick);
        wvDisplay = findViewById(R.id.webViewPage);
        wvDisplay.setWebViewClient(new WebViewClient());

        spnWebsite.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        String url = "https://www.google.com.sg";
                        wvDisplay.loadUrl(url);
                        break;

                    case 1:
                        String url1 = "https://www.rp.edu.sg/soi/full-time-diplomas/details/r47";
                        wvDisplay.loadUrl(url1);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }


        });
    }
}
