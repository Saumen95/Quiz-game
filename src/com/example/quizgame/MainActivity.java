import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity{
	public static int SPLASH_TIME_OUT = 3000;
	
	@Override
	protected void onCreate(Bundle saveInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		new Handler().postDelayed(new Runnable(){
			@Ovrride
			public void run(){
				Intent i = new Intent(MainActivity.this, Options.class);
				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);
	}
}
