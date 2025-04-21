interface Playable {
void play();
}
class Football implements Playable {
@Override
public void play() {
System.out.println("Running with the ball...");
System.out.println("Scoring a goal!");
}
}
class Volleyball implements Playable {
@Override
public void play() {
System.out.println("Serving the ball...");
System.out.println("Blocking the opponent's attack!");
}
}
class Basketball implements Playable {
@Override
public void play() {
System.out.println("Dribbling the ball...");
System.out.println("Shooting a three-pointer...");
System.out.println("Slam dunking!");
}
}
public class OutdoorGame {
public static void main(String[] args) {
Football football = new Football();
Volleyball volleyball = new Volleyball();
Basketball basketball = new Basketball();
System.out.println(" Playing Sports ");
football.play();
System.out.println("\n------------------------\n");
volleyball.play();
System.out.println("\n------------------------\n");
basketball.play();
}
}