package org.info.comment;

// TODO: Auto-generated Javadoc
/**
 * The Enum CommentCategory.
 */
public enum CommentCategoryE {
	
	/** The service. */
	SERVICE, 
 /** The food item. */
 FOOD_ITEM, 
 /** The complaint. */
 COMPLAINT, 
 /** The prices. */
 PRICES,
 ALL;
 
 @Override
 public String toString(){
     String[] splitNames = name().toLowerCase().split("_");
    StringBuffer fixedName = new StringBuffer();
     
   for(int i = 0; i < splitNames.length; i++) {
       String firstLetter = splitNames[i].substring(0, 1).toUpperCase(),
              restOfWord = splitNames[i].substring(1),
              spacer = i == splitNames.length ? "" : " ";
         
       fixedName.append(firstLetter).append(restOfWord).append(spacer);
     }
     
     return fixedName.toString();
 }

}
