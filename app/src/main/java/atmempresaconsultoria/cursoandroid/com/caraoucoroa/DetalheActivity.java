package atmempresaconsultoria.cursoandroid.com.caraoucoroa;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView botaoVoltar;
    private ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Bundle extra = getIntent().getExtras();

        moeda = (ImageView) findViewById(R.id.moedaId);
        if (extra.getString("opcao").equals("cara")){
            moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
        }else{
            moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
        }

        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
