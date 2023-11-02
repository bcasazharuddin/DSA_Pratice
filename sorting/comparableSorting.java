
import java.util.*;
class Point implements Comparable<Point>{
    int x,y;
    Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p){
        return this.x - p.x;
    }
}


class comparableSorting{
    public static void main(String args[]){
        Point p[] = { new Point(10,20),new Point(3,12), new Point(5,7)};
        Arrays.sort(p);

        for(int i=0;i<p.length;i++){
            System.out.println(p[i].x + " "+p[i].y);
        }
    }
}