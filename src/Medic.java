public class Medic extends  Hero  {

    private int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность heal" );


    }
    public String increaseExperience() {
        String HP = healPoints +10+"%";
        return HP;
    }

}
