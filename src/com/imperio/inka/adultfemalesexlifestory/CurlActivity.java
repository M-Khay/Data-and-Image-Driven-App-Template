package com.imperio.inka.adultfemalesexlifestory;

import com.startapp.android.publish.StartAppAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.Window;
import android.view.WindowManager;

public class CurlActivity extends Activity {

	private static int counterStartAppAd;
	private CurlView mCurlView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
		counterStartAppAd =0;
		int index = 0;
		if (getLastNonConfigurationInstance() != null) {
			index = (Integer) getLastNonConfigurationInstance();
		}
		Main.ma.callVideoAd();

		mCurlView = (CurlView) findViewById(R.id.curl);
		mCurlView.setPageProvider(new PageProvider());
		mCurlView.setSizeChangedObserver(new SizeChangedObserver());
		mCurlView.setCurrentIndex(index);

		// mCurlView.setBackgroundColor(0xFF202830);
		// mCurlView.setBackgroundResource(R.drawable.a);
		// This is something somewhat experimental. Before uncommenting next
		// line, please see method comments in CurlView.
		// mCurlView.setEnableTouchPressure(true);
	}

	@Override
	public void onPause() {
		super.onPause();
		System.out.println("In on Pause");

		Main.startAppAd.showAd();
		Main.startAppAd.loadAd();
Main.ma.callSmartWallAd();
		mCurlView.onPause();
	}

	@Override
	public void onResume() {
		super.onResume();
		System.out.println("In OnRseume");
counterStartAppAd++;
//		Main.startAppAd.showAd();
//		Main.startAppAd.loadAd();
		Main.ma.callSmartWallAd();
		mCurlView.onResume();
	}

	@Override
	public Object onRetainNonConfigurationInstance() {
		System.out.println("In onRetainNonConfiguration");
		
		return mCurlView.getCurrentIndex();
	}

	/**
	 * Bitmap provider.
	 */
	private class PageProvider implements CurlView.PageProvider {

		// Bitmap resources.
		/*
		 * private int[] mBitmapIds = { R.drawable.obama, R.drawable.road_rage,
		 * R.drawable.taipei_101, R.drawable.world };
		 * 
		 * @Override public int getPageCount() { return 5; }
		 * 
		 * private Bitmap loadBitmap(int width, int height, int index) { Bitmap
		 * b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		 * b.eraseColor(0xFFFFFFFF); Canvas c = new Canvas(b); Drawable d =
		 * getResources().getDrawable(mBitmapIds[index]);
		 * 
		 * int margin = 7; int border = 3; Rect r = new Rect(margin, margin,
		 * width - margin, height - margin);
		 * 
		 * int imageWidth = r.width() - (border * 2); int imageHeight =
		 * imageWidth * d.getIntrinsicHeight() / d.getIntrinsicWidth(); if
		 * (imageHeight > r.height() - (border * 2)) { imageHeight = r.height()
		 * - (border * 2); imageWidth = imageHeight * d.getIntrinsicWidth() /
		 * d.getIntrinsicHeight(); }
		 * 
		 * r.left += ((r.width() - imageWidth) / 2) - border; r.right = r.left +
		 * imageWidth + border + border; r.top += ((r.height() - imageHeight) /
		 * 2) - border; r.bottom = r.top + imageHeight + border + border;
		 * 
		 * Paint p = new Paint(); p.setColor(0xFFC0C0C0); c.drawRect(r, p);
		 * r.left += border; r.right -= border; r.top += border; r.bottom -=
		 * border;
		 * 
		 * d.setBounds(r); d.draw(c);
		 * 
		 * return b;
		 */

		// String
		// data[]={"Does Your Woman Masturbate? /nShe may never fess up to this taboo, but your woman is probably not master of her domain. Find out why and how she pleasures herself.",
		// "Self pleasure /nStatistics show that 60% of women admit to masturbating. Notice I wrote, �admit?� That's because statistics are about as believable as OJ on the stand. But for the sake of stats, here goes: 20% of women under 30 years of age masturbate once a week, and 7% do it every other day. As well, females, on average, begin masturbating at about 14 or 15 years old.",
		// " So why don't all women masturbate? Simply put, they don't have to. For the most part, women can basically bed a man as quickly and easily as Roseanne can gobble down a tub of Haagen Dazs. Albeit, the less attractive women will have to lower their standards, but penises have been offered to all women from the moment they hit adolescence.",
		// "Guys, on the other hand, have to spend the majority of their lives pursuing women and trying to score sex, therefore masturbation becomes somewhat necessary for survival. So one would think that masturbation for women is optional, and not necessary. But is it? Perhaps if more women took the time to explore their own bodies, they'd discover their sexual likes and dislikes and be able to achieve orgasm more easily."};

		private int[] mBitmapIds = { R.layout.a1, R.layout.b1, R.layout.c1,
				R.layout.d1, R.layout.e1, R.layout.f1, R.layout.g1,
				R.layout.h1, R.layout.i1, R.layout.j1,

				R.layout.k1, R.layout.l1, R.layout.m1, R.layout.n1,
				R.layout.o1, R.layout.p1, R.layout.q1, R.layout.r1,
				R.layout.s1, R.layout.t1, R.layout.u1, R.layout.v1,
				R.layout.w1,
		/*
		 * R.layout.x1, R.layout.y1, R.layout.y2, R.layout.y3, R.layout.y4,
		 * R.layout.y5, R.layout.y6, R.layout.y7, R.layout.y8, R.layout.y9,
		 * R.layout.z1, R.layout.z2, R.layout.z3, R.layout.z4, R.layout.z5,
		 * R.layout.z6, R.layout.z7, R.layout.z8, R.layout.z9, R.layout.zz1,
		 * R.layout.zz2, R.layout.zz3
		 */};

		@Override
		public int getPageCount() {
			return 23;
		}

		private Bitmap loadBitmap(int width, int height, int index) {
			LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			System.out.println("In Load Bitmap");
			Main.ma.callSmartWallAd();

//			Main.startAppAd.showAd();
//			Main.startAppAd.loadAd();
			View v = inflater.inflate(mBitmapIds[index], null);
			v.measure(MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
					MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY));
			v.layout(0, 0, v.getMeasuredWidth(), v.getMeasuredHeight());
			Bitmap b = Bitmap.createBitmap(v.getWidth(), v.getHeight(),
					Bitmap.Config.ARGB_8888);
			Canvas c = new Canvas(b);
			v.draw(c);

			System.out.println("the counter is "+counterStartAppAd);
			if(counterStartAppAd>2)
{
	System.out.println("the counter inside  is "+counterStartAppAd);
	Main.startAppAd.showAd();
	counterStartAppAd=0;
	
}
			return b;
		}

		@Override
		public void updatePage(CurlPage page, int width, int height, int index) {
			switch (index) {
			// First case is image on front side, solid colored back.
			case 0: {
				Bitmap front = loadBitmap(width, height, 0);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);

				break;
			}
			// Second case is image on back side, solid colored front.
			case 1: {
				Bitmap front = loadBitmap(width, height, 1);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				break;
			}
			// Third case is images on both sides.
			case 2: {
				Bitmap front = loadBitmap(width, height, 2);
				// Bitmap back = loadBitmap(width, height, 3);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				// page.setTexture(back, CurlPage.SIDE_BACK);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				break;
			}
			// Fourth case is images on both sides - plus they are blend against
			// separate colors.
			case 3: {
				Bitmap front = loadBitmap(width, height, 3);
				// Bitmap back = loadBitmap(width, height, 1);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setTexture(back, CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 170, 130, 255),
				// CurlPage.SIDE_FRONT);
				// page.setColor(Color.rgb(255, 190, 150), CurlPage.SIDE_BACK);
				break;
			}
			// Fifth case is same image is assigned to front and back. In this
			// scenario only one texture is used and shared for both sides.
			case 4: {
				Bitmap front = loadBitmap(width, height, 4);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}

			case 5: {
				Bitmap front = loadBitmap(width, height, 5);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);

				break;
			}
			// Second case is image on back side, solid colored front.
			case 6: {
				Bitmap front = loadBitmap(width, height, 6);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				break;
			}
			// Third case is images on both sides.
			case 7: {
				Bitmap front = loadBitmap(width, height, 7);
				// Bitmap back = loadBitmap(width, height, 3);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				// page.setTexture(back, CurlPage.SIDE_BACK);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				break;
			}
			// Fourth case is images on both sides - plus they are blend against
			// separate colors.
			case 8: {
				Bitmap front = loadBitmap(width, height, 8);
				// Bitmap back = loadBitmap(width, height, 1);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setTexture(back, CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 170, 130, 255),
				// CurlPage.SIDE_FRONT);
				// page.setColor(Color.rgb(255, 190, 150), CurlPage.SIDE_BACK);
				break;
			}
			// Fifth case is same image is assigned to front and back. In this
			// scenario only one texture is used and shared for both sides.
			case 9: {
				Bitmap front = loadBitmap(width, height, 9);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 10: {
				Bitmap front = loadBitmap(width, height, 10);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 11: {
				Bitmap front = loadBitmap(width, height, 11);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				break;
			}
			// Third case is images on both sides.
			case 12: {
				Bitmap front = loadBitmap(width, height, 12);
				// Bitmap back = loadBitmap(width, height, 3);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				// page.setTexture(back, CurlPage.SIDE_BACK);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				break;
			}
			// Fourth case is images on both sides - plus they are blend against
			// separate colors.
			case 13: {
				Bitmap front = loadBitmap(width, height, 13);
				// Bitmap back = loadBitmap(width, height, 1);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setTexture(back, CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 170, 130, 255),
				// CurlPage.SIDE_FRONT);
				// page.setColor(Color.rgb(255, 190, 150), CurlPage.SIDE_BACK);
				break;
			}
			// Fifth case is same image is assigned to front and back. In this
			// scenario only one texture is used and shared for both sides.
			case 14: {
				Bitmap front = loadBitmap(width, height, 14);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 15: {
				Bitmap front = loadBitmap(width, height, 15);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);

				break;
			}
			case 16: {
				Bitmap front = loadBitmap(width, height, 16);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 17: {
				Bitmap front = loadBitmap(width, height, 17);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);

				break;
			}

			case 18: {
				Bitmap front = loadBitmap(width, height, 18);
				// Bitmap back = loadBitmap(width, height, 1);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setTexture(back, CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 170, 130, 255),
				// CurlPage.SIDE_FRONT);
				// page.setColor(Color.rgb(255, 190, 150), CurlPage.SIDE_BACK);
				break;
			}
			// Fifth case is same image is assigned to front and back. In this
			// scenario only one texture is used and shared for both sides.
			case 19: {
				Bitmap front = loadBitmap(width, height, 19);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 20: {
				Bitmap front = loadBitmap(width, height, 20);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 21: {
				Bitmap front = loadBitmap(width, height, 21);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 22: {
				Bitmap front = loadBitmap(width, height, 22);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 23: {
				Bitmap front = loadBitmap(width, height, 23);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 24: {
				Bitmap front = loadBitmap(width, height, 24);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 25: {
				Bitmap front = loadBitmap(width, height, 25);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 26: {
				Bitmap front = loadBitmap(width, height, 26);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 27: {
				Bitmap front = loadBitmap(width, height, 27);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 28: {
				Bitmap front = loadBitmap(width, height, 28);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 29: {
				Bitmap front = loadBitmap(width, height, 29);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 30: {
				Bitmap front = loadBitmap(width, height, 30);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 31: {
				Bitmap front = loadBitmap(width, height, 31);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 32: {
				Bitmap front = loadBitmap(width, height, 32);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 33: {
				Bitmap front = loadBitmap(width, height, 33);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 34: {
				Bitmap front = loadBitmap(width, height, 34);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 35: {
				Bitmap front = loadBitmap(width, height, 35);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 36: {
				Bitmap front = loadBitmap(width, height, 36);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 37: {
				Bitmap front = loadBitmap(width, height, 37);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 38: {
				Bitmap front = loadBitmap(width, height, 38);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 39: {
				Bitmap front = loadBitmap(width, height, 39);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 40: {
				Bitmap front = loadBitmap(width, height, 40);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 41: {
				Bitmap front = loadBitmap(width, height, 41);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 42: {
				Bitmap front = loadBitmap(width, height, 42);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 43: {
				Bitmap front = loadBitmap(width, height, 43);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			case 44: {
				Bitmap front = loadBitmap(width, height, 44);
				page.setTexture(front, CurlPage.SIDE_FRONT);
				page.setColor(Color.rgb(0, 0, 0), CurlPage.SIDE_BACK);
				// page.setColor(Color.argb(127, 255, 255, 255),
				// CurlPage.SIDE_BACK);
				break;
			}
			}
		}

	}

	/**
	 * CurlView size changed observer.
	 */
	private class SizeChangedObserver implements CurlView.SizeChangedObserver {
		@Override
		public void onSizeChanged(int w, int h) {
			if (w > h) {
				mCurlView.setViewMode(CurlView.SHOW_TWO_PAGES);
				mCurlView.setMargins(.01f, .005f, .01f, .005f);
			} else {
				mCurlView.setViewMode(CurlView.SHOW_ONE_PAGE);
				mCurlView.setMargins(.01f, .01f, .01f, .01f);
			}
		}
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		System.out.println("2 Hell is here");
		Main.ma.callVideoAd();

		Main.startAppAd.showAd();
		Main.startAppAd.loadAd();

		super.onBackPressed();
	}

}