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

import java.util.Objects;

/**
 * A bit vector.
 *
 * <p>Typically, just an unsigned 64-bit integer value.
 *
 * @since 0.1.0
 */
@SuppressWarnings("unused")
public class BitVec {

	/**
	 * Unsigned 64-bit integer value.
	 */
	protected long value;

	/**
	 * Initialize a {@code BitVec} instance.
	 *
	 * <p>Wraps {@link BitVec#BitVec(long)} with 0.
	 */
	public BitVec() {
		this(0);
	}

	/**
	 * Initialize a {@code BitVec} instance.
	 *
	 * @param value	value of the bit vector
	 */
	public BitVec(long value) {
		this.value = value;
	}

	/**
	 * Get this value.
	 *
	 * @return value of this bit vector
	 */
	public final long getValue() {
		return value;
	}

	/**
	 * Wrap {@link BitVar#get(long)}.
	 *
	 * @param bitVar 	instance of the {@code BitVar} class
	 * @return 			value of the bit variable
	 *
	 * @see BitVar#get(long, int, long)
	 */
	public final long get(BitVar bitVar) {
		Objects.requireNonNull(bitVar);

		return bitVar.get(this.value);
	}

	/**
	 * Wrap {@link BitVar#set(long, long)}.
	 *
	 * @param bitVar	instance of the {@code BitVar} class
	 * @param value		value to set the bit variable with
	 *
	 * @see BitVar#set(long, int, long, long)
	 */
	public final void set(BitVar bitVar, long value) {
		Objects.requireNonNull(bitVar);

		this.value = bitVar.set(this.value, value);
	}

	@Override
	public final String toString() {
		return Long.toUnsignedString(this.value);
	}

	@Override
	public final boolean equals(Object obj) {
		if (obj instanceof BitVec) {
			BitVec other = (BitVec) obj;

			return super.equals(obj)
					|| Long.compareUnsigned(this.value, other.value) == 0;
		}

		return false;
	}

	@Override
	public final int hashCode() {
		return Long.hashCode(this.value);
	}
}
