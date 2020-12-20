public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()*10);
        int y = (int) Math.floor(Math.random()*10);
        int z = (int) Math.floor(Math.random()*10);

        Circle[] circle = new Circle[3];
        circle[0] = new Circle(x,"red",false);
        circle[1] = new Circle(y,"white",true);
        circle[2] = new Circle(z,"blue",false);

        for (Circle i: circle) {
            System.out.println(i);
        }
        System.out.println("and");

        for (Circle i: circle){
            i.resize(Math.floor(Math.random()*100));
            System.out.println(i);
        }
    }
}
