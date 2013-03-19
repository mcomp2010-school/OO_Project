package org.info.comment;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class CommentDemo.
 */
public class CommentDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Comment Comments=new Comment();
		
		int comment1=Comments.addComment("Food was great", CommentCategory.FOOD_ITEM);
		int comment2=Comments.addComment("Bad Server, Very Slow", CommentCategory.COMPLAINT);
		int comment3=Comments.addComment("Bug in food", CommentCategory.COMPLAINT);
		
		System.out.println(Comments.toString());
		System.out.println("----------------");
		
		String ComplaintComments= Comments.getCommentsByCategoryStr(CommentCategory.COMPLAINT);
		System.out.println(ComplaintComments);
		
		
		
		
	}

	
}
