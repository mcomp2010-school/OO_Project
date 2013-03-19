package org.info.comment;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// TODO: Auto-generated Javadoc
/**
 * The Class Comment.
 */
public class Comment {

	/** The comment id. */
	private Integer commentID = 0;

	/** The comment items. */
	private TreeMap<Integer, CommentItem> commentItems = new TreeMap<Integer, CommentItem>();

	/**
	 * Adds the comment.
	 * 
	 * @param description
	 *            the description
	 * @param category
	 *            the category
	 * @return the integer
	 */
	public Integer addComment(String description, CommentCategory category) {
		commentItems.put(commentID, new CommentItem(commentID, description,
				category));
		commentID++;
		return commentID - 1;
	}

	/**
	 * Gets the comment by id.
	 * 
	 * @param inputID
	 *            the input id
	 * @return the comment by id
	 */
	public CommentItem getCommentByID(Integer inputID) {
		return commentItems.get(inputID);
	}

	/**
	 * Removes the comment by id.
	 * 
	 * @param inputID
	 *            the input id
	 */
	public void removeCommentByID(Integer inputID) {
		commentItems.remove(inputID);
	}

	@Override
	public String toString() {
		StringBuilder outputBuilder = new StringBuilder();

		for (Map.Entry<Integer, CommentItem> entry : this.commentItems
				.entrySet()) {
			Integer key = entry.getKey();
			CommentItem value = entry.getValue();

			// System.out.println(key + " => " + value);
			outputBuilder.append(value + "\n");
		}

		return outputBuilder.toString().trim();
	}

	public ArrayList<CommentItem> getCommentsByCategory(CommentCategory Category){
		ArrayList<CommentItem> temp=new ArrayList<CommentItem>();
		
		for (Map.Entry<Integer, CommentItem> entry : this.commentItems
				.entrySet()) {
			Integer key = entry.getKey();
			CommentItem value = entry.getValue();

			// System.out.println(key + " => " + value);
			if(value.getCategory().equals(Category)){
				temp.add(value);
			}
			
		}
		
		return temp;
	}
	
	
	public String getCommentsByCategoryStr(CommentCategory Category){
		StringBuilder outputBuilder = new StringBuilder();
		
		for (Map.Entry<Integer, CommentItem> entry : this.commentItems
				.entrySet()) {
			Integer key = entry.getKey();
			CommentItem value = entry.getValue();

			// System.out.println(key + " => " + value);
			if(value.getCategory().equals(Category)){
				outputBuilder.append(value+"\n");
			}
			
		}
		
		return outputBuilder.toString().trim();
	}
}
