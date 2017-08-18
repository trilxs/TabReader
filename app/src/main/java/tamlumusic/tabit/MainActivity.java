package tamlumusic.tabit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void VideosButtonClick(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Videos.class);
        startActivity(intent);
    }


    public void LocalButtonClick(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Local.class);
        startActivity(intent);
    }
}
