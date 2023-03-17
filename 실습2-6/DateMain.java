import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateMain{
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(format1.format(date));
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format2.format(date));
        SimpleDateFormat format3 = new SimpleDateFormat("오늘은 이 달의 W번째 E요일 입니다.",Locale.KOREA);
        System.out.println(format3.format(date));
    }
}
