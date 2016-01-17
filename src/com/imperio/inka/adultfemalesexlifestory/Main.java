package com.imperio.inka.adultfemalesexlifestory;

import com.hrexpf.apbveb181514.MA;
import com.startapp.android.publish.StartAppAd;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Main extends Activity {
	ImageView im;

	public static StartAppAd startAppAd;
	public static MA ma;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.m);

		StartAppAd.init(this, "104445637", "205721802");
		startAppAd = new StartAppAd(this);
		startAppAd.showAd();
		startAppAd.loadAd();
		if (ma == null)
			ma = new MA(this, null, false); 

		ma.callSmartWallAd();
		im = (ImageView) findViewById(R.id.image1);

		Thread t = new Thread() {
			public void run() {

				try {
					Thread.sleep(2000);

					Intent i = new Intent(getApplicationContext(),
							CurlActivity.class);
					startActivity(i);
					finish();

				} catch (Exception e) {

					e.printStackTrace();
				}

			}
		};
		t.start();

		/*
		 * im.setOnClickListener(new OnClickListener() { public void
		 * onClick(View v) { // your code here Intent nextScreen = new
		 * Intent(Main.this,CurlActivity.class);
		 * 
		 * startActivity(nextScreen);
		 * 
		 * } });
		 */
	}

	/*
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { MenuInflater
	 * inflater = getMenuInflater(); inflater.inflate(R.menu.puzzle_main_menu,
	 * menu); return true; }
	 */

	/*
	 * private void RateDialog() { AlertDialog.Builder builder = new
	 * AlertDialog.Builder(Main.this); builder.setTitle("Rate me in market");
	 * builder.setMessage(R.string.rate_msg); builder.setCancelable(true);
	 * builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
	 * public void onClick(DialogInterface dialog, int which) { Uri marketUri =
	 * Uri .parse("https://play.google.com/store/apps/details?id=" +
	 * getPackageName()); Intent marketIntent = new Intent(Intent.ACTION_VIEW,
	 * marketUri); startActivity(marketIntent); new Rating().setRated(Main.this,
	 * true); } }); builder.setNegativeButton("Cancel", new
	 * DialogInterface.OnClickListener() { public void onClick(DialogInterface
	 * dialog, int which) { dialog.dismiss(); } }); builder.show(); }
	 */
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		startAppAd.onBackPressed();
		ma.callVideoAd();
		super.onBackPressed();
	}

}