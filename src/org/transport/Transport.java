package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	public static void main(String[] args) {
		System.out.println(" Transport Form");
Road r = new Road();
r.main(args);
Air a = new Air();
a.main(args);
Water w = new Water();
w.main(args);
	}

}
