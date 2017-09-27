public class HydroCarbon {
	private int _hydrogenAtoms, _carbonAtoms;

	/**
	 * @param hAtoms
	 * @param cAtoms
	 */
	public HydroCarbon(int hAtoms, int cAtoms) {
		_hydrogenAtoms = hAtoms;
		_carbonAtoms = cAtoms;
	}
	
	/**
	 * @return The molecular weight of this hydrocarbon
	 */
	public int computeMolecularWeight() {
		return 12*_carbonAtoms + _hydrogenAtoms;
	}

	/**
	 * @return The number of hydrogen atoms in this hydrocarbon
	 */
	public int getHydrogen() {
		return _hydrogenAtoms;
	}

	/**
	 * @param c Value for the number of carbon atoms
	 */
	public void setCarbon(int c) {
		_carbonAtoms = c;
	}
}