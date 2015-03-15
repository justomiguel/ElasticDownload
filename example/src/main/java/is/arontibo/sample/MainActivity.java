package is.arontibo.sample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.ButterKnife;
import butterknife.InjectView;
import is.arontibo.library.ElasticDownloadView;


public class MainActivity extends ActionBarActivity {

    @InjectView(R.id.elastic_download_view) ElasticDownloadView mElasticDownloadView;

    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_run_animation) {
            /*if(mTimer != null) {
                mTimer.cancel();
            }
            mTimer = new Timer();
            ProgressTask task= new ProgressTask();
            mTimer.schedule(task, 0);*/

            mElasticDownloadView.startIntro();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class ProgressTask extends TimerTask {

        @Override
        public void run() {

            /*runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    int percentage = (int) Math.floor(Math.random()*100);

                    ProgressDownloadView progressDownloadView = (ProgressDownloadView) findViewById(R.id.progress_download);
                    progressDownloadView.setPercentage(percentage);
                }
            });*/

        }

    }
}
