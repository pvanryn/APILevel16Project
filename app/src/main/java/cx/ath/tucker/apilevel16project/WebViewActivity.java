package cx.ath.tucker.apilevel16project;

/**
 * Created by vannryn on 11/17/2016.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewactivity);

        WebView webView = (WebView)
                findViewById(R.id.webview);
        webView.loadUrl("http://www.africatwin.org");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
    }
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //this method is used for adding menu items to the Activity
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_firm_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //this method is used for handling menu items' events
// Handle item selection
        switch (item.getItemId()) {

            case R.id.goBack:
                if(myWebView.canGoBack()) {
                    myWebView.goBack();
                }
                return true;

            case R.id.goForward:
                if(myWebView.canGoForward()) {
                    myWebView.goForward();
                }
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}