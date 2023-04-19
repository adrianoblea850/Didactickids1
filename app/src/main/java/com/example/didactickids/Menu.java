package com.example.didactickids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentHome()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentHome()).commit();
                break;
            //case R.id.nav_crearperfil:
              //  getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentCrearCuenta()).commit();
                //break;
            //case R.id.nav_iniciarsesion:
              //  getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentIniciarSesion()).commit();
                //break;
            case R.id.nav_lecciones:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentLecciones()).commit();
                break;
            case R.id.nav_nivel:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentNivel()).commit();
                break;
            case R.id.nav_datosnino:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentDatosNino()).commit();
                break;
            case R.id.nav_leccion:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentLeccion()).commit();
                break;
            case R.id.nav_actividad:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentActividadSuma()).commit();
                break;
            case R.id.nav_nosotros:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentNosotros()).commit();
                break;
            case R.id.nav_perfil:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentPerfil()).commit();
                break;
            case R.id.nav_ajustes:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentAjustes()).commit();
                break;
            case R.id.nav_ayuda:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentAyuda()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}