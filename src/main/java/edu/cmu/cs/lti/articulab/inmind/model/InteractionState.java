/*
 * Copyright 2018 Carnegie Mellon University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.cmu.cs.lti.articulab.inmind.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:tshore@cs.cmu.edu">Todd Shore</a>
 * @since 2018-05-24
 *
 */
public final class InteractionState implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -657642453237905939L;

	private final Long endTime;

	private final Long startTime;

	private final List<Long> userModelUpdateTimes;

	public InteractionState(final Long startTime, final Long endTime, final List<Long> userModelUpdateTimes) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.userModelUpdateTimes = userModelUpdateTimes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof InteractionState)) {
			return false;
		}
		final InteractionState other = (InteractionState) obj;
		if (endTime == null) {
			if (other.endTime != null) {
				return false;
			}
		} else if (!endTime.equals(other.endTime)) {
			return false;
		}
		if (startTime == null) {
			if (other.startTime != null) {
				return false;
			}
		} else if (!startTime.equals(other.startTime)) {
			return false;
		}
		if (userModelUpdateTimes == null) {
			if (other.userModelUpdateTimes != null) {
				return false;
			}
		} else if (!userModelUpdateTimes.equals(other.userModelUpdateTimes)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the endTime
	 */
	public Long getEndTime() {
		return endTime;
	}

	/**
	 * @return the startTime
	 */
	public Long getStartTime() {
		return startTime;
	}

	/**
	 * @return the userModelUpdateTimes
	 */
	public List<Long> getUserModelUpdateTimes() {
		return userModelUpdateTimes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (endTime == null ? 0 : endTime.hashCode());
		result = prime * result + (startTime == null ? 0 : startTime.hashCode());
		result = prime * result + (userModelUpdateTimes == null ? 0 : userModelUpdateTimes.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("InteractionState [startTime=");
		builder.append(startTime);
		builder.append(", endTime=");
		builder.append(endTime);
		builder.append(", userModelUpdateTimes=");
		builder.append(userModelUpdateTimes);
		builder.append("]");
		return builder.toString();
	}

}
