package br.edu.ifpb.pdm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {
    private ListView lvListaLocal;
    protected ArrayList<Local> locais, locaisCorEspecifica;
    protected Local l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    protected String tipo;

    public ListaActivity(){
        this.locais = new ArrayList<Local>();
        this.locaisCorEspecifica = new ArrayList<Local>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        this.inicializandoLocais();
        this.addLocaisLista();

        Intent it = this.getIntent();
        tipo = it.getStringExtra("tipo");
        Log.i("COLETA", "Tipo selecionada: " + tipo);
        this.addLocaisCorEspecifica(tipo);

        this.lvListaLocal = (ListView) findViewById(R.id.lvListaLocal);
        this.lvListaLocal.setOnItemClickListener(new ListaClickListener());
        LocalAdapter adapter = new LocalAdapter(this.locaisCorEspecifica, this);
        this.lvListaLocal.setAdapter(adapter);

    }

    private class ListaClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Local local = (Local) parent.getAdapter().getItem(position);
            Log.i("COLETA", "A view selecionada foi: " + local);

            //Uri uri = Uri.parse(local.getLocalizacao());
            Uri uri = Uri.parse("geo:-7.1181783, -34.8730402");
            //Uri uri = Uri.parse("geo:-7.16421395,-34.83650923");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(it);
        }
    }


    public void inicializandoLocais(){
        this.l1 = new Local("Rua AZUL Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "azul");
        this.l2 = new Local("Rua BRANCO Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "branco");
        this.l3 = new Local("Rua PRETO Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "preto");
        this.l4 = new Local("Rua ROXO Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "roxo");
        this.l5 = new Local("Rua VERDE Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "verde");
        this.l6 = new Local("Rua AMARELO Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "amarelo");
        this.l7 = new Local("Rua CINZA Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "cinza");
        this.l8 = new Local("Rua AZUL Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "azul");
        this.l9 = new Local("Rua PRETO Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "preto");
        this.l10 = new Local("Rua AZUL Xavier de Oliveira, n°189, Mangabeira 7, Joao Pessoa-PB",
                "geo:-7.1181783, -34.8730402", "azul");
    }
    public void addLocaisLista(){
        this.locais.add(l1);
        this.locais.add(l2);
        this.locais.add(l3);
        this.locais.add(l4);
        this.locais.add(l5);
        this.locais.add(l6);
        this.locais.add(l7);
        this.locais.add(l8);
        this.locais.add(l9);
        this.locais.add(l10);
    }

    public void addLocaisCorEspecifica(String tipo){
       for(Local local: this.locais){
           if(local.getTipo().equals(tipo)){
                this.locaisCorEspecifica.add(local);
           }
       }
    }
}
