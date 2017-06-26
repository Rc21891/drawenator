package reecescupsinc.drawenator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class DrawActivity extends AppCompatActivity
{
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawenator_activity);

        /*
        Toolbar mTooolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTooolbar);
        */
    }

    public boolean onCreationOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.draw_menu, menu);
        return true;
    }
}
