/**
 * This file is part of Everit - Password Encryptor API.
 *
 * Everit - Password Encryptor API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Password Encryptor API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Password Encryptor API.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.password.encryptor;

/**
 * Common interface for password encryption and verification.
 */
public interface PasswordEncryptor {

    /**
     * Encrypts a password.
     *
     * @param plainPassword
     *            The password to be encrypted. Cannot be <code>null</code>.
     * @return the resulting digest.
     */
    String encryptPassword(final String plainPassword);

    /**
     * Checks a plain password against an encrypted one.
     *
     * @param plainPassword
     *            The plain password to check.
     * @param encryptedPassword
     *            The encrypted password against which to check the password.
     * @return <code>true</code> if the passwords match, <code>false</code> if the passwords do not match or if one of
     *         the parameters is <code>null</code>.
     */
    boolean matchPasswords(String plainPassword, String encryptedPassword);

}
