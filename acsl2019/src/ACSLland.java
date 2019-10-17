import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class ACSLland {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/samriddhikumar/IdeaProjects/Samriddhi---Java-Homework/acsl2019/ACSLlandINPUTS"));
        while(scan.hasNext()) {
            String inp = scan.nextLine();
            String inps[] = inp.split(",");
            String start = inps[0];
            String end = inps[1];
            String car = inps[2];
            String road = inps[3];
            Double gascost = Double.valueOf(inps[4]);
            System.out.println(distance(start, end) + ", " + time(distance(start, end), road) + ", " + totalcost(distance(start, end), car, gascost));
        }



    }

    public static int distance(String start, String end){
        HashMap<String, Integer> cities = new HashMap<>();
        cities.put("A",1);
        cities.put("B",2);
        cities.put("C",3);
        cities.put("D",4);
        cities.put("E",5);
        cities.put("F",6);
        cities.put("G",7);
        Integer city[] = {0,450,140,120,320,250,80};
        int starting = cities.get(start);
        int ending = cities.get(end) - 1;
        int totaldistance = 0;
        while(ending >= starting){
            totaldistance += city[ending];
            ending -= 1;
        }
        return totaldistance;
    }

    public static String time(int distance, String road){
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.UP);

        HashMap<String, Integer> roads = new HashMap<>();
        roads.put("I",65);
        roads.put("H",60);
        roads.put("M",55);
        roads.put("S",45);
        int speed = roads.get(road);
        int hour = distance/speed;
        String hours = "";
        if(hour <= 9){
            hours = hours + "0" + hour;
        }
        else{
            hours = hours + hour;
        }
        String mins = "";
        double mm = (double) distance/speed; //the full time a.bbb
        double m =  mm - hour; //just the .bbb
        String minss = (df.format(60*m)); //60*.bbb = 32.73
        //minss.substring(0,minss.indexOf(".")))
        double minn = (Math.round(60*m));
        int min = (int) Math.rint(minn);
        if(min <= 9){
            mins = mins + "0" + min;
        }
        else{
            mins = mins + min;
        }
        return hours + ":" + (mins);

    }

    public static String totalcost(int distance, String car, Double gascost){
        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("C",28);
        cars.put("M",25);
        cars.put("F",22);
        cars.put("V",20);
        DecimalFormat df = new DecimalFormat("#.##");
        int c = cars.get(car);
        double tc = (double) distance/c;
        double tcost = tc*gascost;
        String totcost = df.format(tcost);
        if(Integer.parseInt(totcost.substring(totcost.indexOf(".")+1))<=9){
            totcost = totcost + "0";
        }
        return "$" + totcost;
    }
}
