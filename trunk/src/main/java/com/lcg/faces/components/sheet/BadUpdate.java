package com.lcg.faces.components.sheet;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Class used to represent bad row
 * <p>
 * @author <a href="mailto:mlassiter@lassitercg.com">Mark Lassiter</a>
 * @version $Id:$
 */
public class BadUpdate implements Serializable {

	private static final long serialVersionUID = 1L;

	private int badRowIndex;

	private int badColIndex;

	private Column badColumn;

	private Object badValue;

	private String badMessage;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("badRowIndex", badRowIndex).append("badColIndex", badColIndex)
				.append("badColumn", badColumn).append("badValue", badValue)
				.append("badMessage", badMessage).toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof BadUpdate))
			return false;
		BadUpdate castOther = (BadUpdate) other;
		return new EqualsBuilder().append(badRowIndex, castOther.badRowIndex)
				.append(badColIndex, castOther.badColIndex).isEquals();
	}

	private transient int hashCode;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (hashCode == 0) {
			hashCode = new HashCodeBuilder().append(badRowIndex).append(badColIndex).toHashCode();
		}
		return hashCode;
	}

	public BadUpdate() {
		super();
	}

	public BadUpdate(int badRowIndex, int badColIndex, Column badColumn, Object badValue,
			String badMessage) {
		this.badRowIndex = badRowIndex;
		this.badColIndex = badColIndex;
		this.badColumn = badColumn;
		this.badValue = badValue;
		this.badMessage = badMessage;
	}

	/**
	 * The badRowIndex value.
	 * <p>
	 * @return the badRowIndex
	 */
	public int getBadRowIndex() {
		return badRowIndex;
	}

	/**
	 * Updates the badRowIndex value.
	 * <p>
	 * @param badRowIndex
	 *            the badRowIndex to set
	 */
	public void setBadRowIndex(int badRowIndex) {
		this.badRowIndex = badRowIndex;
	}

	/**
	 * The badColIndex value.
	 * <p>
	 * @return the badColIndex
	 */
	public int getBadColIndex() {
		return badColIndex;
	}

	/**
	 * Updates the badColIndex value.
	 * <p>
	 * @param badColIndex
	 *            the badColIndex to set
	 */
	public void setBadColIndex(int badColIndex) {
		this.badColIndex = badColIndex;
	}

	/**
	 * The badColumn value.
	 * <p>
	 * @return the badColumn
	 */
	public Column getBadColumn() {
		return badColumn;
	}

	/**
	 * Updates the badColumn value.
	 * <p>
	 * @param badColumn
	 *            the badColumn to set
	 */
	public void setBadColumn(Column badColumn) {
		this.badColumn = badColumn;
	}

	/**
	 * The badValue value.
	 * <p>
	 * @return the badValue
	 */
	public Object getBadValue() {
		return badValue;
	}

	/**
	 * Updates the badValue value.
	 * <p>
	 * @param badValue
	 *            the badValue to set
	 */
	public void setBadValue(Object badValue) {
		this.badValue = badValue;
	}

	/**
	 * The badMessage value.
	 * <p>
	 * @return the badMessage
	 */
	public String getBadMessage() {
		return badMessage;
	}

	/**
	 * Updates the badMessage value.
	 * <p>
	 * @param badMessage
	 *            the badMessage to set
	 */
	public void setBadMessage(String badMessage) {
		this.badMessage = badMessage;
	}

	/**
	 * The hashCode value.
	 * <p>
	 * @return the hashCode
	 */
	public int getHashCode() {
		return hashCode;
	}

	/**
	 * Updates the hashCode value.
	 * <p>
	 * @param hashCode
	 *            the hashCode to set
	 */
	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
	}

}
