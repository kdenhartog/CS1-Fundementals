

import junit.framework.TestCase;

/**
 * JUnit test for the Square class.
 */
public class CuboidTest extends TestCase {

	private Cuboid cuboid1 = null;
	private double length1 = 3.0;
	private double width1 = 4.0;
	private double height1 = 5.0;
	private Cuboid cuboid2 = null;
	private double baseLength2 = 1.5;
	private double height2 = 2.0;

	/**
	 * Constructor.
	 */
	public CuboidTest() {
		super("SquareTest");
		cuboid1 = new Cuboid(length1, width1, height1);
		cuboid2 = new Cuboid(baseLength2, height2);
	}

	public void testGetLength() {
		assertEquals(3.0, cuboid1.getLength());
		assertEquals(1.5, cuboid2.getLength());
	}

	public void testGetWidth() {
		assertEquals(4.0, cuboid1.getWidth());
		assertEquals(1.5, cuboid2.getWidth());
	}

	public void testGetHeight() {
		assertEquals(5.0, cuboid1.getHeight());
		assertEquals(2.0, cuboid2.getHeight());
	}

	public void testComputeSurfaceArea() {
		assertEquals(94.0, cuboid1.computeSurfaceArea());
		assertEquals(16.5, cuboid2.computeSurfaceArea());
	}

	public void testComputeVolume() {
		assertEquals(60.0, cuboid1.computeVolume());
		assertEquals(4.5, cuboid2.computeVolume());
	}

	public void testComputeWeight() {
		assertEquals(60.0, cuboid1.computeWeight());
		assertEquals(4.5, cuboid2.computeWeight());
	}

	public void testComputeWeightWithDensity() {
		assertEquals(90.0, cuboid1.computeWeight(1.5));
		assertEquals(2.25, cuboid2.computeWeight(0.5));
	}

	public void testToString() {
		assertEquals("Cuboid: length: 3.0, width: 4.0, height: 5.0",
				cuboid1.toString());
		assertEquals("Cuboid: length: 1.5, width: 1.5, height: 2.0",
				cuboid2.toString());
	}

}
