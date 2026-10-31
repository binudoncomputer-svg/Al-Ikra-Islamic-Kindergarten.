package bd.alikra.school;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView web = new WebView(this);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("file:///android_asset/index.html");
        setContentView(web);
    }
    @Override public void onBackPressed() {
        WebView web = (WebView) findViewById(android.R.id.content).getRootView();
        super.onBackPressed();
    }
}
