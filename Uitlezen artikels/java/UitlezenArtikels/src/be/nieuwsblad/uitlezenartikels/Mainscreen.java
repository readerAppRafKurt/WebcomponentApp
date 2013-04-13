package be.nieuwsblad.uitlezenartikels;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mainscreen extends Activity {

	protected WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainscreen);
		
		webView = (WebView) findViewById(R.id.browser);
		WebSettings webSettings = webView.getSettings();
		
		//Volgende lijnen zijn nodig om in android localstorage te laten werken
		webSettings.setJavaScriptEnabled(true);
		webSettings.setDomStorageEnabled(true);	
		
		//Localstorage staat nu aan maar is niet persistent
		//Wanneer de webView gesloten wordt is alles weg, daarom onderstaande code
		webSettings.setDatabaseEnabled(true);
		webSettings.setAppCacheEnabled(true); 
		String databasePath = this.getApplicationContext().getDir("database", Context.MODE_PRIVATE).getPath();  
		webSettings.setDatabasePath(databasePath); 
		
		webView.setWebChromeClient(new WebChromeClient() {
			@Override
		    public void onExceededDatabaseQuota(String url, String databaseIdentifier, long currentQuota, long estimatedSize,
		        long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater) {
		        quotaUpdater.updateQuota(estimatedSize * 2);
		    }
	
	    });
	
		webView.setWebViewClient(new WebViewClient() {
	        @Override
	        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl)
	        {
	            // Handle the error
	        }
	
	        @Override
	        public boolean shouldOverrideUrlLoading(WebView view, String url)
	        {
	            view.loadUrl(url);
	            return true;
	        }
	    });
	     
		//webView.loadUrl("http://appcache-demo.s3-website-us-east-1.amazonaws.com/localstorage-cache/articles/1.html");
		//webView.loadUrl("http://www.wtcdeberggeiten.be/nieuwsblad11.6");
		//webView.loadUrl("http://www.mofosounds.com/nieuwsblad11.6/index.html");
		webView.loadUrl("http://www.mofosounds.com/nieuwsblad/uitlezen-artikels");
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainscreen, menu);
		return true;
	}

}
