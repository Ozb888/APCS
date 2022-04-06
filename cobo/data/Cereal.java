public class Cereal {
  private String _Name;
  private int _Vitamins;
  private double _Calories;

   public Cereal(String Name, int Vitamins, double Calories){
     _Name = Name;
     _Vitamins = Vitamins;
     _Calories = Calories;
   }

   public String getName(){
     return _Name;
   }

   public int getVitamins(){
     return _Vitamins;
   }
   public double getCalories(){
     return _Calories;
   }

   public String toString(){
     return _Name + " has " + _Vitamins + " vitamins and " + _Calories + " calories.";
   }

   public static void main(String[] args) {
     Cereal Kellogs = new Cereal("Kellogs", 17, 50.0);
     System.out.println( Kellogs );
   }

}
