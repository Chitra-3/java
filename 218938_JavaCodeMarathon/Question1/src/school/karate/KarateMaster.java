package school.karate;

import school.karate.exceptions.FallenException;
import school.karate.exceptions.KnockDownException;

public class KarateMaster {
	public void knockDown() throws KnockDownException {
		for (int i = 0; i < 20; i++) {
			double val = Math.random() % 10;
			if (val > 0.90) {
				throw new KnockDownException("KnockDown Exception is raised");
			} else if (val < 0.30) {
				throw new FallenException("Fallen Exception is raised ");
			} else {
				System.out.println(val);
			}

		}
	}
}
