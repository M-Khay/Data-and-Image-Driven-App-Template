package com.imperio.inka.adultfemalesexlifestory;

import android.content.Context;
import android.content.SharedPreferences;

public class Rating
{
	final String FILE = "rating";
	final String FIELD = "israted";

	protected boolean isRated(Context context) {
		SharedPreferences preferences = context.getSharedPreferences(FILE,
				Context.MODE_WORLD_READABLE);
		if (preferences.contains(FIELD))
			return preferences.getBoolean(FIELD, false);
		else
			return false;
	}
	protected boolean setRated(Context context, boolean israted ) {
		SharedPreferences preferences=context.getSharedPreferences(FILE, Context.MODE_WORLD_WRITEABLE);
		SharedPreferences.Editor editor=preferences.edit();
		editor.putBoolean(FIELD, israted);
		return editor.commit();
	}
	
}
		