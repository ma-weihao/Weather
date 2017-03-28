package top.maweihao.weather;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ma on 17-3-28.
 * class for 'per_day_weather_layout'
 */

public class perDayWeatherView extends ConstraintLayout {

    private TextView date;
    private ImageView icon;
    private TextView temperature;

    private int dateSize;
    private int temperatureSize;

    public void initView(Context context) {
        View.inflate(context, R.layout.per_day_weather_layout, this);
        date = (TextView) findViewById(R.id.date_text);
        icon = (ImageView) findViewById(R.id.per_day_weather_icon);
        temperature = (TextView) findViewById(R.id.temperature_text);
    }

    public perDayWeatherView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            initView(context);
        }
    }

    public perDayWeatherView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            initView(context);
        }

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.perDayWeatherView);
        dateSize = typedArray.getDimensionPixelOffset(R.styleable.perDayWeatherView_date_text_size, 10);
        temperatureSize = typedArray.getDimensionPixelOffset(R.styleable.perDayWeatherView_temperature_text_size, 14);
        typedArray.recycle();

        if (!isInEditMode()) {
            date.setTextSize(dateSize);
            temperature.setTextSize(temperatureSize);
        }
    }

    public perDayWeatherView(Context context) {
        super(context);
    }

    public void setDate(String date) {
        this.date.setText(date);
    }

    public void setIcon(int icon) {
        this.icon.setImageResource(icon);
    }

    public void setTemperature(String temperature) {
        this.temperature.setText(temperature);
    }
}
