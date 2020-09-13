package com.my.newproject292;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.content.Context;
import android.os.Vibrator;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import android.content.SharedPreferences;
import android.view.View;

public class MainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private double kayanyer = 0;
	private double veri01 = 0;
	private double kaykay = 0;
	private String derece = "";
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout basinc;
	private LinearLayout kayan;
	private LinearLayout linear14;
	private LinearLayout linear16;
	private TextView textview1;
	private TextView textview5;
	private TextView xx;
	private TextView textview6;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private TextView textview11;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear25;
	private Button ayar;
	private Button saat1;
	private Button button45;
	private Button button6;
	private Button hesap;
	private Button button3;
	private Button kumanda;
	private Button playstore;
	private Button button12;
	private Button rehber;
	private Button button31;
	private Button harita;
	private Button mesaj;
	private Button button44;
	private Button button19;
	private Button button18;
	private LinearLayout linear11;
	private LinearLayout linear21;
	private HorizontalScrollView hscroll3;
	private LinearLayout linear26;
	private Button button4;
	private Button photomath;
	private Button button8;
	private Button button7;
	private Button button43;
	private Button button41;
	private Button button32;
	private Button button37;
	private Button button36;
	private Button button34;
	private Button button33;
	private Button button35;
	private Button goz;
	private Button button38;
	private Button button42;
	private Button button39;
	private Button button40;
	private Button sketch;
	private Button kernelaudor;
	private Button lukypatcher;
	private Button apkeditor;
	private LinearLayout linearkayamustbutto;
	private LinearLayout linear27;
	private Button youtube;
	private Button chrome;
	private Button whatsapp;
	private ScrollView vscroll1;
	private LinearLayout linear28;
	private EditText edittext5;
	
	private Intent i = new Intent();
	private Intent c2 = new Intent();
	private ObjectAnimator obje = new ObjectAnimator();
	private Vibrator v;
	private Calendar t1 = Calendar.getInstance();
	private TimerTask m1;
	private TimerTask m2;
	private SharedPreferences data;
	private TimerTask m3;
	private TimerTask xxxxx;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		basinc = (LinearLayout) findViewById(R.id.basinc);
		kayan = (LinearLayout) findViewById(R.id.kayan);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview5 = (TextView) findViewById(R.id.textview5);
		xx = (TextView) findViewById(R.id.xx);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview11 = (TextView) findViewById(R.id.textview11);
		hscroll2 = (HorizontalScrollView) findViewById(R.id.hscroll2);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		ayar = (Button) findViewById(R.id.ayar);
		saat1 = (Button) findViewById(R.id.saat1);
		button45 = (Button) findViewById(R.id.button45);
		button6 = (Button) findViewById(R.id.button6);
		hesap = (Button) findViewById(R.id.hesap);
		button3 = (Button) findViewById(R.id.button3);
		kumanda = (Button) findViewById(R.id.kumanda);
		playstore = (Button) findViewById(R.id.playstore);
		button12 = (Button) findViewById(R.id.button12);
		rehber = (Button) findViewById(R.id.rehber);
		button31 = (Button) findViewById(R.id.button31);
		harita = (Button) findViewById(R.id.harita);
		mesaj = (Button) findViewById(R.id.mesaj);
		button44 = (Button) findViewById(R.id.button44);
		button19 = (Button) findViewById(R.id.button19);
		button18 = (Button) findViewById(R.id.button18);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		hscroll3 = (HorizontalScrollView) findViewById(R.id.hscroll3);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		button4 = (Button) findViewById(R.id.button4);
		photomath = (Button) findViewById(R.id.photomath);
		button8 = (Button) findViewById(R.id.button8);
		button7 = (Button) findViewById(R.id.button7);
		button43 = (Button) findViewById(R.id.button43);
		button41 = (Button) findViewById(R.id.button41);
		button32 = (Button) findViewById(R.id.button32);
		button37 = (Button) findViewById(R.id.button37);
		button36 = (Button) findViewById(R.id.button36);
		button34 = (Button) findViewById(R.id.button34);
		button33 = (Button) findViewById(R.id.button33);
		button35 = (Button) findViewById(R.id.button35);
		goz = (Button) findViewById(R.id.goz);
		button38 = (Button) findViewById(R.id.button38);
		button42 = (Button) findViewById(R.id.button42);
		button39 = (Button) findViewById(R.id.button39);
		button40 = (Button) findViewById(R.id.button40);
		sketch = (Button) findViewById(R.id.sketch);
		kernelaudor = (Button) findViewById(R.id.kernelaudor);
		lukypatcher = (Button) findViewById(R.id.lukypatcher);
		apkeditor = (Button) findViewById(R.id.apkeditor);
		linearkayamustbutto = (LinearLayout) findViewById(R.id.linearkayamustbutto);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		youtube = (Button) findViewById(R.id.youtube);
		chrome = (Button) findViewById(R.id.chrome);
		whatsapp = (Button) findViewById(R.id.whatsapp);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		
		ayar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.android.settings"); startActivity(it); 
				
			}
		});
		
		saat1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.lge.clock"); startActivity(it); 
				
			}
		});
		
		button45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.lge.music"); startActivity(it); 
				
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.lge.camera"); startActivity(it); 
				
			}
		});
		
		hesap.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.android.calculator2"); startActivity(it); 
				
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.android.gallery3d"); startActivity(it); 
				
			}
		});
		
		kumanda.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.lge.qremote"); startActivity(it); 
				
			}
		});
		
		playstore.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.android.vending"); startActivity(it); 
				
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.lge.qmemoplus"); startActivity(it); 
				
			}
		});
		
		rehber.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.android.contacts"); startActivity(it); 
				
			}
		});
		
		button31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.google.android.gm"); startActivity(it); 
				
			}
		});
		
		harita.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps"); startActivity(it); 
				
			}
		});
		
		mesaj.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.android.mms"); startActivity(it); 
				
			}
		});
		
		button44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.lge.launcher2"); startActivity(it); 
				
			}
		});
		
		button19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.lge.sizechangable.weather"); startActivity(it); 
				
			}
		});
		
		button18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.flashlightvpn.mobile_app"); startActivity(it); 
				
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.spotify.music"); startActivity(it); 
				
			}
		});
		
		photomath.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.microblink.photomath"); startActivity(it); 
				
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("ru.zdevs.zarchiver"); startActivity(it); 
				
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.besome.sketch"); startActivity(it); 
				
			}
		});
		
		button43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.my.newproject38"); startActivity(it); 
				
			}
		});
		
		button41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.ftpcafe.trial"); startActivity(it); 
				
			}
		});
		
		button32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.ebook.sketchware"); startActivity(it); 
				
			}
		});
		
		button37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("org.cyanogenmod.audiofx"); startActivity(it); 
				
			}
		});
		
		button36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.mobillium.papara"); startActivity(it); 
				
			}
		});
		
		button34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.mobillium.paparb"); startActivity(it); 
				
			}
		});
		
		button33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.mobillium.paparc"); startActivity(it); 
				
			}
		});
		
		button35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.rhmsoft.edit"); startActivity(it); 
				
			}
		});
		
		goz.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.panagola.app.bluef"); startActivity(it); 
				
			}
		});
		
		button38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.xmod.developer.inc"); startActivity(it); 
				
			}
		});
		
		button42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.codes.brary"); startActivity(it); 
				
			}
		});
		
		button39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("in.sumeetlubal.aweandroid.aweandroid"); startActivity(it); 
				
			}
		});
		
		button40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("air.com.fernus.apotemi.acikkitap"); startActivity(it); 
				
			}
		});
		
		sketch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.besome.sketci"); startActivity(it); 
				
			}
		});
		
		kernelaudor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.grarak.kerneladiutor"); startActivity(it); 
				
			}
		});
		
		lukypatcher.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.android.vending.billing.InAppBillingService.COIN"); startActivity(it); 
				
			}
		});
		
		apkeditor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent it = getPackageManager().getLaunchIntentForPackage("com.gmail.heagoo.apkeditor.pro"); startActivity(it); 
				
			}
		});
		
		youtube.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		chrome.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		whatsapp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
		_save();
		textview11.setVisibility(View.GONE);
		button18.setVisibility(View.GONE);
		
		Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#006064"));
		xxxxx = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_getbattery();
						_load();
						BatteryManager bm = (BatteryManager)getSystemService(BATTERY_SERVICE);
						int batLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
						textview6.setText(Integer.toString(batLevel));
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						
						if (textview1.getText().toString().equals("")) {
							
							
							
						}
						t1 = Calendar.getInstance();
						textview1.setText(new SimpleDateFormat("HH:mm").format(t1.getTime()));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(xxxxx, (int)(250), (int)(250));
		myBatInfoReceiver = new mBatInfoReceiver(); this.registerReceiver(this.myBatInfoReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED)); }
	
	private class mBatInfoReceiver extends BroadcastReceiver{ int temp = 0; float get_temp(){ return (float)(temp / 10); } @Override public void onReceive(Context arg0, Intent intent) { temp = intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE,0); } }
	
	private mBatInfoReceiver myBatInfoReceiver;
	
	private void _finishactv() {
		
		
		
		m1 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(m1, (int)(0), (int)(1000));
		m2 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(m2, (int)(0), (int)(1000));
		//Copied From Universal SketchCode Premium(6.1).
		Intent startupIntent = new Intent(Intent.ACTION_MAIN); 		startupIntent.addCategory(Intent.CATEGORY_LAUNCHER);  		final android.content.pm.PackageManager pm = getPackageManager(); 		List<android.content.pm.ResolveInfo> activities = pm.queryIntentActivities(startupIntent,0);   		Collections.sort(activities, new Comparator<android.content.pm.ResolveInfo>() {  				public int compare(android.content.pm.ResolveInfo a, android.content.pm.ResolveInfo b) {  					android.content.pm.PackageManager pm = getPackageManager();  					return String.CASE_INSENSITIVE_ORDER.compare(  						a.loadLabel(pm).toString(),  						b.loadLabel(pm).toString());  			}  		});   		ArrayAdapter<android.content.pm.ResolveInfo> adapter = new ArrayAdapter<android.content.pm.ResolveInfo>(  			this, android.R.layout.simple_list_item_1, activities) {  			public View getView(int pos, View convertView, ViewGroup parent) { TextView tv = new TextView(MainActivity.this);  				android.content.pm.ResolveInfo ri = getItem(pos);  			tv.setText(ri.loadLabel(pm));  	LinearLayout lin = new LinearLayout(MainActivity.this);ImageView iv = new ImageView(MainActivity.this);iv.setImageDrawable(ri.loadIcon(pm));lin.addView(iv);lin.addView(tv);tv.setGravity(Gravity.CENTER_VERTICAL);tv.setPadding(16,0,0,0);tv.setTextSize(20);tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT ));LinearLayout.LayoutParams p =	new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.MATCH_PARENT);p.width = 150;p.height = 150;p.bottomMargin = 4;p.topMargin = 4;iv.setLayoutParams(p);lin.setPadding(80,80,80,80);return lin;  		}  	};  		listview1.setAdapter(adapter); 		 		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {  				@Override 				public void onItemClick(AdapterView adapter, View v, int position, long id) 				{ 					android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo)adapter.getItemAtPosition(position);  					android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;  					if (activityInfo == null) return;  					Intent i = new Intent(Intent.ACTION_MAIN);  					i.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);  					startActivity(i); 			}  			 	});;
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _load () {
		
	}
	
	
	private void _save () {
		data.edit().putString("data", "").commit();
	}
	
	
	private void _getbattery () {
		float temp = myBatInfoReceiver.get_temp(); derece = temp + Character.toString ((char) 176) + " C";
		xx.setText(derece);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
