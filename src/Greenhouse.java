import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Greenhouse {
    String name = "Planting Parameters at the CSG";
    boolean sprinklersOn = true;
    int numberOfFlowers = 40;
    String veggie = "cucumber";
    Random random = new Random();
    int randomint = random.nextInt(16);
    int randomNum = random.nextInt(101);



    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
        Plant kimPlant = new Plant();
        Plant myPlant = new Plant();
        kimPlant.numWeeksOld = 3;
        kimPlant.color = "orange";
        kimPlant.isEdible = true;
        myPlant.numWeeksOld = 2;
        myPlant.color = "green";
        myPlant.isEdible = true;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Welcome to " + greenhouse.name + "! It is " + greenhouse.sprinklersOn + " that we are watering plants right now. We have " + greenhouse.numberOfFlowers + " flowers");
        greenhouse.randomReplant();
        greenhouse.veggieOfTheDay();
        greenhouse.countFlowers();
        kimPlant.printInfo();
        myPlant.printInfo();
        greenhouse.changeTemperature();
    }
    public void randomReplant(){
        System.out.println("We are replanting "+ randomint + " vegtables today!");
    }
    public void veggieOfTheDay(){
        System.out.println("Todays chosen veggie is " + veggie);
    }
    public void countFlowers(){
    for (int i = 2; i <= 6; i++) {
        System.out.println(i);
    }
    for (int a = 20; a <= 110; a += 30){
        System.out.println(a);
    }
    for (int z = 8; z >= 0; z += -1){
        System.out.println(z);
    }
    }

    public void changeTemperature(){
        if (randomNum <= 25){
            System.out.println("The temperature has decreased by 2 degrees.");
        }
        if (randomNum > 25 && randomNum < 50){
            System.out.println("The temperature has decreased by 1 degree.");
        }
        if (randomNum >= 50 && randomNum < 75){
            System.out.println("The temperature has increased by 1 degree.");
        }
        if (randomNum >= 75 && randomNum > 100){
            System.out.println("The temperature has increased by 2 degrees.");
        }
    }


    }