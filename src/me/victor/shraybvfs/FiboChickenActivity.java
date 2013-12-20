package me.victor.shraybvfs;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class FiboChickenActivity  extends Activity {

	private WebView mWebview ;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mWebview  = new WebView(this);
		mWebview.getSettings().setJavaScriptEnabled(true);
		final Activity activity = this;

		mWebview.setWebViewClient(new WebViewClient() {
			public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
				Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
			}
		});

		mWebview .loadUrl("http://www.frango.org");
		setContentView(mWebview);
	}
}
