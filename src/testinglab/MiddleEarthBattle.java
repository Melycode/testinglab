package testinglab;
import java.util.HashMap;

public class MiddleEarthBattle {

	HashMap<String, Integer> kindArmy = new HashMap<>(); 
	HashMap<String, Integer> evilArmy = new HashMap<>(); 
	
	
	public MiddleEarthBattle() {
		
		kindArmy.put("Pelosos", 1); 
		kindArmy.put("Sureños buenos", 2); 
		kindArmy.put("Enanos", 3); 
		kindArmy.put("Númenóreanos", 4); 
		kindArmy.put("Elfos", 5); 
	
		
		evilArmy.put("Sureños malos", 2); 
		evilArmy.put("Orcos", 2); 
		evilArmy.put("Goblins", 2); 
		evilArmy.put("Huargos", 3); 
		evilArmy.put("Trolls", 5); 
	}
	
	public void battleForTheMiddleEarth(HashMap<String, Integer> kindBattle, HashMap<String, Integer> evilBattle) {
		
		int kindPoints = 0;
		int evilPoints = 0; 
		
		for (HashMap.Entry<String, Integer> entry : kindBattle.entrySet()) {
            kindPoints += entry.getValue() * kindArmy.get(entry.getKey());
        }

        for (HashMap.Entry<String, Integer> entry : evilBattle.entrySet()) {
            evilPoints += entry.getValue() * evilArmy.get(entry.getKey());
        }

        String kindName = kindBattle.keySet().iterator().next();
        String evilName = evilBattle.keySet().iterator().next();

        if (kindPoints > evilPoints) {
            System.out.println(kindName + " ganan a " + evilName);
        } else if (evilPoints > kindPoints) {
            System.out.println(kindName + " pierden contra " + evilName);
        } else {
            System.out.println(kindName + " empatan contra " + evilName);
        }
    }
}
	
