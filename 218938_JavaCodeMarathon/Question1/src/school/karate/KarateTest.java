package school.karate;

import school.karate.exceptions.FallenException;
import school.karate.exceptions.KnockDownException;

public class KarateTest {
	public static void main(String[] args) {

		KarateMaster object = new KarateMaster();

		try {
		object.knockDown();
		} catch (KnockDownException e) {
			System.out.println(e);
		} catch (FallenException e) {
			System.out.println(e);
		}

	}
}
