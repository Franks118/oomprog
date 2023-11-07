//Franco Capangpangan

import java.util.*;
public class enumeration{
enum Pets{
Cat,
Dog,
Hamster,
Fish,
Birds,
Capebara
}
static Scanner scan =  new Scanner(System.in);
//best pet combination
public static void main(String args[]){
int option = 6;
do{
System.out.print(" \n");
System.out.print("\nprint all the animals available-press 1");
System.out.print("\npress 2 for the best pairs for dog");
System.out.print("\npress 3 for best pair for cats");
System.out.print("\nress 4 for best pair for hamster");
System.out.print("\npress 5 for best pair for Fish");
System.out.print("\npress 6 for best pair for Bird");
System.out.print("\npress 7 for best pair for Capebara");
System.out.print("\nPress 0 to exit\n");
System.out.print(" \n");
option = scan.nextInt();
            switch (option) {
            case 1:
            for(Pets g:Pets.values()){
             System.out.print(g+" \n");
               }

             break;
            case 2:
            System.out.print("Every animal :)\n");
             System.out.print("Because dogs are very friendly and cuddly creatures \n");
             
             break;
            case 3:
            Pets at=Pets.Capebara; 
            Pets og=Pets.Dog;
            System.out.print(at+" and "+og);
            System.out.print("\nthrough domestication dogs and cats learn to live well with humans\n");
            System.out.print("Capebara are  jsut pretty chill aninmals");
       
             
             break;
            case 4:
             Pets ato=Pets.Birds; 
            Pets ogg=Pets.Dog;
        

             System.out.print(ato+" and "+ogg);

              
             break;
            case 5:
              Pets atot=Pets.Capebara; 
            Pets oggg=Pets.Dog;
             System.out.print(atot+" and "+oggg);

              
             break;
            case 6:
              Pets atott=Pets.Capebara; 
            Pets ogggg=Pets.Dog;
             System.out.print(atott+" and "+ogggg);

              
             break;
             case 7:
               System.out.print("\nEvery animal literally\n");
               System.out.print("\nCapebara are  jsut pretty chill aninmals\n");
             break;

            case 0:
            
             break;
            }


}while(option != 0);


}

}

