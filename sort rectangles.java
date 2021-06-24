import java.util.*;

class Rectangle implements Comparable<Rectangle>{
    private int l,b,area;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
        this.area=l*b;
    }
    public int compareTo(Rectangle other){
        if(this.area<other.area){
            return 1;
        }else if(this.area==other.area){
            if(this.b<other.b){
                return 1;
            }
        }
        return -1;
    }
    public String toString(){
        return this.l+" "+this.b+" "+this.area;
    }
}
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Rectangle> values = new ArrayList<>();
        for (int ctr = 1; ctr <= N; ctr++) {
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            values.add(new Rectangle(length, breadth));
        }
        Collections.sort(values);
        for (Rectangle rect : values) {
            System.out.println(rect);
        }
    }
}
