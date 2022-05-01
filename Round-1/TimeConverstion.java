import java.util.Scanner;

class Time{
    int hr;
    int min;
    boolean isAm;

    Time(int hr,int min){
        hr+=min/60;
        min%=60;
        hr%=12;
        this.hr = hr;
        this.min = min;
    }

    Time(int hr,int min,boolean isAm){
        hr+=min/60;
        min%=60;
        hr%=24;
        this.hr = hr;
        this.min = min;
        this.isAm = isAm;
    }

    Time convert(Time t){
        Time time = new Time((!t.isAm ? (t.hr + 12) : t.hr),t.min);
        return time;
    }

    void print(){
        System.out.println(this.hr + " : "+this.min);
    }
}

public class TimeConverstion {


    public static void main(String[] args) {
        int hr;
        int min;
        boolean isAm;
        String temp;

        Scanner sc= new Scanner(System.in);

        hr = sc.nextInt();
        min = sc.nextInt();
        sc.nextLine();
//        isAm = sc.nextBoolean();
        temp = sc.nextLine();
        if(temp.trim().hashCode() == "am".hashCode()){
            isAm=true;
        }else if(temp.trim().hashCode() == "pm".hashCode()){
            isAm=false;
        }else{
            System.out.println("Please Enter a Valid input");
            return;
        }

        Time t = new Time(hr,min,isAm);

        Time converted = t.convert(t);
        converted.print();
    }

}
