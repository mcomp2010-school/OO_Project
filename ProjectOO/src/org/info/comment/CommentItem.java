package org.info.comment;

import java.sql.Timestamp;

// TODO: Auto-generated Javadoc
/**
 * The Class CommentItem.
 */
public class CommentItem {
	
	/** The comment item id. */
	private Integer commentItemID;
	
	/** The time placed. */
	private String timePlaced;
	
	/** The description. */
	private String description;
	
	/** The category. */
	private CommentCategory category;
	
	
	/**
	 * Instantiates a new comment item.
	 *
	 * @param commentItemID the comment item id
	 * @param description the description
	 * @param category the category
	 */
	public CommentItem(Integer commentItemID, String description,
			CommentCategory category) {
		super();
		this.commentItemID = commentItemID;
		
		java.util.Date date= new java.util.Date();
		Timestamp time=new Timestamp(date.getTime());
		timePlaced=time.toString();
		 
		this.description = description;
		this.category = category;
	}


	/**
	 * Gets the comment item id.
	 *
	 * @return the comment item id
	 */
	public Integer getCommentItemID() {
		return commentItemID;
	}


	/**
	 * Gets the time placed.
	 *
	 * @return the time placed
	 */
	public String getTimePlaced() {
		return timePlaced;
	}


	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public CommentCategory getCategory() {
		return category;
	}


	/**
	 * Sets the comment item id.
	 *
	 * @param commentItemID the new comment item id
	 */
	public void setCommentItemID(Integer commentItemID) {
		this.commentItemID = commentItemID;
	}


	/**
	 * Sets the time placed.
	 *
	 * @param timePlaced the new time placed
	 */
	public void setTimePlaced(String timePlaced) {
		this.timePlaced = timePlaced;
	}


	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(CommentCategory category) {
		this.category = category;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommentItem [commentItemID=" + commentItemID + ", timePlaced="
				+ timePlaced + ", description=" + description + ", category="
				+ category + "]";
	}
	
	
	
}
