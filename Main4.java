public class Main4 {
    String actorName;
    int actorAge;
    int actorHeight;

    public Main4(String name, int age, int height) {
        actorName = name;
        actorAge = age;
        actorHeight = height;
    }
    public static void main(String[] args) {
        Main4 actor1 = new Main4("Patrick Jane", 32, 184);
        System.out.println("Actor name: " + actor1.actorName + ", is " + actor1.actorAge + " years old and is " + actor1.actorHeight);
    }
}
