

import junit.framework.TestCase;

/**
 * JUnit test for the Box class.
 */
public class CubeTest extends TestCase {

	private Cube cube1 = null;
	private double sideLength1 = 3.0;

	private Cube cube2 = null;
	private double sideLength2 = 5.0;

	/**
	 * Constructor.
	 */
	public CubeTest() {
		super("BoxTest");
		cube1 = new Cube(sideLength1);
		cube2 = new Cube(sideLength2);
	}

	public void testGetSideLength() {
		assertEquals(3.0, cube1.getSideLength());
		assertEquals(5.0, cube2.getSideLength());
	}

	public void testComputeSurfaceArea() {
		assertEquals(54.0, cube1.computeSurfaceArea());
		assertEquals(150.0, cube2.computeSurfaceArea());
	}

	public void testComputeVolume() {
		assertEquals(27.0, cube1.computeVolume());
		assertEquals(125.0, cube2.computeVolume());
	}

	public void testComputeWeight() {
		assertEquals(27.0, cube1.computeWeight());
		assertEquals(125.0, cube2.computeWeight());
	}

	public void testComputeWeightWithDensity() {
		assertEquals(40.5, cube1.computeWeight(1.5));
		assertEquals(93.75, cube2.computeWeight(0.75));
	}

	public void testToString() {
		assertEquals(
				"Cube: side length: 3.0, volume: 27.0, surface area: 54.0",
				cube1.toString());
		assertEquals(
				"Cube: side length: 5.0, volume: 125.0, surface area: 150.0",
				cube2.toString());
	}
}
