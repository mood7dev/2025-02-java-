package Starcraft;

public class SiegeTank extends GroundUnit{
    private boolean siegeMode;

    public void toggleSiegeMode() {
        //이 메소드를 호출할 때마다 siegeMode 값이 true > false > true

        siegeMode = !siegeMode;
        }
    }
