package de.fhro.inf.prg3.a04.collections;

public interface SimpleList extends Iterable {
	/**
	 * Add a given object to the back of the list.
	 */
	void add(Object o);

	/**
	 * @return current size of the list
	 */
	int size();

	/**
	 * Generate a new list using the given filter instance.
	 * @return a new, filtered list
	 */
	SimpleList filter(SimpleFilter filter);
}
