import java.util.*;

class animal{
static Scanner scan = new Scanner(System.in);
private int lifeExpentancy;
private int weight;
private char gender;
private String name;
private String type;
public animal(char gender,int lifeExpentancy,String name,int weight,String type){
this.gender = gender;
this.lifeExpentancy = lifeExpentancy;
this.name = name;
this.weight = weight;
this.type = type;
}
public void Display(){
char option = scan.next().charAt(0);
switch(option){
case'm':
System.out.print("");
break;
case'f':

break;

case'n':

break;

case's':

break;

}
}

}
//-----
class pets extends animal{
private String home;
private boolean bites;
public pets(char gender,int lifeExpentancy,String name,int weight,String type,String home,boolean bites){
super(gender,lifeExpentancy,name,weight,type);
this.home = home;
this.bites = bites;
}
}
//-------
public class main{
public static void main(String[]args){

}
}
