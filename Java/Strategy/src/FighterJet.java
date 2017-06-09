/**
 * Created by Jesper on 2017-06-09.
 */
public class FighterJet {

        private String planeType;
        private double height;
        private int weight;
        private String sound;

        public Flies flyingType;

        FighterJet(){
            flyingType = new FliesReallyFreakingFast();
        }

        public String getPlaneType() {
            return planeType;
        }

        public void setPlaneType(String planeType) {
            this.planeType = planeType;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            if(height > 0)
                this.height = height;
            else
                System.out.println("height must be bigger than 0");
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            if(weight > 0)
                this.weight = weight;
            else
                System.out.println("Weigth must be bigger than 0");
        }

        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }


        public String tryToFly(){
            return flyingType.fly();
        }

        public void setFlyingAbility(Flies newFlyType){
            this.flyingType = newFlyType;
        }

}
