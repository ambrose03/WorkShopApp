package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "KXEbDXQUWRfmdcou91mib18daxfs5iocneUGGxVJ",
				"uBNjEW9jHViVsRp79mvCU4L5KpCqZglrwtDjSAuq");
	}
}
