package com.intw.model;

public class ZipCodes implements Comparable<ZipCodes>{

	private Integer lowerBound;
	private Integer upperBound;
	
	/**
	 * @param lowerBound
	 * @param upperBound
	 */
	public ZipCodes(Integer lowerBound, Integer upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	/* 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lowerBound == null) ? 0 : lowerBound.hashCode());
		result = prime * result + ((upperBound == null) ? 0 : upperBound.hashCode());
		return result;
	}
	
	/* 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof ZipCodes))
			return false;
		
		ZipCodes other = (ZipCodes) obj;
		
		if (lowerBound == null) {
			if (other.lowerBound != null)
				return false;
		} else if (!lowerBound.equals(other.lowerBound)) {
			return false;
		}
		
		if (upperBound == null)
			if (other.upperBound != null) {
				return false;
		} else if (!upperBound.equals(other.upperBound)) {
			return false;
		}
		
		return true;
	}
	/**
	 * @return the lowerBound
	 */
	public Integer getLowerBound() {
		return lowerBound;
	}
	/**
	 * @param lowerBound the lowerBound to set
	 */
	public void setLowerBound(Integer lowerBound) {
		this.lowerBound = lowerBound;
	}
	/**
	 * @return the upperBound
	 */
	public Integer getUpperBound() {
		return upperBound;
	}
	/**
	 * @param upperBound the upperBound to set
	 */
	public void setUpperBound(Integer upperBound) {
		this.upperBound = upperBound;
	}

	@Override
	public int compareTo(ZipCodes o) {
		
		if(this.equals(o))
			return 0;
		
		if(	(this.getLowerBound() <= o.getLowerBound() && o.getUpperBound() >= this.getLowerBound()
				&&	o.getLowerBound() <= this.getUpperBound())
			||
			(this.getLowerBound() >= o.getLowerBound() && o.getUpperBound() >= this.getLowerBound())
		  ) {
			
			o.setLowerBound(this.getLowerBound() > o.getLowerBound()? o.getLowerBound() : this.getLowerBound());
			o.setUpperBound(this.getUpperBound() < o.getUpperBound()? o.getUpperBound() : this.getUpperBound());
			return 0;
		} else if(this.getLowerBound() > this.getUpperBound()) {
			return 0;
		}
			
		return 1;
	}

	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + lowerBound + "," + upperBound + "]";
	}	
}
