package mz.co.phaseoneadela

import android.annotation.SuppressLint
import android.net.http.SslError
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about_alc.*


class AboutALC : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)

        //WebView
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

        webView.setWebViewClient(object : WebViewClient() {
            override fun onReceivedSslError(v: WebView, handler: SslErrorHandler, er: SslError) {
                handler.proceed()
            }
        })

        webView.loadUrl("https://andela.com/alc/")

    }
}
