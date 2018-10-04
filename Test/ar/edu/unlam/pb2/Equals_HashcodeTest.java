package ar.edu.unlam.pb2;

import org.junit.Assert;
import org.junit.Test;


public class Equals_HashcodeTest {

	@Test
	public void testQue2PersonasSonIgualesPorTenerElMismoDNI() {
		Equals_Hashcode persona1 = new Equals_Hashcode("pablo", "teruel", 1234, 23);
		Equals_Hashcode persona2 = new Equals_Hashcode("Lucio", "Challiot", 1234, 45);
		Integer hash = persona1.hashCode();
		System.out.println(hash);
		Integer hash2 = persona2.hashCode();
		System.out.println(hash2);
		Assert.assertTrue(persona1.equals(persona2));
		
	}

}
