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
		CommentManager Comments=new CommentManager();
		
		int comment1=Comments.addComment("Food was great", CommentCategoryE.SERVICE);
		int comment2=Comments.addComment("Bad Server, Very Slow", CommentCategoryE.COMPLAINT);
		int comment3=Comments.addComment("Bug in food", CommentCategoryE.COMPLAINT);
		
		commentPrint(Comments);
		//Action-Remove Comment
		Comments.removeCommentByID(comment3);
		commentPrint(Comments);
		//Action-Add New Comments
		Comments.addComment("The chicken was very good", CommentCategoryE.FOOD_ITEM);
		Comments.addComment("Long Waiting Time", CommentCategoryE.COMPLAINT);
		commentPrint(Comments);
	}

	/**
	 * Comment print.
	 *
	 * @param Comments the comments
	 */
	private static void commentPrint(CommentManager Comments) {
		System.out.println("======================");
		System.out.println("Comments:");
		System.out.println(Comments.toString());
		System.out.println("----------------");
		System.out.println("Complaints:");
		String ComplaintComments= Comments.getCommentsByCategoryStr(CommentCategoryE.COMPLAINT);
		System.out.println(ComplaintComments);
	}

	
}
