package com.example.architecturemvvm.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import com.example.architecturemvvm.R;
import com.example.architecturemvvm.databinding.ActivityMainBinding;
import com.example.architecturemvvm.viewmodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// ViewModelmet à jour le Modèle
// après avoir observé les changements dans la vue
// Le modèle met également à jour la vue
// via le ViewModel
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        activityMainBinding.setViewModel(new LoginViewModel());
        activityMainBinding.executePendingBindings();
    }
    // toute modification de l'attribut toastMessage
// définie sur le bouton avec le préfixe bind
// invoque cette méthode
    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}