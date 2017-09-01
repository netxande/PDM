package br.edu.ifpb.pdm;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //atributo da classe.
    private AlertDialog alerta;
    private ImageButton ibAmarelo, ibAzul, ibRoxo, ibPreto, ibCinza, ibBranco, ibMarrom, ibLaranja, ibVerde, ibVermelho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setReferencias();
        this.setListeners();
    }

    public void setReferencias(){
        this.ibAmarelo = (ImageButton) findViewById(R.id.ibAmarelo);
        this.ibAzul = (ImageButton) findViewById(R.id.ibAzul);
        this.ibRoxo = (ImageButton) findViewById(R.id.ibRoxo);
        this.ibPreto = (ImageButton) findViewById(R.id.ibPreto);
        this.ibCinza = (ImageButton) findViewById(R.id.ibCinza);
        this.ibMarrom = (ImageButton) findViewById(R.id.ibMarrom);
        this.ibLaranja = (ImageButton) findViewById(R.id.ibLaranja);
        this.ibBranco = (ImageButton) findViewById(R.id.ibBranco);
        this.ibVerde = (ImageButton) findViewById(R.id.ibVerde);
        this.ibVermelho = (ImageButton) findViewById(R.id.ibVermelho);
    }

    public void setListeners(){
        this.ibAmarelo.setOnClickListener(new ImageButtonClickListener());
        this.ibAzul.setOnClickListener(new ImageButtonClickListener());
        this.ibRoxo.setOnClickListener(new ImageButtonClickListener());
        this.ibPreto.setOnClickListener(new ImageButtonClickListener());
        this.ibCinza.setOnClickListener(new ImageButtonClickListener());
        this.ibMarrom.setOnClickListener(new ImageButtonClickListener());
        this.ibLaranja.setOnClickListener(new ImageButtonClickListener());
        this.ibBranco.setOnClickListener(new ImageButtonClickListener());
        this.ibVerde.setOnClickListener(new ImageButtonClickListener());
        this.ibVermelho.setOnClickListener(new ImageButtonClickListener());

        this.ibAmarelo.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibAzul.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibRoxo.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibPreto.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibCinza.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibMarrom.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibLaranja.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibBranco.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibVerde.setOnLongClickListener(new ImageButtonLongClickListener());
        this.ibVermelho.setOnLongClickListener(new ImageButtonLongClickListener());
    }


    private class ImageButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent it = new Intent(MainActivity.this, ListaActivity.class);

            if(v.equals(MainActivity.this.ibAmarelo)){
                Log.i("COLETA", "Amarelo");;
                it.putExtra("tipo", "amarelo");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibAzul)){
                Log.i("COLETA", "Azul");
                it.putExtra("tipo", "azul");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibBranco)){
                Log.i("COLETA", "Branco");
                it.putExtra("tipo", "branco");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibCinza)){
                Log.i("COLETA", "Cinza");
                it.putExtra("tipo", "cinza");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibLaranja)){
                Log.i("COLETA", "laranja");
                it.putExtra("tipo", "laranja");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibMarrom)){
                Log.i("COLETA", "Marrom");
                it.putExtra("tipo", "marrom");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibPreto)){
                Log.i("COLETA", "Preto");
                it.putExtra("tipo", "preto");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibRoxo)){
                Log.i("COLETA", "Roxo");
                it.putExtra("tipo", "roxo");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibVerde)){
                Log.i("COLETA", "verde");
                it.putExtra("tipo", "verde");
                startActivity(it);
            }else if(v.equals(MainActivity.this.ibVermelho)){
                Log.i("COLETA", "Vermelho");
                it.putExtra("tipo", "vermelho");
                startActivity(it);
            }
        }
    }

    private class ImageButtonLongClickListener implements OnLongClickListener{
        @Override
        public boolean onLongClick(View v) {
//            if(v.equals(MainActivity.this.ibAmarelo)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo AMARELO",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibAzul)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo AZUL",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibBranco)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo BRANCO",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibCinza)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo CINZA",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibLaranja)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo LARANJA",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibMarrom)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo MARROM",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibPreto)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo PRETO",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibRoxo)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo ROXO",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibVerde)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo VERDE",
//                        Toast.LENGTH_LONG).show();
//            }else if(v.equals(MainActivity.this.ibVermelho)){
//                Toast.makeText(MainActivity.this, "Locais para Coleta Seletiva de lixo do tipo VERMELHO",
//                        Toast.LENGTH_LONG).show();
//            }
//
//            return true;

            if(v.equals(MainActivity.this.ibAmarelo)){
                alerta("          AMARELO:\n\n\n\n","     Metal");

            }else if(v.equals(MainActivity.this.ibAzul)){
                alerta("          AZUL:\n\n\n\n","     Papel/Papelão");
            }else if(v.equals(MainActivity.this.ibBranco)){
                alerta("          BRANCO:\n\n\n\n","     Ambulatórios ou de serviços de saúde");
            }else if(v.equals(MainActivity.this.ibCinza)){
                alerta("          CINZA:\n\n\n\n","     Resíduos geral não reciclável ou misturado");
            }else if(v.equals(MainActivity.this.ibLaranja)){
                alerta("          LARANJA:\n\n\n\n","     Perigosos ou contaminados");
            }else if(v.equals(MainActivity.this.ibMarrom)){
                alerta("          MARROM:\n\n\n\n","     Orgânicos, como restos de alimento");
            }else if(v.equals(MainActivity.this.ibPreto)){
                alerta("          PRETO:\n\n\n\n","     Madeira");
            }else if(v.equals(MainActivity.this.ibRoxo)){
                alerta("          ROXO:\n\n\n\n","     Radioativos");
            }else if(v.equals(MainActivity.this.ibVerde)){
                alerta("          VERDE:\n\n\n\n","     Vidro");
            }else if(v.equals(MainActivity.this.ibVermelho)){
                alerta("          VERMELHO:\n\n\n\n","     Plástico, isopor");
            }

            return true;
        }
    }

    private void alerta(String titulo, String descricao) {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle(titulo);
        //define a mensagem
        builder.setMessage(descricao);
        //define um botão como positivo
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                arg0.cancel();
            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }
}
