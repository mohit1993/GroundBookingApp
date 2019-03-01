package app.prajeet.com.groundbooking;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.List;

public class UserHomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ListView mGroundList;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //mGroundList = findViewById(R.id.ground_list);
        mRecyclerView = findViewById(R.id.ground_list);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        GroundItem groundItem[] = new GroundItem[10];
        groundItem[0] = new GroundItem(R.drawable.ground, R.string.ground1, R.string.groundRent1,
                R.string.groundCity1, R.string.groundDistance1, R.string.book);
        groundItem[1] = new GroundItem(R.drawable.ground, R.string.ground2, R.string.groundRent2,
                R.string.groundCity2, R.string.groundDistance2, R.string.book);
        groundItem[2] = new GroundItem(R.drawable.ground, R.string.ground3, R.string.groundRent3,
                R.string.groundCity3, R.string.groundDistance3, R.string.book);
        groundItem[3] = new GroundItem(R.drawable.ground, R.string.ground4, R.string.groundRent4,
                R.string.groundCity4, R.string.groundDistance4, R.string.book);
        groundItem[4] = new GroundItem(R.drawable.ground, R.string.ground4, R.string.groundRent4,
                R.string.groundCity4, R.string.groundDistance4, R.string.book);
        groundItem[5] = new GroundItem(R.drawable.ground, R.string.ground1, R.string.groundRent1,
                R.string.groundCity1, R.string.groundDistance1, R.string.book);
        groundItem[6] = new GroundItem(R.drawable.ground, R.string.ground2, R.string.groundRent2,
                R.string.groundCity2, R.string.groundDistance2, R.string.book);
        groundItem[7] = new GroundItem(R.drawable.ground, R.string.ground3, R.string.groundRent3,
                R.string.groundCity3, R.string.groundDistance3, R.string.book);
        groundItem[8] = new GroundItem(R.drawable.ground, R.string.ground4, R.string.groundRent4,
                R.string.groundCity4, R.string.groundDistance4, R.string.book);
        groundItem[9] = new GroundItem(R.drawable.ground, R.string.ground4, R.string.groundRent4,
                R.string.groundCity4, R.string.groundDistance4, R.string.book);

        /*GroundListAdapter adapter = new GroundListAdapter(getApplicationContext(), R.layout.ground_item_layout,
                groundItem);
        mGroundList.setAdapter(adapter);*/
        GroundRecyclerViewAdapter adapter = new GroundRecyclerViewAdapter(getApplicationContext(),groundItem);
        mRecyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if(menuItem.getItemId() == R.id.nav_manage) {
            Intent intent = new Intent(this,AddGroundActivity.class);
            startActivity(intent);
        }
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
