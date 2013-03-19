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
		
		int comment1=Comments.addComment("Food was great", CommentCategory.SERVICE);
		int comment2=Comments.addComment("Bad Server, Very Slow", CommentCategory.COMPLAINT);
		int comment3=Comments.addComment("Bug in food", CommentCategory.COMPLAINT);
		
		
		commentPrint(Comments);
		//Action-Remove Comment
		Comments.removeCommentByID(comment3);
		commentPrint(Comments);
		//Action-Add New Comments
		Comments.addComment("The chicken was very good", CommentCategory.FOOD_ITEM);
		Comments.addComment("Long Waiting Time", CommentCategory.COMPLAINT);
		commentPrint(Comments);
	}

	private static void commentPrint(Comment Comments) {
		System.out.println("======================");
		System.out.println("Comments:");
		System.out.println(Comments.toString());
		System.out.println("----------------");
		System.out.println("Complaints:");
		String ComplaintComments= Comments.getCommentsByCategoryStr(CommentCategory.COMPLAINT);
		System.out.println(ComplaintComments);
	}

	
}
