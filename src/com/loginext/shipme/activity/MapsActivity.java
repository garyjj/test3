package com.loginext.shipme.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.loginext.shipme.R;

public class MapsActivity extends FragmentActivity {

  private GoogleMap mMap;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    setUpMapIfNeeded();
  }

  @Override protected void onResume() {
    super.onResume();
    setUpMapIfNeeded();
  }

  private void setUpMapIfNeeded() {
    if (mMap == null) {
      mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
          .getMap();
      if (mMap != null) {
        setUpMap();
      }
    }
  }

  private void setUpMap() {
    mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
  }
}
