package practice;

public class ParkingSystemLeetCode {
    private  int big;
    private  int medium;
    private  int small;

    int bigUsedCount = 0;
    int mediumUsedCount = 0;
    int smallUsedCount = 0;


    public ParkingSystemLeetCode(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType){
            case 1:
                if(big>0){
                    big--;
//                    System.out.println("bigUsedCount "+bigUsedCount);
                    return true;
                }
                else {
                    return false;
                }
            case 2:
                if(medium>0){
                    medium--;
//                    System.out.println("mediumUsedCount "+mediumUsedCount);
                    return true;
                }
                else {
                    return false;
                }
            case 3:
                if(small>0){
                    small--;
//                    System.out.println("smallUsedCount "+smallUsedCount);
                    return true;
                }
                else {
                    return false;
                }
            default:
                System.out.println("inside the default");
                return false;
        }

    }
}
