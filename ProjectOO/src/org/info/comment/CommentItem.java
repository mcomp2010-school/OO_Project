package org.info.comment;

import java.sql.Timestamp;

import org.joda.time.DateTime;

// TODO: Auto-generated Javadoc
/**
 * The Class CommentItem.
 */
public class CommentItem {
	
	/** The comment item id. */
	private Integer commentItemID;
	
	/** The time placed. */
	private DateTime timePlaced;
	
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
		timePlaced = new DateTime();		
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
	public DateTime getTimePlaced() {
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
	public void setTimePlaced(DateTime timePlaced) {
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
				+ new Timestamp(timePlaced.getMillis()) + ", description=" + description + ", category="
				+ category + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result
				+ ((commentItemID == null) ? 0 : commentItemID.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((timePlaced == null) ? 0 : timePlaced.hashCode());
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
		CommentItem other = (CommentItem) obj;
		if (category != other.category)
			return false;
		if (commentItemID == null) {
			if (other.commentItemID != null)
				return false;
		} else if (!commentItemID.equals(other.commentItemID))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (timePlaced == null) {
			if (other.timePlaced != null)
				return false;
		} else if (!timePlaced.equals(other.timePlaced))
			return false;
		return true;
	}
	
	
	
}
