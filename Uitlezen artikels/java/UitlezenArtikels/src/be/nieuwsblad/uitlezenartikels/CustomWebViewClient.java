package be.nieuwsblad.uitlezenartikels;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Klasse die van WebViewClient overerft
 * 
 * Klikken op een link in een webview-object opent altijd een externe browser
 * Door onze eigen Webviewer te schrijven kunnen we dit overrulen
 * 
 * @author Kurt
 * @version 1.0
 *
 */

public class CustomWebViewClient extends WebViewClient {

	/**
	 * Eigen implementatie van WebViewClient. 
	 * Wanneer we op een link klikken blijven we in de webview en openen we geen externe browser
	 */
	@Override
	public boolean shouldOverrideUrlLoading(WebView mijnWebView, String url){
		mijnWebView.loadUrl(url);
		return true;
	}
	
}
