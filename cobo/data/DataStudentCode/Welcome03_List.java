/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name",
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);

/*
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a latitude: ");
      double lat = sc.nextDouble();
      System.out.println("Stations at " + lat);
*/

      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName() + " at " + ws.getLat() );
         }
      }

/*
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedAtLat(lat)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName() + " at " + ws.getLat() );
         }
      }
*/

foo a = new foo( allstns );
ArrayList<WeatherStation> sortedStations = a.bubbleSort( allstns );
WeatherStation oscar = sortedStations.get(0);
System.out.println( "Lowest station: ");
System.out.println(oscar.getId() + ": " + oscar.getName() + " at " + oscar.getLat() );


   }

}
/* Sorts ArrayList<WeatherStation> by latitude */
class foo {
  private ArrayList<WeatherStation> allStations;

  public foo(ArrayList<WeatherStation> stations){
    allStations = stations;
  }

public static void bubbleSortV( ArrayList<WeatherStation> data ) {
    for (int n = 0; n < data.size() - 1; n++){//Do the following n - 1 times (where n is the number of elements in data:
      for (int i = 0; i < data.size() - 1; i++){//Iterate through the array.
        if ( ( (Double) data.get(i).getLat() ).compareTo( (Double) ( data.get(i + 1)).getLat() ) > 0) {//If a given Comparable is greater than the Comparable after it,
          WeatherStation temp = data.get(i);//swap them.
          data.set(i, data.get(i + 1));
          data.set(i + 1, temp);
          }
        }
      }
    }

  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<WeatherStation> bubbleSort( ArrayList<WeatherStation> input ) {
    ArrayList<WeatherStation> bubbleSorted = new ArrayList<WeatherStation>();
    for (WeatherStation i : input){
      bubbleSorted.add( i );
    }
    bubbleSortV(bubbleSorted);
    return bubbleSorted;
  }

}//end foo
