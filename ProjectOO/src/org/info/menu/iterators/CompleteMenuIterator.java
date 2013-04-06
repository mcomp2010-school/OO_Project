package org.info.menu.iterators;

import java.util.ArrayList;

import org.info.menu.Menu;
import org.info.menu.MenuItem;


// TODO: Auto-generated Javadoc
/**
 * The Class CompleteMenuIterator.
 */
public class CompleteMenuIterator implements MenuIterator {

	/** The base. */
	private Menu base;
	
	/** The position. */
	private int position;

	/**
	 * Instantiates a new complete menu iterator.
	 *
	 * @param menuObj the menu obj
	 */
	public CompleteMenuIterator(Menu menuObj) {
		// TODO Auto-generated constructor stub
		this.base=menuObj;
	}


	/* (non-Javadoc)
	 * @see org.Iterators.MenuIterator#hasNext()
	 */
	@Override
	public boolean hasNext() {

		if (position < base.size())
			return true;
		else
			return false;
	}

	/* (non-Javadoc)
	 * @see org.Iterators.MenuIterator#next()
	 */
	@Override
	public Object next() {
		Object aniObj = base.get(position);
		position++;
		return aniObj;
	}

	/* (non-Javadoc)
	 * @see org.Iterators.MenuIterator#remove()
	 */
	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
