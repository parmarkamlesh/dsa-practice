class ParkingSystem {
    private int spaceSmall=0;
    private int spaceBig=0;
    private int spaceMedium=0;

    public ParkingSystem(int big, int medium, int small) {

        this.spaceSmall=small;    
        this.spaceBig=big;    
        this.spaceMedium=medium;    

    }
    
    public boolean addCar(int carType) {
     
        switch(carType){
            case 1:
                    //big car
                    if(this.spaceBig>0){
                        this.spaceBig--;
                        return true;
                    }else{
                        return false;
                    }
                
            case 2:
                    //medium car
                    if(this.spaceMedium>0){
                        this.spaceMedium--;
                        return true;
                    }else{
                        return false;
                    }
            case 3:
                    //small car
                    if(this.spaceSmall>0){
                        this.spaceSmall--;
                        return true;
                    }else{
                        return false;
                    }
        }
        //default false
        return false;
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */