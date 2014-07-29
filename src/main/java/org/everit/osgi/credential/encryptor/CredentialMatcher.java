/**
 * This file is part of Everit - Credential Encryptor API.
 *
 * Everit - Credential Encryptor API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Credential Encryptor API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Credential Encryptor API.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.credential.encryptor;

/**
 * Common interface for credential verification.
 */
public interface CredentialMatcher {

    /**
     * Checks a plain credential against an encrypted one.
     *
     * @param plainCredential
     *            The plain credential to check.
     * @param encryptedCredential
     *            The encrypted credential against which to check the credential.
     * @return <code>true</code> if the credential matches, <code>false</code> if the credential does not match or if
     *         one of the parameters is <code>null</code>.
     */
    boolean match(String plainCredential, String encryptedCredential);

}
