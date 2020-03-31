package ro.unitbv.javadatatype.lab2;

public class IfElse {

	public static void main(String[] args) {

		System.out.println("Oras-Viteza maxima admisa: " + getMaxSpeedLimitByIfElse("Oras"));
		System.out.println("Drum express-Viteza maxima admisa: " + getMaxSpeedLimitByIfElse("Drum express"));
		System.out.println("Autostrada-Viteza maxima admisa: " + getMaxSpeedLimitByIfElse("Autostrada"));
		System.out.println("Necunoscut-Viteza maxima admisa: " + getMaxSpeedLimitByIfElse("Necunoscut"));
		System.out.println("Zona rezidentiala-Viteza maxima admisa: " + getMaxSpeedLimitByIfElse("Zona Rezidentiala"));
		System.out.println();

		System.out.println("Zona rezidentiala-Viteza maxima admisa: " + getMaxSpeedLimitByIfElseComplex("Zona Rezidentiala"));
		System.out.println("Oras-Viteza maxima admisa: " + getMaxSpeedLimitByIfElseComplex("Oras"));
		System.out.println("Drum express-Viteza maxima admisa: " + getMaxSpeedLimitByIfElseComplex("Drum express"));
		System.out.println("Autostrada-Viteza maxima admisa: " + getMaxSpeedLimitByIfElseComplex("Autostrada"));
		System.out.println("Necunoscut-Viteza maxima admisa: " + getMaxSpeedLimitByIfElseComplex("Necunoscut"));
        System.out.println();
        
		System.out.println("Zona rezidentiala-Viteza maxima admisa:" +getMaxSpeedLimitBySwitch("Zona Rezidentiala"));
		System.out.println("Oras-Viteza maxima admisa: "+getMaxSpeedLimitBySwitch("Oras"));
		System.out.println("Drum express-Viteza maxima admisa: " +getMaxSpeedLimitBySwitch("Drum express"));
		System.out.println("Autostrada-Viteza maxima admisa: " +getMaxSpeedLimitBySwitch("Autostrada"));
		System.out.println("Necunoscut-Viteza maxima admisa: " + getMaxSpeedLimitBySwitch("Necunoscut"));

	}

	public static int getMaxSpeedLimitByIfElse(String roadType) {
		if (roadType == "Zona Rezidentiala") {
			return 30;

		} else if (roadType == "Oras") {
				return 50;
			} else if (roadType == "Drum express") {
					return 100;
				} else if (roadType == "Autostrada") {
						return 130;
				}
				
				

		return 0;
	}

	public static int getMaxSpeedLimitByIfElseComplex(String roadType) {

		if (roadType == "Zona Rezidentiala") {
			return 30;

		} else {
			if (roadType == "Oras") {
				return 50;
			} else {
				if (roadType == "Drum express") {
					return 100;
				} else {
					if (roadType == "Autostrada") {
						return 130;

					}
				}
			}
		}

		return 0;
	}
	
	

	public static int getMaxSpeedLimitBySwitch(String roadType) {

		switch (roadType) {
		

		case "Zona Rezidentiala":
			return 30;
			
		case "Oras":
			return 50;

		case "Drum express":
			return 100;
		
		case "Autostrada":
			return 130;
		
		default:
            return 0;
		}
	}
}
