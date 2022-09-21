public class Main {
    public static void main(String[] args) {
       Warrior attack= new Warrior();
      // attack.applySuperAbility();
       Magic magia = new Magic();
       //magia.applySuperAbility();
       Medic heal = new Medic();
      // heal.applySuperAbility();
       Hero[]arrayName={magia, heal,attack,};
        for (int i = 0; i < arrayName.length; i++) {
           arrayName[i].applySuperAbility();
            if (arrayName[i] instanceof Medic) {
                ((Medic) arrayName[i]).increaseExperience();
            }
        }
           Medic Ability = new Medic();
           Ability.increaseExperience();
            System.out.println(" количество единиц лечения увеличивалось на 10%." );
        }

        }



