package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//用来判断日期是否属于当前星座
public class TimeCompare {

    private String time;
    private String startTime;
    private String endTime;

    public TimeCompare(String time, String startTime, String endTime) {
        this.time = time;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public Integer TimeCompareResult() {
        String [] timeArray = time.split("-"); // ["18", "03", "01"]
        String newTime = timeArray[1]+"-"+timeArray[2];
        DateFormat df = new SimpleDateFormat("MM-dd");
        try {
            Date dateTime = df.parse(newTime);
            Date dateStartTime = df.parse(startTime);
            Date dateEndTime = df.parse(endTime);
            //特判摩羯座
            if( (Integer.valueOf(timeArray[1]) == 12 && Integer.valueOf(timeArray[2]) >= 22)
                    || (Integer.valueOf(timeArray[1]) == 1 && Integer.valueOf(timeArray[2]) <=19) ){
                return 2;
            }
            if(dateTime.getTime() >= dateStartTime.getTime() && dateTime.getTime() <= dateEndTime.getTime()){
                return 1;
            }
            return 0;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }
}
