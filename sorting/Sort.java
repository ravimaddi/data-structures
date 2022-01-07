package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
// By implementing a comparable interface on the class and overriding the compareTo method which takes one argument.

class Point implements Comparable<Point> {
  int x;
  int y;

  Point(int a, int b) {
    x = a;
    y = b;
  }

  public int compareTo(Point p) {
    return this.x - p.x;
  }
}
// By having another class which implements Comparator and pass the object of the class to array.sort(arr,new mycom())
class MyComp implements Comparator<Point> {
  public int compare(Point a, Point b) {
    return a.x - b.x;
  }
}

public class Sort {
  public static void main(String args[]) {
    int arr[] = { 9, 4, 8, 10, 3, 1 };
    Arrays.sort(arr);
    for (int i = 0; i < 6; i++) {
      System.out.println(arr[i]);
    }
    Point pointArr[] = { new Point(3, 5), new Point(1, 4), new Point(10, 20), new Point(5, 9) };
    Arrays.sort(pointArr);
    for (int i = 0; i < 4; i++) {
      System.out.println(pointArr[i].x + ", " + pointArr[i].y);
    }
    Point pointArr1[] = { new Point(4, 5), new Point(3, 4), new Point(19, 20) };
    Arrays.sort(pointArr1, new MyComp());
    Arrays.sort(pointArr, Collections.reverseOrder());
    for (int i = 0; i < 4; i++) {
      System.out.println(pointArr[i].x + "," + pointArr[i].y);
    }
    for (int i = 0; i < 4; i++) {
      System.out.println(pointArr1[i].x + ", " + pointArr1[i].y);
    }
  }
}
