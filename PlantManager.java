// ginabase ko lang ni thru sa blueprint, paedit nalang the plantHealthLevel/plantHealth and disease/diseaseLevel basi sala pagintindi ko thank you

package plantitspackage;

public class PlantManager{

    int waterLevel;
    int sunLevel;
    int plantHealthLevel;

    public PlantManager(int waterLevel, int sunLevel, int plantHealthLevel){
        this.waterLevel = waterLevel();
        this.sunLevel = sunLevel();
        this.plantHealthLevel = plantHealthLevel();

    }

    public int getWaterLevel(){
        return waterLevel;

    }

    public int getSunLevel(){
        return sunLevel;
        
    }

    public int getPlantHealthLevel(){
        return plantHealthLevel;
        
    }

    public boolean requiredReached(int waterReq, int sunReq){
        //return() please painsert nalang sang logic

    }

    public void increaseWater(int waterLevel) {
        waterLevel += 10;

    }

    public void increaseSun(int sunLevel) {
        waterLevel += 10;

    }

    public void deductHealth(int plantHealthLevel) { //paedit on this one
        plantHealthLevel -= 10;

    }

    public boolean plantSick(int diseaseLevel, int plantHealthLevel){ //this one too
        return (plantHealthLevel <= diseaseLevel);
    }


}