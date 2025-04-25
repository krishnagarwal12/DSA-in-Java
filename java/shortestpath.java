public class shortestpath {
    public static void shortest_path(String path) { //time complexity =O(n)
        int y=0; int x=0;
        for(int i=0; i<path.length(); i++) {
            char dir= path.charAt(i);

            if(dir== 'N') {
                y=y+1;
            }
            else if(dir== 'S') {
                y=y-1;
            }
            else if(dir== 'E') {
                x=x+1;
            }
            else if(dir== 'W') {
                x=x-1;
            }
        }

        int X2 = x*x; //(x2 - x2)^2
        int Y2 = y*y;
        float distance = (float)Math.sqrt(X2+Y2);
        System.out.println(distance);
    }
    public static void main(String args[]) {
        String path = "WNEENESENNN";
        shortest_path(path);
    }
}
