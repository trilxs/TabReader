package tamlumusic.tabit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
    }

    public void InformationButtonClick() {
        Intent intent = new Intent(getApplicationContext(), VideoInformation.class);
        startActivity(intent);
    }
}
