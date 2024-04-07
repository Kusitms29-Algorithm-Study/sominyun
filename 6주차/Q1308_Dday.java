import java.util.Scanner;

public class Q1308_Dday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Nyear = scanner.nextInt();
        int Nmonth = scanner.nextInt();
        int Nday = scanner.nextInt();

        int Dyear = scanner.nextInt();
        int Dmonth = scanner.nextInt();
        int Dday = scanner.nextInt();

        //오늘이 y년 m월 d일이고, D-Day가 y+1000년 m월 d일과 같거나 늦다면
        if(Dyear>Nyear+1000 || ((Dyear==Nyear+1000) && ((Dmonth>Nmonth) || (Dmonth==Nmonth && Dday>=Nday)))){
            System.out.print("gg");
        }else{
            System.out.print("D-"+(Days(Dyear,Dmonth,Dday)-Days(Nyear,Nmonth,Nday)));
        }
    }
    //한 달의 날짜 수 계산
    public static int[] DayArray(int year){
        int[] day = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        //윤년 29일 평년 28일
        if(year%4==0){
             day[2]=29;
             if(year%100==0){
                 day[2]=28;
                 if(year%400==0){
                     day[2]=29;
                 }
             }
        }
        return day;
    }
    //1년 1월 1일 ~ year년 month월 day일까지 총 날짜 수
    public static int Days(int year,int month,int day){
        int[] dayCount;
        int days = 0;
        //전년도 까지 합
        for(int yearCount=1;yearCount<=year-1;yearCount++){
            dayCount=DayArray(yearCount);
            for(int monthCount=1;monthCount<=12;monthCount++){
                days += dayCount[monthCount];
            }
        }
        //그 해의 합
        dayCount=DayArray(year);
        for(int monthCount=1;monthCount<month;monthCount++){ //한달 전
            days += dayCount[monthCount];
        }
        days += day; //그 달의 날
        return days;
    }
}
