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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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

	/**
	 * Gets the comments by category.
	 *
	 * @param Category the category
	 * @return the comments by category
	 */
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
	
	
	/**
	 * Gets the comments by category str.
	 *
	 * @param Category the category
	 * @return the comments by category str
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((commentID == null) ? 0 : commentID.hashCode());
		result = prime * result
				+ ((commentItems == null) ? 0 : commentItems.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (commentID == null) {
			if (other.commentID != null)
				return false;
		} else if (!commentID.equals(other.commentID))
			return false;
		if (commentItems == null) {
			if (other.commentItems != null)
				return false;
		} else if (!commentItems.equals(other.commentItems))
			return false;
		return true;
	}
	
	
}
