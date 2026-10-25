package es.medac.pedroeduardodelapuenterodriguez.chamaquitos;

import android.os.Bundle;
import android.webkit.WebSettings;

import androidx.appcompat.app.AppCompatActivity;

import es.medac.pedroeduardodelapuenterodriguez.chamaquitos.databinding.ActivityInicioBinding;

public class InicioActivity extends AppCompatActivity {

    private ActivityInicioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInicioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WebSettings settings = binding.webviewLogin.getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);

        binding.webviewLogin.loadUrl("file:///android_asset/chamaquitos_login.html");
    }
}