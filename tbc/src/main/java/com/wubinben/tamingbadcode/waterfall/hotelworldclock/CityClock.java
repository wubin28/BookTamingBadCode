package com.wubinben.tamingbadcode.waterfall.hotelworldclock;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-11-26
 * Time: 下午11:19
 * To change this template use File | Settings | File Templates.
 */
public abstract class CityClock {
    protected int cityTime;
    protected UtcTime utcTime;

    public void setUtcZeroTime(int utcZeroTime) {
        utcTime.setUtcZeroTime(utcZeroTime);
    }

    public abstract void updateCityTime(int utcZeroTime);

    public int getCityTime() {
        return cityTime;
    }
}
