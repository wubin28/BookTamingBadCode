package com.wubinben.tamingbadcode.waterfall.hotelworldclock;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-11-27
 * Time: 上午12:16
 * To change this template use File | Settings | File Templates.
 */
public class SydneyClock extends CityClock {
    private static final int UTC_OFFSET = 10;

    @Override
    protected int convertCityTimeToUtcZeroTime(int cityTime) {
        return keepInRange0To24(cityTime - UTC_OFFSET);
    }

    @Override
    public void updateCityTime(int utcZeroTime) {
        cityTime = keepInRange0To24(utcZeroTime + UTC_OFFSET);
    }
}
