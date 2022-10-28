/*
 * Copyright 2022 u004
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.u004.bits;

/**
 * A bit variable.
 *
 * <p>Typically, a data class with offset and mask parameters.
 *
 * @since 0.1.0
 */
@SuppressWarnings("unused")
public final class BitVar {

	/**
	 * Offset in the bit vector.
	 */
	private final int offset;

	/**
	 * Mask to normalize the value.
	 */
	private final long mask;

	/**
	 * Initialize a {@code BitVar} instance.
	 *
	 * @param offset	offset in the bit vector
	 * @param mask		mask to normalize the value
	 */
	public BitVar(int offset, long mask) {
		this.offset = offset;
		this.mask = mask;
	}

	/**
	 * Get this offset.
	 *
	 * @return offset in the bit vector
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Get this mask.
	 *
	 * @return mask to normalize the value
	 */
	public long getMask() {
		return mask;
	}

	/**
	 * Wrap {@link BitVar#get(long, int, long)}.
	 *
	 * @param val 	value of the bit vector
	 * @return		value of this bit variable
	 */
	public long get(long val) {
		return get(val, this.offset, this.mask);
	}

	/**
	 * Wrap {@link BitVar#set(long, int, long, long)}.
	 *
	 * @param val 		value of the bit vector
	 * @param newVal    new value to set this bit variable with
	 * @return 			new value of the bit vector
	 */
	public long set(long val, long newVal) {
		return set(val, this.offset, this.mask, newVal);
	}

	/**
	 * Get a value of the bit variable.
	 *
	 * @param val		value of the bit vector
	 * @param offset	offset in the bit vector
	 * @param mask 		mask to normalize the value
	 * @return 			value of the bit variable
	 */
	public static long get(long val, int offset, long mask) {
		return (val >> offset) & mask;
	}

	/**
	 * Set a value of the bit variable.
	 *
	 * @param val 		value of the bit vector
	 * @param offset	offset in the bit vector
	 * @param mask 		mask to normalize the value
	 * @param newVal	new value to set the bit variable with
	 * @return 			new value of the bit vector
	 */
	public static long set(long val, int offset, long mask, long newVal) {
		return (val & ~(mask << offset)) | ((newVal & mask) << offset);
	}
}
