package String;

/*
* Given a route containing 4 directions (E, W, N, S)
* Find the shortest distance to reach destination
* path = "WNEENESENNN"
*
* approach -
* N -> y+1,
* S -> y-1,
* E -> x+1,
* W -> x-1
*
* then draw a diagram and visualize
* shortest dist = square_root((x2-x1)sqaure + (y2-y1)square);
*/
public class ShortestPath {
    public static double getShortestPath(String str){
        int x=0,y=0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);

            // South
            if(dir=='S'){
                y--;
            }

            // North
            if(dir=='N'){
                y++;
            }

            // East
            if(dir=='E'){
                x++;
            }

            // West
            if(dir=='W'){
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        double res = getShortestPath(s);
        System.out.println("Shortest path is "+res);

    }

}
