package tamlumusic.tabit;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;

import jp.wasabeef.blurry.Blurry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //blur background
        Blurry.with(MainActivity.this)
                .radius(10)
                .sampling(8)
                .color(Color.argb(66, 255, 255, 0))
                .async()
                .onto((RelativeLayout) findViewById(R.id.rootRL));



        //set font
        //Typeface catamaran_reg = Typeface.createFromAsset(getAssets(), "fonts/Catamaran-Regular.ttf");
        //Typeface catamaran_bold = Typeface.createFromAsset(getAssets(), "fonts/Catamaran-Bold.ttf");
        //bold text
        String sourceString = "<b>" + "Tab" + "</b>" + "Reader";
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(Html.fromHtml(sourceString));
       // title.setTypeface(catamaran_reg);
        //animation
        final Animation in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(3000);
        title.startAnimation(in);


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
