package cn.edu.gdmec.android.android_datepicker;

import android.location.Criteria;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private int year;
    private int monthOfYear;
    private int dayOfMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        //获得系统的日期
       Calendar calendar = Calendar.getInstance();
        //初始化年月日
        year = calendar.get(Calendar.YEAR);
        monthOfYear = calendar.get(Calendar.MONTH);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        datePicker = (DatePicker)findViewById(R.id.datePicker);
        datePicker.init(year, monthOfYear, dayOfMonth, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String value = year+"年-"+(monthOfYear+1)+"月-"+dayOfMonth+"日";
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();
            }
        });
    }
}
