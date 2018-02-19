package co.xkirox.fragmentsdinamicos;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FragmentUno.OnFragmentInteractionListener, FragmentDos.OnFragmentInteractionListener {

    Button btnFragUno;
    Button btnFragDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentUno fragmentUno = new FragmentUno();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmentUno);

        FragmentDos fragmentDos = new FragmentDos();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmentDos);

        btnFragUno = (Button) findViewById(R.id.btnFragUno);
        btnFragDos = (Button) findViewById(R.id.btnFragDos);

        btnFragUno.setOnClickListener(this);
        btnFragDos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFragUno:
                FragmentUno fragmentUno = new FragmentUno();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contenedor,fragmentUno);
                fragmentTransaction.commit();
                break;

            case R.id.btnFragDos:
                FragmentDos fragmentDos = new FragmentDos();
                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.contenedor,fragmentDos);
                fragmentTransaction2.commit();
                break;

                default:
        }


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
