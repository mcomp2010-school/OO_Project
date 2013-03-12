package org.Iterators;

import org.menu.Menu;
import org.menu.MenuItem;


// TODO: Auto-generated Javadoc
/**
 * The Class IngredientMenuIterator.
 */
public class IngredientMenuIterator implements MenuIterator  {

	/** The base. */
	private Menu base;
	
	/** The position. */
	private int position=0;

	/**
	 * Instantiates a new heart healthy menu iterator.
	 *
	 * @param menuObj the menu obj
	 */
	public IngredientMenuIterator(Menu menuObj) {
		// TODO Auto-generated constructor stub
		this.base=menuObj;
		findItem();
	}

	/**
	 * Find item.
	 */
	private void findItem(){	
		while(hasNext()){
			//System.out.println("loop");
			MenuItem aniObj = base.get(position);
			if(aniObj.getMainIngredient().equals("Chicken")){
				//position++;
				//System.out.println(aniObj+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				break;
			}else{
				position++;
			}
		}
		
	}
	
	/* (non-Javadoc)
	 * @see org.Iterators.MenuIterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		//System.out.println("hasNext="+position+"<<<<<<<<<<<<<"+base.size()+"\t"+(position < base.size()));
		if (position < base.size()){
			return true;
		}
		else{
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see org.Iterators.MenuIterator#next()
	 */
	@Override
	public Object next() {	
		//System.out.println("BEFORE="+position+"<<<<<<<<<<<<<"+base.size());
		
		MenuItem aniObj = base.get(position);
		//System.out.println(aniObj);
		
		position++;
		findItem();
		//System.out.println("AFTER="+position+"<<<<<<<<<<<<<"+base.size());
		//System.out.println("============================");
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
