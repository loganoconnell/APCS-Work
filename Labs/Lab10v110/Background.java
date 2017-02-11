import java.awt.*;

public class Background {
   private Grass grass;
   private Sky sky;
   private Road road;
   private Clouds clouds;
   
   public Background(Graphics g) {
      sky = new Sky(g, Color.blue);
      road = new Road(g, Color.black, Color.yellow, 7);
      grass = new Grass(g, Color.green);
      clouds = new Clouds(g, Color.white);
   }
   
   public void paintBackground(Graphics g) {
      sky.paintSky(g);
      road.paintRoad(g);
      grass.paintGrass(g);
      clouds.paintClouds(g, 5);
   }
}