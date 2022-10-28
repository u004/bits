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

package io.github.u004.bits.utils;

/**
 * A bit mask utility.
 *
 * <p>Contain masks of 4-bit to 64-bit unsigned integers.
 *
 * @since 0.1.0
 */
@SuppressWarnings("unused")
public final class UBitMask {

	/**
	 * 64-bit unsigned integer mask.
	 */
	public static final long UINT64 = 0xFFFFFFFFFFFFFFFFL;

	/**
	 * 32-bit unsigned integer mask.
	 */
	public static final long UINT32 = 0xFFFFFFFFL;

	/**
	 * 16-bit unsigned integer mask.
	 */
	public static final int UINT16 = 0xFFFF;

	/**
	 * 8-bit unsigned integer mask.
	 */
	public static final short UINT8 = 0xFF;

	/**
	 * 4-bit unsigned integer mask.
	 */
	public static final byte UINT4 = 0xF;

	private UBitMask() {
		throw new UnsupportedOperationException();
	}
}
